must be tested manually.

@Repository
public interface GroupCustomerCheckerRepository {
    
    // Method to reject the group customer
    public void rejectGroupCustomer(Integer groupCustomerId, String rejectionRemarks, String modifiedBy);
    
    // Method to update the isActive field in GroupCustomerBasicDetailsTempEntity table
    public void updateIsActiveInGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, Boolean isActive);
    
    // Method to add a new entry in GroupCustomerBasicDetailsTempEntity table
    public void addNewEntryInGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, String rejectionRemarks, String modifiedBy);
    
    // Method to update the group status, workflow status, rejection remarks, modified by, and modified on fields in GroupCustomerBasicDetailsTempEntity table
    public void updateGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, String groupStatus, String workflowStatus, String rejectionRemarks, String modifiedBy);
    
    // Method to update the isActive field in the new entry of GroupCustomerBasicDetailsTempEntity table
    public void updateIsActiveInNewEntryGroupCustomerBasicDetailsTempEntity(Integer groupCustomerId, Boolean isActive);
    
    // Method to update the GroupCustomerBasicDetailsEntity table
    public void updateGroupCustomerBasicDetailsEntity(String groupCode, String groupStatus, String workflowStatus);
    
    // Method to add a new entry in AddressDetailsEntity table
    public void addNewEntryInAddressDetailsEntity(Integer tempAddressId, Integer addressId);
    
    // Method to add a new entry in ContactDetailEntity table
    public void addNewEntryInContactDetailEntity(Integer tempContactPersonId, Integer contactPersonId);
    
    // Method to add a new entry in CustomerNotesEntity table
    public void addNewEntryInCustomerNotesEntity(Integer tempNoteId, Integer noteId);

}