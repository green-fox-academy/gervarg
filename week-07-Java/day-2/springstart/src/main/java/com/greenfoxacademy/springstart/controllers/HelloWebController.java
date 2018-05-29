package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.ColorGreeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private final String[] HELLOS = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  private AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/web/greeting1")
  public String greeting1(Model model) {
    model.addAttribute("name", " World");
    return "greeting1";
  }

  @RequestMapping("/web/greeting2")
  public String greeting2(Model model,@RequestParam("name") String content) {
    model.addAttribute("name",  content);
    model.addAttribute("id", atomicLong.getAndIncrement());
    return "greeting2";
  }

  @RequestMapping("/web/greeting3")
  public String greeting3(Model model) {
    List<ColorGreeting> greetingList = generateGreeting();
    model.addAttribute("hello", greetingList);
    return "greeting3";
  }

  public List<ColorGreeting> generateGreeting() {
    List<ColorGreeting> greetingList = new ArrayList<>();

    for (String greeting: HELLOS) {
      greetingList.add(new ColorGreeting(greeting));
    }
    return greetingList;
  }

}
