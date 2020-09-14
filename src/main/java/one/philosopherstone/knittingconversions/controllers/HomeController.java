package one.philosopherstone.knittingconversions.controllers;

import one.philosopherstone.knittingconversions.models.Yarn;
import one.philosopherstone.knittingconversions.models.Weight;
import one.philosopherstone.knittingconversions.models.Color;
import one.philosopherstone.knittingconversions.models.Brand;
import one.philosopherstone.knittingconversions.models.data.YarnRepository;
import one.philosopherstone.knittingconversions.models.data.WeightRepository;
import one.philosopherstone.knittingconversions.models.data.ColorRepository;
import one.philosopherstone.knittingconversions.models.data.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private WeightRepository weightRepository;

    @Autowired
    private YarnRepository yarnRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "My Yarns");

        return "index";
    }

    @GetMapping("yarn/add")
    public String displayAddYarnForm(Model model) {
        model.addAttribute("title", "Add Yarn");
        model.addAttribute(new Yarn());
        model.addAttribute("colors", colorRepository.findAll());
        model.addAttribute("brands", brandRepository.findAll());
        model.addAttribute("weights", weightRepository.findAll());

        return "yarn/add";
    }

    @PostMapping("yarn/add")
    public String processAddYarnForm(@ModelAttribute Yarn newYarn, Error errors,
                                     Model model,
                                     @RequestParam (required = false) Integer brand,
                                     @RequestParam (required = false) Integer color,
                                     @RequestParam (required = false) Integer weight) {

        model.addAttribute("newYarn", newYarn);
        Optional<Brand> yarnBrand = brandRepository.findById(brand);

        Optional<Color> yarnColor = colorRepository.findById(color);
        //newYarn.setColor(yarnColor);
        Optional <Weight> yarnWeight = weightRepository.findById(weight);
        //newYarn.setWeight(yarnWeight);
        yarnRepository.save(newYarn);
        return "redirect:";
    }
}
