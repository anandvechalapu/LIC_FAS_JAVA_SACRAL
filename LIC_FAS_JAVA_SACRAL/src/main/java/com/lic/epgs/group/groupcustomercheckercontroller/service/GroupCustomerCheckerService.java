package com.lic.epgs.group.groupcustomercheckercontroller.service;

import com.lic.epgs.group.groupcustomercheckercontroller.repository.GroupCustomerCheckerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupCustomerCheckerService {

    @Autowired
    private GroupCustomerCheckerRepository groupCustomerCheckerRepository;

    public void rejectGroupCustomer(Integer groupCustomerId, String rejectionRemarks, String modifiedBy) {
        groupCustomerCheckerRepository.rejectGroupCustomer(groupCustomerId, rejectionRemarks, modifiedBy);
    }

    public void updateIsActiveInGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, Boolean isActive) {
        groupCustomerCheckerRepository.updateIsActiveInGroupCustomerBasicDetailsTempEntity(groupCustomerId, isActive);
    }

    public void addNewEntryInGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, String rejectionRemarks, String modifiedBy) {
        groupCustomerCheckerRepository.addNewEntryInGroupCustomerBasicDetailsTempEntity(groupCustomerId, rejectionRemarks, modifiedBy);
    }

    public void updateGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, String groupStatus, String workflowStatus, String rejectionRemarks, String modifiedBy) {
        groupCustomerCheckerRepository.updateGroupCustomerBasicDetailsTempEntity(groupCustomerId, groupStatus, workflowStatus, rejectionRemarks, modifiedBy);
    }

    public void updateIsActiveInNewEntryGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, Boolean isActive) {
        groupCustomerCheckerRepository.updateIsActiveInNewEntryGroupCustomerBasicDetailsTempEntity(groupCustomerId, isActive);
    }

    public void updateGroupCustomerBasicDetailsEntity(String groupCode, String groupStatus, String workflowStatus) {
        groupCustomerCheckerRepository.updateGroupCustomerBasicDetailsEntity(groupCode, groupStatus, workflowStatus);
    }

    public void addNewEntryInAddressDetailsEntity(Integer tempAddressId, Integer addressId) {
        groupCustomerCheckerRepository.addNewEntryInAddressDetailsEntity(tempAddressId, addressId);
    }

    public void addNewEntryInContactDetailEntity(Integer tempContactPersonId, Integer contactPersonId) {
        groupCustomerCheckerRepository.addNewEntryInContactDetailEntity(tempContactPersonId, contactPersonId);
    }

    public void addNewEntryInCustomerNotesEntity(Integer tempNoteId, Integer noteId) {
        groupCustomerCheckerRepository.addNewEntryInCustomerNotesEntity(tempNoteId, noteId);
    }

}