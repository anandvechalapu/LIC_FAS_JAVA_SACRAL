package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.SaveBankAccountDetailsRepository;

@Service
public class BankAccountDetailsService {

    @Autowired
    private SaveBankAccountDetailsRepository repository;

    public BankAccountDetails save(BankAccountDetails bankAccountDetails) {
        return repository.save(bankAccountDetails);
    }

    public Optional<BankAccountDetails> getByAccountNumber(String accountNumber) {
        return repository.findByAccountNumber(accountNumber);
    }

    public void update(BankAccountDetails bankAccountDetails) {
        repository.update(bankAccountDetails);
    }

    public void deleteByAccountNumber(String accountNumber) {
        repository.deleteByAccountNumber(accountNumber);
    }
}