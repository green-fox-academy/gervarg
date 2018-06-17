package com.greenfoxacademy.dependency.dependency.model;

import com.greenfoxacademy.dependency.dependency.service.MyColor;
import com.greenfoxacademy.dependency.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BlueColor implements MyColor {

  private final String message = "It is blue in color...";

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log(message);
  }
}
