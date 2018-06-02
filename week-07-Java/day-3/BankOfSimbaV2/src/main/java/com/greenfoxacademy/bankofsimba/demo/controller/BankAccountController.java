package com.greenfoxacademy.bankofsimba.demo.controller;

import com.greenfoxacademy.bankofsimba.demo.model.Bank;
import com.greenfoxacademy.bankofsimba.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount bankAccount;
  Bank bankAccounts = new Bank();

  @RequestMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", true, true));
    return "show";
  }

  @RequestMapping("/bank")
  public String bankAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccounts.getBankAccounts());
    return "show_accounts";
  }

  @RequestMapping("/balanceUpdate")
  public String balanceIncrease(@ModelAttribute(name = "accountName") String accountName) {
    bankAccounts.getBankAccount(accountName).increaseBalance();
    return "redirect:/bank";
  }
}
