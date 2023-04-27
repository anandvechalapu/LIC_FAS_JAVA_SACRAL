package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.model.CommissionDetails;

@Repository
public interface CommissionDetailsRepository extends JpaRepository<CommissionDetails, Long> {

    public CommissionDetails saveCommissionDetails1_commission(CommissionDetails commissionDetails);

}