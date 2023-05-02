@Repository
public interface RemoveMemberCustomerDetailsGroupCustomerDetailsControllerRepository extends JpaRepository<Customer, Long> {

    Customer findByCustomerCode(String customerCode);

    List<Customer> findByGroupId(long groupId);

    @Modifying
    @Query("UPDATE Customer c SET c.groupId = 0 WHERE c.customerCode = :customerCode")
    int removeMemberCustomerFromGroup(@Param("customerCode") String customerCode);

}