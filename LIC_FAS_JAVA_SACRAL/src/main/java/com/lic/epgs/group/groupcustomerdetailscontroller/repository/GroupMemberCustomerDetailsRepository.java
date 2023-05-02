@Repository
public interface GroupMemberCustomerDetailsRepository extends JpaRepository<GroupMemberCustomerDetails, Long> {
 
  List<GroupMemberCustomerDetails> findByGroupCustomerId(Long groupCustomerId);

  Optional<GroupMemberCustomerDetails> findByGroupCustomerIdAndCustomerId(Long groupCustomerId, Long customerId);
  
  void deleteByGroupCustomerId(Long groupCustomerId);

}