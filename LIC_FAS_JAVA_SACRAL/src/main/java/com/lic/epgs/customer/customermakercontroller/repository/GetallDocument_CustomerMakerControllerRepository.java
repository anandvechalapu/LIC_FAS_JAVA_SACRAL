package com.lic.epgs.customer.customermakercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.model.Document;

@Repository
public interface GetallDocument_CustomerMakerControllerRepository extends JpaRepository<Document, Long>{
	
	@Query("SELECT d FROM Document d WHERE d.customerId = ?1")
	List<Document> findByCustomerId(Long customerId);

}