import org.springframework.data.jpa.repository.JpaRepository;

public interface CloseLeadLEAD3Repository extends JpaRepository<CloseLeadLEAD3, Integer> {

    CloseLeadLEAD3 findByLeadIdAndModifiedByAndLeadStatus(Integer leadId, String modifiedBy, String leadStatus); 

    CloseLeadLEAD3 save(CloseLeadLEAD3 closeLeadLEAD3); 

}