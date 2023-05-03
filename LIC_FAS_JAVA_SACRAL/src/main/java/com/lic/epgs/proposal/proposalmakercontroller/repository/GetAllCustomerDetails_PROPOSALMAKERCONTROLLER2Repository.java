@Repository
public interface GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Repository extends JpaRepository<CustomerDetails, Long> {

    @Query("SELECT c FROM CustomerDetails c WHERE c.id = :customerId AND c.status = 'active'")
    public CustomerDetails getCustomerDetailsById(@Param("customerId") Long customerId);

    @Query("SELECT c FROM CustomerDetails c WHERE c.status = 'active'")
    public List<CustomerDetails> getAllActiveCustomerDetails();
}