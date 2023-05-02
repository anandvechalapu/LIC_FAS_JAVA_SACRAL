@Repository
public interface SaveGroupCustomerBasicDetailsRepository extends JpaRepository<GroupCustomerDetailsController, Long> {

	Optional<GroupCustomerDetailsController> findByGroupName(String groupName);
    
	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerDetailsController g SET g.groupName = :groupName, g.customerName = :customerName, g.customerNumber = :customerNumber WHERE g.id = :id")
	void saveGroupCustomerBasicDetails(@Param("groupName") String groupName, @Param("customerName") String customerName, @Param("customerNumber") String customerNumber, @Param("id") Long id);
	
	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerDetailsController g SET g.groupName = :groupName, g.customerName = :customerName, g.customerNumber = :customerNumber WHERE g.id = :id")
	void updateGroupCustomerRelatedDetails(@Param("groupName") String groupName, @Param("customerName") String customerName, @Param("customerNumber") String customerNumber, @Param("id") Long id);
}