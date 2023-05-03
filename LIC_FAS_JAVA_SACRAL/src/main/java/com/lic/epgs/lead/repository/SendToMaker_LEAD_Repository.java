import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.model.Lead;

@Repository
public interface SendToMaker_LEAD_Repository extends JpaRepository<Lead, Long> {

    Lead findByLeadId(Long leadId);

    Lead save(Lead lead);

    void sendToMaker(Lead lead);

}