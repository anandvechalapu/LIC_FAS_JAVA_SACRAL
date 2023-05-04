@Repository
public interface RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository extends JpaRepository<TrustDetails, Long> {
    
    @Query("DELETE FROM TrustDetails t WHERE t.trustId = :trustId and t.contactPersonId = :contactPersonId and t.role = :role")
    int removeTrustContactPersonDetails(String trustId, String contactPersonId, String role);
    
    @Query("SELECT t FROM TrustDetails t WHERE t.trustId = :trustId and t.contactPersonId = :contactPersonId and t.role = :role")
    Optional<TrustDetails> findTrustContactPersonDetails(String trustId, String contactPersonId, String role);
    
    @Modifying
    @Transactional
    @Query("UPDATE TrustDetails t SET t.trustId = :trustId, t.contactPersonId = :contactPersonId, t.role = :role WHERE t.trustId = :trustId and t.contactPersonId = :contactPersonId and t.role = :role")
    int updateTrustContactPersonDetails(String trustId, String contactPersonId, String role);
    
    @Transactional
    @Query("SELECT t FROM TrustDetails t WHERE t.trustId = :trustId")
    List<TrustDetails> findTrustContactPersonsByTrustId(String trustId);
    
    @Transactional
    @Query("SELECT t FROM TrustDetails t WHERE t.trustId = :trustId and t.role = :role")
    List<TrustDetails> findTrustContactPersonsByTrustIdAndRole(String trustId, String role);
    
    @Transactional
    @Query("SELECT t FROM TrustDetails t WHERE t.contactPersonId = :contactPersonId")
    List<TrustDetails> findTrustContactPersonsByContactPersonId(String contactPersonId);
    
    @Transactional
    @Query("SELECT t FROM TrustDetails t WHERE t.contactPersonId = :contactPersonId and t.role = :role")
    List<TrustDetails> findTrustContactPersonsByContactPersonIdAndRole(String contactPersonId, String role);
}