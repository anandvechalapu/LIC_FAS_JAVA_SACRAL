package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;

@Repository
public interface SaveBankAccountDetailsRepository extends JpaRepository<BankAccountDetails, Long> {

    BankAccountDetails findByAccountNumber(String accountNumber);

    BankAccountDetails save(BankAccountDetails bankAccountDetails);

    void update(BankAccountDetails bankAccountDetails);
    
    void deleteByAccountNumber(String accountNumber);

}