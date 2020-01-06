package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String home() {
        return "home";
    }

    @RequestMapping("/aboutUs")
    public String aboutUs() {
        return "aboutUs";
    }

    @RequestMapping("/popular")
    public String popular() {
        return "popular";
    }

    @RequestMapping("/deals")
    public String deals() {
        return "deals";
    }

    @RequestMapping("/newReleases")
    public String newReleases() {
        return "newReleases";
    }
    
    @RequestMapping("/features")
    public String features() {
        return "features";
    }
    
    @RequestMapping("/contests")
    public String contests() {
        return "contests";
    }
    
    @RequestMapping("/interview")
    public String interview() {
        return "interview";
    }
}
