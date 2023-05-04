package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerBankDetails;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerBankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subcustomer/bankdetails")
public class SubCustomerBankDetailsController {

  @Autowired
  private SubCustomerBankDetailsService subCustomerBankDetailsService;

  @PostMapping
  public SubCustomerBankDetails save(@RequestBody SubCustomerBankDetails subCustomerBankDetails){
    return subCustomerBankDetailsService.save(subCustomerBankDetails);
  }

  @GetMapping("/{id}")
  public SubCustomerBankDetails findById(@PathVariable Long id){
    return subCustomerBankDetailsService.findById(id);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id){
    subCustomerBankDetailsService.deleteById(id);
  }

  @GetMapping("/accountnumber/{accountNumber}")
  public SubCustomerBankDetails findByAccountNumber(@PathVariable String accountNumber){
    return subCustomerBankDetailsService.findByAccountNumber(accountNumber);
  }

}