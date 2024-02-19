package com.mycompany.clubalpha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ChipController {
    private final ChipService chipService;

    public ChipController(ChipService chipService) {
        this.chipService = chipService;
    }

    @GetMapping("/chips")
    public String showActiveChips(Model model) {
        List<Automovil> activeChips = chipService.getAllActiveChips();
        model.addAttribute("chips", activeChips);
        return "chips"; // chips.html nombre de plantilla Thymeleaf
    }
}
