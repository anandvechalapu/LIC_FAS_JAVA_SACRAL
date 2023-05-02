package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerMakerController;

@Repository
public interface SaveMakerNotes_CustomerMakerControllerRepository extends JpaRepository<CustomerMakerController, Long> {

}