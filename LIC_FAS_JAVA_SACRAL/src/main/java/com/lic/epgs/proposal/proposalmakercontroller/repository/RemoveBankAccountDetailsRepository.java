package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetails;

public interface RemoveBankAccountDetailsRepository extends JpaRepository<BankAccountDetails, Long> {

  @Modifying
  @Transactional
  @Query("DELETE FROM BankAccountDetails b WHERE b.bankAccountId = :bankAccountId AND b.proposalId = :proposalId")
  void removeBankAccountDetails(@Param("bankAccountId") Long bankAccountId, @Param("proposalId") Long proposalId);

}