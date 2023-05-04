@Repository
public interface InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository extends JpaRepository<CommonTrustDto, Long> {
	
	List<CommonTrustDto> findCommonTrustDtoByRoleAndUnitCode(String role, String unitCode);
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.status = 'In Progress Maker'")
	List<CommonTrustDto> findByStatusInProgressMaker();
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.status = 'In Progress Checker'")
	List<CommonTrustDto> findByStatusInProgressChecker();
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.role = :role AND t.unitCode = :unitCode")
	List<CommonTrustDto> findByRoleAndUnitCode(@Param("role") String role, @Param("unitCode") String unitCode);
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.role = :role AND t.unitCode = :unitCode AND t.status = 'In Progress Maker'")
	List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressMaker(@Param("role") String role, @Param("unitCode") String unitCode);
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.role = :role AND t.unitCode = :unitCode AND t.status = 'In Progress Checker'")
	List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressChecker(@Param("role") String role, @Param("unitCode") String unitCode);
}