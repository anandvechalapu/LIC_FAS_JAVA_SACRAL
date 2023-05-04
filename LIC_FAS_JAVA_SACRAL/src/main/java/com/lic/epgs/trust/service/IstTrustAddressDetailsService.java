package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.AddressDetailsDto;
import com.lic.epgs.trust.repository.IstTrustAddressDetailsRepository;

@Service
public class IstTrustAddressDetailsService {

  @Autowired
  private IstTrustAddressDetailsRepository addressDetailsRepository;

  /**
   * Retrieve the address details for a given trust ID
   * 
   * @param trustId
   * @return the address details for a given trust ID
   */
  public List<AddressDetailsDto> getAddressDetailsForTrustId(Long trustId) {
    return addressDetailsRepository.findByTrustId(trustId);
  }

  /**
   * Retrieve the response message indicating whether the request was successful or
   * not
   * 
   * @param trustId
   * @return the response message indicating whether the request was successful or
   *         not
   */
  public String getResponseMessageForTrustId(Long trustId) {
    return addressDetailsRepository.getResponseMessage(trustId);
  }
}