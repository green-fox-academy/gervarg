package com.greenfoxacademy.bankofsimba.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StringWebController {

  @RequestMapping("/enjoyHtml")
  public String printString(Model model) {
    model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoyHtml";
  }
}
