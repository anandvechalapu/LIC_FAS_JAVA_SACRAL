@Repository
public interface LoadCommissionNotesRepository extends JpaRepository<CommissionNotes, Integer>{

    // Retrieve all commission notes for given commission ID
    @Query("SELECT c FROM CommissionNotes c WHERE c.commissionId = :commissionId")
    List<CommissionNotes> getCommissionNotesByCommissionId(@Param("commissionId") Integer commissionId);

}