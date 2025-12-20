
package com.empresa.springwebbasico.controller;

import com.empresa.springwebbasico.service.MensajeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final MensajeService mensajeService;

    // Inyección de dependencias por constructor
    public HomeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("mensaje", mensajeService.obtenerMensaje());
        return "inicio";
    }
}
