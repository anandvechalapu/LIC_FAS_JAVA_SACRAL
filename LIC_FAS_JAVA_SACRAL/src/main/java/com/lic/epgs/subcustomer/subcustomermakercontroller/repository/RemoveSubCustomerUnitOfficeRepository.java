package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoveSubCustomerUnitOfficeRepository extends JpaRepository {
    boolean removeSubCustomerUnitOffice(Long subCustomerId, Long unitOfficeId);
}