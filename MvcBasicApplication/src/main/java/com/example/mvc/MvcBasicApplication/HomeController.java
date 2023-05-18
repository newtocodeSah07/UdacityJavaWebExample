package com.example.mvc.MvcBasicApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.time.Instant;
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHomePage(Model model)
    {
        model.addAttribute("WELCOME", Instant.now().toString());
        return "home";
    }
}
