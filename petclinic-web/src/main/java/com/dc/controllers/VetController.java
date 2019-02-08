package com.dc.controllers;

import com.dc.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = {"/vets"})
@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(value = {"","/","/index","/index.html"}, method = RequestMethod.GET)
    public String listVets(Model model){
        model.addAttribute("vets",this.vetService.findAll());
        return "vets/index";
    }
}
