package com.devmvk.jokes.controllers;

import com.devmvk.jokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    public static final String BEAN_CLASS_NAME = "jokesController";

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    public JokesService getJokesService() {
        return jokesService;
    }

    @RequestMapping({"/", "jokeme"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
