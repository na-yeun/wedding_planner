package com.weddingplanner.partner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PartnerController {

    @GetMapping("/partners")
    public String partners() {
        return "partner/index";
    }
}
