package com.greenfoxacademy.bankofsimba.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<BankAccount> bankAccounts = new ArrayList<>();

  public Bank() {
    bankAccounts = new ArrayList<>();
    fillBank();
  }

  private void fillBank() {
    bankAccounts.add(new BankAccount("Pumba", 1000, "boar", false, true));
    bankAccounts.add(new BankAccount("Timon", 0, "surikata", false, true));
    bankAccounts.add(new BankAccount("Rafiki", 3000, "monkey", false, true));
    bankAccounts.add(new BankAccount("Zazu", 1000, "tucan", false, true));
    bankAccounts.add(new BankAccount("Zordon", 2000, "lion", false, false));
    bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
  }

  public BankAccount getBankAccount(String name) {
    for (BankAccount bankAccount : bankAccounts) {
      if (bankAccount.getName().equals(name)) {
        return bankAccount;
      }
    }
    return null;
  }
  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }


  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  @Override
  public String toString() {
    return "Bank{" +
            "bankAccounts=" + bankAccounts +
            '}';
  }
}
