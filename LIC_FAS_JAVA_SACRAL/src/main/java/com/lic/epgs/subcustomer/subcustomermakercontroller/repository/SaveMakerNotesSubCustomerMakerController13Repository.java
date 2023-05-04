@Repository
public interface SaveMakerNotesSubCustomerMakerController13Repository extends JpaRepository<SubCustomerMakerController13, Long> {
 
    @Query("SELECT n FROM SubCustomerMakerController13 n WHERE n.subCustomerId = :subCustomerId AND n.gctFlag = :gctFlag AND n.noteContents = :noteContents AND n.active = true")
    SubCustomerMakerController13 findBySubCustomerIdAndGCTFlagAndNoteContents(String subCustomerId, String gctFlag, String noteContents);
 
    @Modifying
    @Query("UPDATE SubCustomerMakerController13 n SET n.active = false WHERE n.subCustomerId = :subCustomerId AND n.gctFlag = :gctFlag AND n.noteContents = :noteContents")
    void deleteBySubCustomerIdAndGCTFlagAndNoteContents(String subCustomerId, String gctFlag, String noteContents);
 
    @Transactional
    @Modifying
    @Query("UPDATE SubCustomerMakerController13 n SET n.noteContents = :noteContents WHERE n.subCustomerId = :subCustomerId AND n.gctFlag = :gctFlag")
    void updateNoteContentsBySubCustomerIdAndGCTFlag(String subCustomerId, String gctFlag, String noteContents);
 
    @Transactional
    @Modifying
    @Query("INSERT INTO SubCustomerMakerController13 (subCustomerId, gctFlag, noteContents, active) VALUES (:subCustomerId, :gctFlag, :noteContents, true)")
    void saveNoteContentsBySubCustomerIdAndGCTFlag(String subCustomerId, String gctFlag, String noteContents);
}