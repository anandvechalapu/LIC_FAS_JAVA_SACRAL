@Repository
public interface RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository extends JpaRepository<Trust, Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Trust t WHERE t.trustId=:trustId AND t.documentId=:documentId AND t.role=:role")
    void removeTrustDocument(@Param("trustId") long trustId, @Param("documentId") long documentId, @Param("role") String role);

    @Query("SELECT COUNT(*) FROM Trust t WHERE t.trustId=:trustId AND t.documentId=:documentId AND t.role=:role")
    int checkIfTrustDocumentExists(@Param("trustId") long trustId, @Param("documentId") long documentId, @Param("role") String role);
}