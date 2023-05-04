package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.AddressDetailsDto;
import com.lic.epgs.trust.service.IstTrustAddressDetailsService;

@RestController
public class IstTrustAddressDetailsController {

  @Autowired
  private IstTrustAddressDetailsService addressDetailsService;

  /**
   * Retrieve the address details for a given trust ID
   * 
   * @param trustId
   * @return the address details for a given trust ID
   */
  @GetMapping("/addressdetails/{trustId}")
  public List<AddressDetailsDto> getAddressDetailsForTrustId(@PathVariable Long trustId) {
    return addressDetailsService.getAddressDetailsForTrustId(trustId);
  }

  /**
   * Retrieve the response message indicating whether the request was successful or
   * not
   * 
   * @param trustId
   * @return the response message indicating whether the request was successful or
   *         not
   */
  @GetMapping("/responsemessage/{trustId}")
  public String getResponseMessageForTrustId(@PathVariable Long trustId) {
    return addressDetailsService.getResponseMessageForTrustId(trustId);
  }

}