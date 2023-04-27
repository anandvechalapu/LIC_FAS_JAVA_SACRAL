@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Long> {

    List<CommonStatus> findAllByIsActiveTrue();
    
    @Query("SELECT id, code, type, description, description1, name, isActive FROM CommonStatus cs WHERE cs.isActive = 0")
    List<CommonStatus> findAllByIsActiveFalse();
    
    @Query("SELECT id, code, type, description, description1, name, isActive FROM CommonStatus cs WHERE cs.isActive = 1 OR cs.isActive = 0")
    List<CommonStatus> findAllByIsActive();
    
    Optional<CommonStatus> findByIdAndIsActiveTrue(Long id);
    
    @Query("SELECT COUNT(*) FROM CommonStatus cs WHERE cs.id = :id AND cs.isActive = 1")
    Long countByIdAndIsActiveTrue(@Param("id") Long id);
    
    @Query("SELECT COUNT(*) FROM CommonStatus cs WHERE cs.id = :id AND cs.isActive = 0")
    Long countByIdAndIsActiveFalse(@Param("id") Long id);
}