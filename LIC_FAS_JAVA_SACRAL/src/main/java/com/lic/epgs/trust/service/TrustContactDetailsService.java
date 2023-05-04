package com.lic.epgs.trust.service;

import com.lic.epgs.trust.entity.ContactEntityList;
import com.lic.epgs.trust.dto.CommonTrustDto;
import com.lic.epgs.trust.dto.ContactDetailsDto;
import com.lic.epgs.trust.repository.TrustContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrustContactDetailsService {

    @Autowired
    private TrustContactDetailsRepository trustContactDetailsRepository;

    public CommonTrustDto listTrustContacts(Long trustId) {
        List<ContactEntityList> contactEntityList = trustContactDetailsRepository.findAllByTrustId(trustId);
        return new CommonTrustDto(trustId, contactEntityList);
    }

    public ContactDetailsDto saveContactDetails(ContactEntityList contactEntityList) {
        contactEntityList = trustContactDetailsRepository.save(contactEntityList);
        return new ContactDetailsDto(contactEntityList);
    }

    public void deleteContactDetails(ContactEntityList contactEntityList) {
        trustContactDetailsRepository.delete(contactEntityList);
    }

}