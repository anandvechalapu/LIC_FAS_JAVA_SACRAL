import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveLeadTransfer_LEAD19Repository extends JpaRepository<SaveLeadTransfer_LEAD19, Long> {
    SaveLeadTransfer_LEAD19 findByLeadChannelIdAndLeadIdAndUnitOfficeId(String leadChannelId, Long leadId, Long unitOfficeId);
    
    SaveLeadTransfer_LEAD19 save(SaveLeadTransfer_LEAD19 saveLeadTransfer_LEAD19);
}