package com.greenfoxacademy.springstart;

import java.util.Random;

public class ColorGreeting {
  private int fontSize;
  private String content;
  private String color;
  private Random randomize = new Random();

  public ColorGreeting(String content) {
    color = generateColor();
    fontSize = generateFontSize();
    this.content = content;
  }

  private int generateFontSize() {
    return randomize.nextInt(30) + 10;
  }

  private String generateColor() {
    return "rgb(" +
            randomize.nextInt(255) + ", " +
            randomize.nextInt(255) + ", " +
            randomize.nextInt(255) + ")";
  }

  public int getFontSize() {
    return fontSize;
  }

  public String getContent() {
    return content;
  }

  public String getColor() {
    return color;
  }
}
