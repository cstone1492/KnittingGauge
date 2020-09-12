package one.philosopherstone.knittingconversions.controllers;

import one.philosopherstone.knittingconversions.models.Color;
import one.philosopherstone.knittingconversions.models.data.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("color")
public class ColorController {

    @Autowired
    private ColorRepository colorRepository;

    @GetMapping("add")
    public String displayAddColorForm(Model model) {
        model.addAttribute(new Color());
        return ("color/add");
    }

    @PostMapping("add")
    public String processAddColorForm(@ModelAttribute Color newColor, Model model) {
        colorRepository.save(newColor);
        return "redirect:";
    }

    @GetMapping("")
    public String displayColors(Model model) {
        model.addAttribute("title", "All Colors");
        model.addAttribute("colors", colorRepository.findAll());
        return "color/index";
    }

}
