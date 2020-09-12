package one.philosopherstone.knittingconversions.controllers;

import one.philosopherstone.knittingconversions.models.Brand;
import one.philosopherstone.knittingconversions.models.data.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping("add")
    public String displayAddBrandForm(Model model) {
        model.addAttribute(new Brand());
        return "brand/add";
    }

    @PostMapping("add")
    public String processAddBrandForm(@ModelAttribute Brand newBrand, Model model) {
        brandRepository.save(newBrand);
        return "redirect:";
    }

    @GetMapping ("")
    public String displayBrands(Model model) {
        model.addAttribute("title", "All Brands");
        model.addAttribute("brands", brandRepository.findAll());

        return "brand/index";
    }
}
