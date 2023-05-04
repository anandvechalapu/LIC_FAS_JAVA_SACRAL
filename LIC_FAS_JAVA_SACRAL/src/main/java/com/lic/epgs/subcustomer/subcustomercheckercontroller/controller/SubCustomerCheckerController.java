package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomer; 
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.SubCustomerCheckerControllerService; 

@RestController 
@RequestMapping("/api/subcustomerchecker") 
public class SubCustomerCheckerController { 
 
    @Autowired 
    private SubCustomerCheckerControllerService subCustomerCheckerControllerService; 
 
    @GetMapping("/validate") 
    public boolean validateSubCustomerId(@RequestParam Long subCustomerId) { 
        return subCustomerCheckerControllerService.validateSubCustomerId(subCustomerId); 
    } 
 
    @PostMapping("/setstatus") 
    public boolean setSubCustomerStatusAndWorkflowStatus(@RequestParam Long subCustomerId, 
                                                         @RequestParam String newStatus, 
                                                         @RequestParam String newWorkflowStatus) { 
        return subCustomerCheckerControllerService.setSubCustomerStatusAndWorkflowStatus(subCustomerId, newStatus, newWorkflowStatus); 
    } 
 
    @PostMapping("/updatedetails") 
    public boolean updateSubCustomerDetails(@RequestParam Long subCustomerId, 
                                            @RequestParam String newFirstName, 
                                            @RequestParam String newLastName, 
                                            @RequestParam String newAddress) { 
        return subCustomerCheckerControllerService.updateSubCustomerDetails(subCustomerId, newFirstName, newLastName, newAddress); 
    } 
 
    @PostMapping("/updateresponse") 
    public boolean updateSubCustomerResponse(@RequestParam Long subCustomerId) { 
        return subCustomerCheckerControllerService.updateSubCustomerResponse(subCustomerId); 
    } 
 
    @PostMapping("/create") 
    public SubCustomer createSubCustomer(@RequestBody SubCustomer subCustomer) { 
        return subCustomerCheckerControllerService.createSubCustomer(subCustomer); 
    } 
}