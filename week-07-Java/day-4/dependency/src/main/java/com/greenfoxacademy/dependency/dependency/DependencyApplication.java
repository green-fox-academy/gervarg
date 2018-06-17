package com.greenfoxacademy.dependency.dependency;

import com.greenfoxacademy.dependency.dependency.service.MyColor;
import com.greenfoxacademy.dependency.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

	@Autowired
	private Printer printer;

	@Autowired
  private MyColor color;

	public static void main(String[] args) {
		SpringApplication.run(DependencyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printer.log("message");
		color.printColor();
	}
}
