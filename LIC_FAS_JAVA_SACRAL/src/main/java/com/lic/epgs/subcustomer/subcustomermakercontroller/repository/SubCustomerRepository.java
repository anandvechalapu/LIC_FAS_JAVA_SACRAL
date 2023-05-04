package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomer;

public interface SubCustomerRepository extends JpaRepository<SubCustomer, Long> {
    SubCustomer findByName(String name);
    SubCustomer findByCode(String code);
    SubCustomer save(SubCustomer subCustomer);
    void deleteByName(String name);
    void deleteByCode(String code);
    void updateSubCustomerMappedDetails(String name, String code);
    void generateSubCustomerCode(String name);
    void validateSubCustomerName(String name);
}