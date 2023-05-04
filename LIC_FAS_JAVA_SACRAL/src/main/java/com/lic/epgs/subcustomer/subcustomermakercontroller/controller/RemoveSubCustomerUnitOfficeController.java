package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.RemoveSubCustomerUnitOffice;

@Repository
public interface RemoveSubCustomerUnitOfficeRepository extends JpaRepository<RemoveSubCustomerUnitOffice, Long> {

    @Modifying
    @Query("DELETE FROM RemoveSubCustomerUnitOffice WHERE subCustomerId = :subCustomerId AND unitOfficeId = :unitOfficeId")
    boolean removeSubCustomerUnitOffice(Long subCustomerId, Long unitOfficeId);
}

package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.RemoveSubCustomerUnitOffice;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.RemoveSubCustomerUnitOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subcustomer/remove")
public class RemoveSubCustomerUnitOfficeController {
    @Autowired
    private RemoveSubCustomerUnitOfficeService removeSubCustomerUnitOfficeService;

    @DeleteMapping("/{subCustomerId}/{unitOfficeId}")
    public ResponseEntity<RemoveSubCustomerUnitOffice> removeSubCustomerUnitOffice(@PathVariable Long subCustomerId,
                                                                                  @PathVariable Long unitOfficeId) {
        if (removeSubCustomerUnitOfficeService.removeSubCustomerUnitOffice(subCustomerId, unitOfficeId)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}