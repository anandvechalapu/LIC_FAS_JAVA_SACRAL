package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.CommonBasicDetailsDtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubCustomerContactDetailsRepository extends JpaRepository<CommonBasicDetailsDtos, Long> {
    Optional<CommonBasicDetailsDtos> findBySubCustomerIdAndContactPersonId(Long subCustomerId, Long contactPersonId);
}

package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.CommonBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sub-customer")
public class SubCustomerContactDetailsController {

    @Autowired
    private SubCustomerContactDetailsService subCustomerContactDetailsService;

    @GetMapping("/{subCustomerId}/contact-person/{contactPersonId}")
    public ResponseEntity<CommonBasicDetailsDtos> getSubCustomerContactDetails(@PathVariable Long subCustomerId,
                                                                              @PathVariable Long contactPersonId) {

        Optional<CommonBasicDetailsDtos> commonBasicDetailsDtos = subCustomerContactDetailsService.getSubCustomerContactDetails(subCustomerId, contactPersonId);

        if (commonBasicDetailsDtos.isPresent()) {
            return ResponseEntity.ok(commonBasicDetailsDtos.get());
        }

        return ResponseEntity.notFound().build();
    }
}