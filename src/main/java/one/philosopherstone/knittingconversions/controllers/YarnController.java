package one.philosopherstone.knittingconversions.controllers;

import one.philosopherstone.knittingconversions.models.Brand;
import one.philosopherstone.knittingconversions.models.Yarn;
import one.philosopherstone.knittingconversions.models.data.BrandRepository;
import one.philosopherstone.knittingconversions.models.data.ColorRepository;
import one.philosopherstone.knittingconversions.models.data.YarnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("yarn")
public class YarnController {

    @Autowired
    private YarnRepository yarnRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping("")
    public String displayIndex(Model model) {
        return "index";
    }


    @GetMapping("add")
    public String displayAddYarnForm(Model model) {
        model.addAttribute("title", "Add Yarn");
        model.addAttribute(new Yarn());
        model.addAttribute("color", colorRepository.findAll());
        model.addAttribute("brand", brandRepository.findAll());
        return "yarn/add";
    }

    @PostMapping("add")
    public String processAddYarnForm(Model model, @ModelAttribute Yarn newYarn,
                                     Error errors, @RequestParam int color, @RequestParam (required = false) int brand) {

        model.addAttribute("newYarn", newYarn);
        Optional<Brand> yarnBrand = brandRepository.findById(brand);

        yarnRepository.save(newYarn);
        return "redirect";
    }
}
