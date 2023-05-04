package com.lic.epgs.trust.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.dto.BankAccountDetailsDto;
import com.lic.epgs.trust.repository.ListTrustBankAccountDetailsRepository;

@Service
public class ListTrustBankAccountDetailsService {
    
    @Autowired
    ListTrustBankAccountDetailsRepository listTrustBankAccountDetailsRepository;
    
    public List<BankAccountDetailsDto> getTrustBankAccountDetailsByTrustId(int trustId){
        return listTrustBankAccountDetailsRepository.findByTrustId(trustId);
    }
}