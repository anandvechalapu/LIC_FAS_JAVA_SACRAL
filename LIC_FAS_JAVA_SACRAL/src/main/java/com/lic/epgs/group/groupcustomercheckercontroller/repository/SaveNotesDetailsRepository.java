import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.group.groupcustomercheckercontroller.entity.SaveNotesDetail;

public interface SaveNotesDetailsRepository extends JpaRepository<SaveNotesDetail, Long> {
    SaveNotesDetail findByNotesId(Long notesId);
    void deleteByNotesId(Long notesId);
    void updateNotes(Long notesId, String notes);
}