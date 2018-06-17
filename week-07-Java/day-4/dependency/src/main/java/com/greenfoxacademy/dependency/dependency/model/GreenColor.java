package com.greenfoxacademy.dependency.dependency.model;

import com.greenfoxacademy.dependency.dependency.service.MyColor;
import com.greenfoxacademy.dependency.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreenColor implements MyColor {

  private final String message = "It is green in color...";

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log(message);
  }
}
