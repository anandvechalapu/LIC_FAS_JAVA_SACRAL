package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.dtos.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.RemoveGroupCustomerBankRepository;

@Service
public class RemoveGroupCustomerBankService {

    private final RemoveGroupCustomerBankRepository removeGroupCustomerBankRepository;

    @Autowired
    public RemoveGroupCustomerBankService(RemoveGroupCustomerBankRepository removeGroupCustomerBankRepository) {
        this.removeGroupCustomerBankRepository = removeGroupCustomerBankRepository;
    }

    public CommonResponseDto removeGroupCustomerBank(String groupCustomerId, String bankAccountId) {
        return this.removeGroupCustomerBankRepository.removeGroupCustomerBank(groupCustomerId, bankAccountId);
    }
}