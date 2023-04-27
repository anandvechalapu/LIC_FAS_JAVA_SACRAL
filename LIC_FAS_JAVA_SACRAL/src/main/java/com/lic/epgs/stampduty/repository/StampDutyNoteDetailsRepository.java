import org.springframework.data.jpa.repository.JpaRepository;

public interface StampDutyNoteDetailsRepository extends JpaRepository<StampDutyNoteDetails, Long> {
    
    // Retrieve list of stamp duty note details associated to a given stamp ID
    List<StampDutyNoteDetails> getNoteDetailsList_STAMPDUTY(Long stampId);
}