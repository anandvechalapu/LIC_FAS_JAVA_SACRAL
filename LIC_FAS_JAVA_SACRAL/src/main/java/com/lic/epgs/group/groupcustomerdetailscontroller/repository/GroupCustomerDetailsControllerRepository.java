@Repository
public interface GroupCustomerDetailsControllerRepository { 
 
    public List<Customer> searchMemberCustomerDetails(String customerCode, String customerName, String trustName);
 
    public List<Customer> getActiveMemberCustomers();
 
    public List<Customer> getCustomerBasicDetails(String customerCode, String customerName, String customerStatus);
 
    public List<Trust> getTrustDetails(String trustName, String trustId);
}