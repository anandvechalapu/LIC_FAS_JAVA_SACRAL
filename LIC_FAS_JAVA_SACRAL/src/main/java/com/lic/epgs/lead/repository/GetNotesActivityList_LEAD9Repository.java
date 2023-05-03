import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.lead.dto.LeadBasicDetailsDTO;
import com.lic.epgs.lead.entity.LeadNotesActiveTempEntity;

public interface GetNotesActivityList_LEAD9Repository extends JpaRepository<LeadNotesActiveTempEntity, Long> {

	@Query("SELECT lnate FROM LeadNotesActiveTempEntity lnate WHERE lnate.active = true ORDER BY lnate.leadNotesActivityId DESC")
	public List<LeadNotesActiveTempEntity> getNotesActivityList();
	
	@Query("SELECT lbd FROM LeadBasicDetailsDTO lbd LEFT JOIN LeadNotesActiveTempEntity lnate ON lnate.leadId = lbd.leadId WHERE lnate.active = true ORDER BY lnate.leadNotesActivityId DESC")
	public List<LeadBasicDetailsDTO> getNotesActivityList_LEAD9();

}