@Repository
public interface GetCustomerDetails_LEAD8Repository extends JpaRepository<Customer, Long> {
 
   Optional<Customer> getCustomerDetails(Long customerId);
 
   List<Customer> findAllByCustomerStatusAndIndustryType(String status, String industryType);
 
   List<Customer> findAllByCustomerIdAndCustomerCodeAndCustomerNameAndPANAndCustomerTypeAndCustomerStatusAndIndustryTypeAndCustomerEntity(
           Long customerId, String customerCode, String customerName, String PAN, String customerType, String customerStatus, String industryType, String customerEntity);
 
   List<Customer> findByCustomerIdAndCustomerStatus(Long customerId, String status);
 
   List<Customer> findByCustomerIdAndCustomerStatusAndIndustryType(Long customerId, String status, String industryType);
 
}