package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong count = new AtomicLong(1);

  @RequestMapping("/greeting1")
  public Greeting greeting1() {
    return new Greeting(1, "World");
  }

  @RequestMapping("/greeting2")
  public Greeting greeting2(@RequestParam("id") long id, @RequestParam("name") String content) {
    return new Greeting(id, content);
    // http://localhost:8080/greeting2?id=1&name=Gergo
  }

  @RequestMapping("/greeting3")
  public Greeting greeting3(@RequestParam("name") String content) {
    return new Greeting(count.getAndIncrement(), content);
    //http://localhost:8080/greeting2?name=Gergo
  }
}
