package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.CommonBasicDetailsDtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubCustomerContactDetailsRepository extends JpaRepository<CommonBasicDetailsDtos, Long> {
    
    Optional<CommonBasicDetailsDtos> findBySubCustomerIdAndContactPersonId(Long subCustomerId, Long contactPersonId);
}