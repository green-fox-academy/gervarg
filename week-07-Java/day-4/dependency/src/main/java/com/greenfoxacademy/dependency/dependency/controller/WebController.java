package com.greenfoxacademy.dependency.dependency.controller;

import com.greenfoxacademy.dependency.dependency.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String mainPage() {
    return "main_page";
  }

  @RequestMapping("/useful/colored")
  public String coloredPage(Model model) {
    model.addAttribute("colored", utilityService.randomColor());
    return "colored_page";
  }

  @GetMapping("/useful/email/{email}")
  public String emailPage(@PathVariable(name = "email") String emailAddress, Model model) {
    boolean isValid = utilityService.validateEmail(emailAddress);
    model.addAttribute("isValid", isValid);
    model.addAttribute("emailAddress", emailAddress);
    return "email_page";
  }

  @GetMapping("/useful/encoding")
    public String encoding(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("encode", utilityService.caesar(text, number));
    return "ceasar_page";
  }

  @GetMapping("/useful/decoding/{number}")
  public String decode(@PathVariable(name = "number") int number, Model model) {
   /* model.addAttribute("decode", utilityService.caesar(text, -number));*/
    return "ceasar_page";
  }

}
