package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCustomerMakerControllerRepository extends JpaRepository<SubCustomerMakerController, Long> {

	public List<SubCustomerMakerController> getMakerNotesBySubCustomerId(long subCustomerId);

}