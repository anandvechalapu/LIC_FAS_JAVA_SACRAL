package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.RemoveBankAccountDetailsRepository;

@Service
public class RemoveBankAccountDetailsService {

  @Autowired
  private RemoveBankAccountDetailsRepository removeBankAccountDetailsRepository;

  @Transactional
  public void removeBankAccountDetails(Long bankAccountId, Long proposalId) {
    removeBankAccountDetailsRepository.removeBankAccountDetails(bankAccountId, proposalId);
  }

}