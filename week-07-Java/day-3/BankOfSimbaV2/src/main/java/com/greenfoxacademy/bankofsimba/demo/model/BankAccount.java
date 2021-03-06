package com.greenfoxacademy.bankofsimba.demo.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public void increaseBalance() {
    if (isKing) {
      this.balance += 100;
    } else {
      this.balance += 10;
    }
  }

  @Override
  public String toString() {
    return "BankAccount{" +
            "name = '" + name + '\'' +
            ", balance = '" + String.format("%.2f", balance) + " Zebra " + '\'' +
            ", animalType = '" + animalType + '\'' +
            '}';
  }
}
