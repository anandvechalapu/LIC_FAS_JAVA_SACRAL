@Repository
public interface SendToChecker4GstExcemptionRepository extends JpaRepository<GstExcemption, Long> {
    @Modifying
    @Query(value = "UPDATE gst_excemption SET status = :status, workflow_status = :workflowStatus WHERE id = :id", nativeQuery = true)
    int updateGstExcemption(@Param("id") Long id, @Param("status") String status, @Param("workflowStatus") String workflowStatus);
    
    @Query(value = "SELECT * FROM gst_excemption WHERE id = :id", nativeQuery = true)
    Optional<GstExcemption> findById(@Param("id") Long id);
}

// Spring Boot Controller Class
package com.lic.epgs.gstexcemption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.service.SendToChecker4GstExcemptionService;

@RestController
@RequestMapping("/gstexcemption")
public class GstExcemptionController {
    
    @Autowired
    private SendToChecker4GstExcemptionService sendToChecker4GstExcemptionService;
    
    @PutMapping("/update")
    public int updateGstExcemption(@RequestBody GstExcemption gstExcemption) {
        return sendToChecker4GstExcemptionService.updateGstExcemption(gstExcemption.getId(), gstExcemption.getStatus(), gstExcemption.getWorkflowStatus());
    }
    
    @GetMapping("/{id}")
    public Optional<GstExcemption> getGstExcemption(@PathVariable Long id) {
        return sendToChecker4GstExcemptionService.findById(id);
    }
}