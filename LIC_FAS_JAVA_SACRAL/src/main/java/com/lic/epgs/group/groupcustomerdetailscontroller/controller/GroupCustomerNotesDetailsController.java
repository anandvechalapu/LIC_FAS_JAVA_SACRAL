package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerNotesDetails;

public interface GroupCustomerNotesDetailsRepository extends JpaRepository<GroupCustomerNotesDetails, Long> {

    @Query("SELECT g FROM GroupCustomerNotesDetails g WHERE g.groupCustomerId = :groupCustomerId AND g.startDate >= :startDate AND g.endDate <= :endDate")
    List<GroupCustomerNotesDetails> findByGroupCustomerIdAndDateRange(Long groupCustomerId, String startDate, String endDate);
}

package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerNotesDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerNotesDetailsService;

@RestController
@RequestMapping("/group-customer-notes-details")
public class GroupCustomerNotesDetailsController {

    @Autowired
    private GroupCustomerNotesDetailsService groupCustomerNotesDetailsService;
    
    @GetMapping("/{groupCustomerId}")
    public List<GroupCustomerNotesDetails> getGroupCustomerNotesDetailsByGroupCustomerIdAndDateRange(@PathVariable Long groupCustomerId,
                                                                                                    @RequestParam(value="startDate") String startDate, 
                                                                                                    @RequestParam(value="endDate") String endDate) {
        return groupCustomerNotesDetailsService.findByGroupCustomerIdAndDateRange(groupCustomerId, startDate, endDate);
    }
}