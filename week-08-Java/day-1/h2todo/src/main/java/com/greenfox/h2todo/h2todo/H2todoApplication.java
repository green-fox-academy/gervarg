package com.greenfox.h2todo.h2todo;

import com.greenfox.h2todo.h2todo.models.ToDo;
import com.greenfox.h2todo.h2todo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class H2todoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(H2todoApplication.class, args);
	}

	@Autowired
	private ToDoRepository toDoRepository;

	@Override
	public void run(String... args) throws Exception {
	  toDoRepository.save(new ToDo("How does this magic work?"));
    toDoRepository.save(new ToDo("Is it really working"));
	}

	@RequestMapping(value="/hello")
	@ResponseBody
	public static String hello() {
		return "Hello miert nem mukodsz!";
	}
}
