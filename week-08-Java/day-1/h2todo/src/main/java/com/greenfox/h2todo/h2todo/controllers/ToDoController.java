package com.greenfox.h2todo.h2todo.controllers;

import com.greenfox.h2todo.h2todo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

  private final ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @GetMapping(value = {"/", "list"})
  public String list(Model model) {
    model.addAttribute("toDos",  toDoRepository.findAll());
    return "todoslist";
  }
}
