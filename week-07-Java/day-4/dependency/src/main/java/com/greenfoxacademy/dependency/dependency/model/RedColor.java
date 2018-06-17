package com.greenfoxacademy.dependency.dependency.model;

import com.greenfoxacademy.dependency.dependency.service.MyColor;
import com.greenfoxacademy.dependency.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements MyColor {

  private final String message = "It is red in color...";

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log(message);
  }
}
