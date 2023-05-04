package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.entity.Trust;

@Repository
public interface InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Repository extends JpaRepository<Trust, Long> {

    @Query("SELECT t FROM Trust t WHERE t.status = 'ACTIVE' AND t.role = ?1")
    public Trust findTrustByRole(String role);

}