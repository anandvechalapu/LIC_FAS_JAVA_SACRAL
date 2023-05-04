package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.trust.model.TrustAddressDetails;

public interface RemoveTrustAddressDetailsRepository extends JpaRepository<TrustAddressDetails, Long> {
    
    @Modifying
    @Transactional
    @Query("UPDATE TrustAddressDetails t SET t.active = false, t.modifiedBy = :modifiedBy, t.modifiedOn = :modifiedOn WHERE t.trustId = :trustId AND t.addressId = :addressId AND t.role = :role")
    int setInactiveByTrustIdAndAddressIdAndRole(@Param("trustId") Long trustId, @Param("addressId") Long addressId, 
    @Param("role") String role, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") String modifiedOn);
}