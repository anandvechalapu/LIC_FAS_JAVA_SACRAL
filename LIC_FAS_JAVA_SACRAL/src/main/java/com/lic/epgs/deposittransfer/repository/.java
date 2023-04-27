@Repository
@Transactional
public class ExistingDepositNotesRepository {

    @PersistenceContext
    private EntityManager em;
    
    public List<ExistingDepositNotes> getExistingDepositNotes_DepositTransfer(String transferId) {
        if(transferId == null || transferId.isEmpty()) {
            throw new IllegalArgumentException("Transfer ID cannot be null or empty.");
        }
        try {
            String queryString = "SELECT dn FROM ExistingDepositNotes dn WHERE dn.transferId = :transferId AND dn.isActive = true ORDER BY dn.transferId DESC";
            TypedQuery<ExistingDepositNotes> query = em.createQuery(queryString, ExistingDepositNotes.class);
            
            query.setParameter("transferId", transferId);
            
            return query.getResultList();
        } catch(Exception e) {
            throw new RuntimeException("An error occurred while retrieving existing deposit notes: " + e.getMessage());
        }
    }
}