package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.BankAccountDetailsService;

@RestController
public class BankAccountDetailsController {

    @Autowired
    private BankAccountDetailsService bankAccountDetailsService;

    @PostMapping("/save")
    public BankAccountDetails save(@RequestBody BankAccountDetails bankAccountDetails) {
        return bankAccountDetailsService.save(bankAccountDetails);
    }

    @GetMapping("/getByAccountNumber/{accountNumber}")
    public Optional<BankAccountDetails> getByAccountNumber(@PathVariable String accountNumber) {
        return bankAccountDetailsService.getByAccountNumber(accountNumber);
    }

    @PutMapping("/update")
    public void update(@RequestBody BankAccountDetails bankAccountDetails) {
        bankAccountDetailsService.update(bankAccountDetails);
    }

    @DeleteMapping("/deleteByAccountNumber/{accountNumber}")
    public void deleteByAccountNumber(@PathVariable String accountNumber) {
        bankAccountDetailsService.deleteByAccountNumber(accountNumber);
    }
}