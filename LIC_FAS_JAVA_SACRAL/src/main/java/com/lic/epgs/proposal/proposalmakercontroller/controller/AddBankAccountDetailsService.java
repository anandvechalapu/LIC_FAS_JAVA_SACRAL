package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.AddBankAccountDetailsRepository;

@Service
public class AddBankAccountDetailsService {

  @Autowired
  private AddBankAccountDetailsRepository addBankAccountDetailsRepository;

  @Transactional
  public void addBankAccountDetails(BankAccountDetails bankAccountDetails) {
    addBankAccountDetailsRepository.addBankAccountDetails(bankAccountDetails);
  }

}

package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.AddBankAccountDetailsService;
import com.lic.epgs.proposal.proposalmakercontroller.service.RemoveBankAccountDetailsService;

@RestController
@RequestMapping("/bank-account-details")
public class BankAccountDetailsController {

  @Autowired
  private AddBankAccountDetailsService addBankAccountDetailsService;

  @Autowired
  private RemoveBankAccountDetailsService removeBankAccountDetailsService;

  @PostMapping("/add")
  public void addBankAccountDetails(@RequestBody BankAccountDetails bankAccountDetails) {
    addBankAccountDetailsService.addBankAccountDetails(bankAccountDetails);
  }

  @DeleteMapping("/remove")
  public void removeBankAccountDetails(Long bankAccountId, Long proposalId) {
    removeBankAccountDetailsService.removeBankAccountDetails(bankAccountId, proposalId);
  }

}