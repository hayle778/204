
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/houseform")
    public String loadHouseForm(Model model) {
        model.addAttribute("house", new House());
        return "houseform";
    }

    @PostMapping("/houseform")
    public String processHouseForm(@Valid House house, BindingResult result) {
        if (result.hasErrors()) {
            return "houseform";
        }
        return "houseconfirm";
    }
}