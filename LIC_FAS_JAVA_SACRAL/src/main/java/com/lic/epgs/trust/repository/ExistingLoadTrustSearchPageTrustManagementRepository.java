@Repository
public interface ExistingLoadTrustSearchPageTrustManagementRepository extends JpaRepository<TrustEntity, Long> {
 
    List<TrustDto> findByUnitCodeAndTrustStatusIn(String unitCode, List<String> trustStatuses);
 
    @Query("SELECT t FROM TrustEntity t WHERE t.unitCode = :unitCode AND t.trustStatus IN :trustStatuses")
    List<TrustDto> findTrustsByUnitCodeAndTrustStatuses(@Param("unitCode") String unitCode, @Param("trustStatuses") List<String> trustStatuses);
 
    Long countByUnitCodeAndTrustStatusIn(String unitCode, List<String> trustStatuses);
}