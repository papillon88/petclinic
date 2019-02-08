package com.dc.controllers;

import com.dc.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = {"/owners"})
@Controller
public class OwnerController {


    private final OwnerService ownerService;


    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(value = {"","/","/index","/index.html"}, method = RequestMethod.GET)
    public String listOwners(Model model){
        model.addAttribute("owners",this.ownerService.findAll());
        return "owners/index";
    }
}
