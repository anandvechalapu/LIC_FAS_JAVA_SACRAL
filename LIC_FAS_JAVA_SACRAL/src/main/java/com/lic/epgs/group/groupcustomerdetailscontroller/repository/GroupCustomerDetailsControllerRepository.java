@Repository
public interface GroupCustomerDetailsControllerRepository {
    List<GroupCustomerDetails> findByGroupCustomerIdAndContactId(Long groupCustomerId, Long contactId);
    List<GroupCustomerDetails> findAllByGroupCustomerIdAndContactId(Long groupCustomerId, Long contactId);
    void save(GroupCustomerDetails groupCustomerDetails);
    void delete(GroupCustomerDetails groupCustomerDetails);
}