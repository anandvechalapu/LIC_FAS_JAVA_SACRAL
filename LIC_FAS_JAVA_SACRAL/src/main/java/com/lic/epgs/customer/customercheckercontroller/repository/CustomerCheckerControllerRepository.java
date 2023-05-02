package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface CustomerCheckerControllerRepository extends JpaRepository<CustomerCheckerController, UUID> {

  @Query("SELECT c FROM CustomerCheckerController c WHERE c.approved = true")
  CustomerCheckerController findApprovedCustomer();

  @Modifying
  @Query("UPDATE CustomerCheckerController c SET c.approved = true WHERE c.id = :id")
  void approveCustomerById(UUID id);

  @Modifying
  @Query("UPDATE CustomerCheckerController c SET c.status = 'inactive' WHERE c.id = :id")
  void setCustomerInactive(UUID id);

  @Modifying
  @Query("UPDATE CustomerCheckerController c SET c.address = :address, c.contactDetails = :contactDetails, c.migrationData = :migrationData WHERE c.id = :id")
  void updateCustomerData(UUID id, String address, String contactDetails, String migrationData);

}