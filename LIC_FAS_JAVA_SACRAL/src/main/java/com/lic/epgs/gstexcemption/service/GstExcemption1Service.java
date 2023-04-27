package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.model.GstExcemption1;
import com.lic.epgs.gstexcemption.repository.GstExcemption1Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstExcemption1Service {

    @Autowired
    private GstExcemption1Repository gstExcemption1Repository;

    public GstExcemption1 saveGstExcemption1(GstExcemption1 gstExcemption1) {
        return gstExcemption1Repository.save(gstExcemption1);
    }

    public int updateExistingRecord(Long gstexcemptionId) {
        return gstExcemption1Repository.updateExistingRecord(gstexcemptionId);
    }

}