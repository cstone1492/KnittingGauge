package one.philosopherstone.knittingconversions.controllers;

import one.philosopherstone.knittingconversions.models.Brand;
import one.philosopherstone.knittingconversions.models.Yarn;
import one.philosopherstone.knittingconversions.models.data.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("delete")
    public String displayDeleteBrandForm(Model model) {
        model.addAttribute("brands", brandRepository.findAll());

        return "brand/delete";
    }

    @PostMapping("delete")
    public String processDeleteBrandForm(@RequestParam(required = false)int[] brandIds) {

        if (brandIds != null) {
            for (int id : brandIds) {
                Optional<Brand> brand = brandRepository.findById(id);
                if (brand.isPresent()) {
                    brandRepository.deleteById(id);
                }
            }
        }
        return "redirect:";
    }

}
