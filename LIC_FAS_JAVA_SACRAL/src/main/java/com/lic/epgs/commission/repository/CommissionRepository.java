package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.commission.model.Commission;

public interface CommissionRepository extends JpaRepository<Commission, Long> {

    Commission findByCommissionIdAndCommissionDetailsId(String commissionId, Long commissionDetailsId);

    Commission save(Commission commission);

    Commission update(Commission commission);

    void addCommissionNotesAndQuestions(Commission commission);
    
}