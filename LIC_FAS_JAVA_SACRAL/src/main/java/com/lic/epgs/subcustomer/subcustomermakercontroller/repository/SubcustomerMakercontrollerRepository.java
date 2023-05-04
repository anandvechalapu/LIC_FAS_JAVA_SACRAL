@Repository
public interface SubcustomerMakercontrollerRepository extends JpaRepository<LoadInformation, Long> {
	
	List<LoadInformation> findByRoleTypeAndUnitCode(String roleType, String unitCode);
	
	@Query("FROM LoadInformation l WHERE l.roleType = :roleType and l.unitCode = :unitCode")
	List<LoadInformation> getExistingLoads(@Param("roleType") String roleType, @Param("unitCode") String unitCode);
	
	@Query(value = "SELECT * FROM LOAD_INFORMATION WHERE ROLE_TYPE = :roleType AND UNIT_CODE = :unitCode", nativeQuery = true)
	List<LoadInformation> getExistingLoadsNative(@Param("roleType") String roleType, @Param("unitCode") String unitCode);
	
	@Query("FROM LoadInformation l WHERE l.roleType = :roleType and l.unitCode = :unitCode and l.customerInformation is not null")
	List<LoadInformation> getExistingLoadsWithCustomerInfo(@Param("roleType") String roleType, @Param("unitCode") String unitCode);
	
	@Query("SELECT COUNT(*) FROM LoadInformation l WHERE l.roleType = :roleType and l.unitCode = :unitCode")
	int getExistingLoadCount(@Param("roleType") String roleType, @Param("unitCode") String unitCode);
	
}