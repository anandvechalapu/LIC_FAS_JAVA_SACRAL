package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupBankAccountDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupBankAccountDetailsRepository;

@Service
public class GroupBankAccountDetailsService {

    @Autowired
    GroupBankAccountDetailsRepository groupBankAccountDetailsRepository;

    public GroupBankAccountDetails getGroupBankAccountDetails(long groupCustomerId) {
        return groupBankAccountDetailsRepository.findByGroupCustomerId(groupCustomerId);
    }

    public void saveGroupBankAccountDetails(GroupBankAccountDetails groupBankAccountDetails) {
        groupBankAccountDetailsRepository.save(groupBankAccountDetails);
    }

    public void deleteGroupBankAccountDetails(GroupBankAccountDetails groupBankAccountDetails) {
        groupBankAccountDetailsRepository.delete(groupBankAccountDetails);
    }

    public void deleteGroupBankAccountDetailsByGroupCustomerId(long groupCustomerId) {
        groupBankAccountDetailsRepository.deleteByGroupCustomerId(groupCustomerId);
    }

}