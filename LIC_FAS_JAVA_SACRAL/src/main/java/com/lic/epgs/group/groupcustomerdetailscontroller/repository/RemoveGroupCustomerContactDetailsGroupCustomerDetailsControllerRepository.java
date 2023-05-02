@Repository
public interface RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerRepository extends JpaRepository<GroupCustomerDetailsControllerEntity, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM GroupCustomerDetailsControllerEntity WHERE groupCustomerId = :groupCustomerId AND contactId = :contactId")
    int deleteGroupCustomerContactDetails(@Param("groupCustomerId") Long groupCustomerId, @Param("contactId") Long contactId);
}