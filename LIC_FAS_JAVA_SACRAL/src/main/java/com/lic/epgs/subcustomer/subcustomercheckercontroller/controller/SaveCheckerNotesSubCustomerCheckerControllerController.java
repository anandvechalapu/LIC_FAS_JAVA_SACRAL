package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SaveCheckerNotesSubCustomerCheckerController;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.SaveCheckerNotesSubCustomerCheckerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/save-checker-notes-sub-customer-checker-controller")
public class SaveCheckerNotesSubCustomerCheckerControllerController {

    @Autowired
    private SaveCheckerNotesSubCustomerCheckerControllerService saveCheckerNotesSubCustomerCheckerControllerService;

    @GetMapping("/{subCustomer}")
    public SaveCheckerNotesSubCustomerCheckerController findBySubCustomer(@PathVariable String subCustomer) {
        return saveCheckerNotesSubCustomerCheckerControllerService.findBySubCustomer(subCustomer);
    }

    @DeleteMapping("/{subCustomer}")
    public void deleteBySubCustomer(@PathVariable String subCustomer) {
        saveCheckerNotesSubCustomerCheckerControllerService.deleteBySubCustomer(subCustomer);
    }

    @PostMapping
    public SaveCheckerNotesSubCustomerCheckerController save(@RequestBody SaveCheckerNotesSubCustomerCheckerController saveCheckerNotesSubCustomerCheckerController) {
        return saveCheckerNotesSubCustomerCheckerControllerService.save(saveCheckerNotesSubCustomerCheckerController);
    }

}