@Repository
public interface GetApprovalNotesTrustManagementRepository extends JpaRepository<ApprovalNotes, Long> {
    
    Optional<ApprovalNotes> findByTrustId(String trustId);
    
    List<ApprovalNotes> findAllByTrustId(String trustId);
    
    List<ApprovalNotes> findAll();
    
    void deleteByTrustId(String trustId);
}