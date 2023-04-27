import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.gstexcemption.model.GstExcemption;

public interface GstExcemptionRepository extends JpaRepository<GstExcemption, Long> {

    GstExcemption findByGstExcemptionId(Long gstExcemptionId);

    GstExcemption save(GstExcemption gstExcemption);

    GstExcemption findByModifiedBy(String modifiedBy);

    GstExcemption findByGstExcemptionStatus(String gstExcemptionStatus);

    GstExcemption findByWorkflowStatus(String workflowStatus);

    void deleteByGstExcemptionId(Long gstExcemptionId);

}