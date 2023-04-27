package com.lic.epgs.commission.repository;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoadQuestionMaster6CommissionRepository extends JpaRepository<CommonCommissionDto, Long> {
    @Query(value = "SELECT * FROM COMMISSION_TABLE WHERE STATUS = 'DRAFT'", nativeQuery = true)
    List<CommonCommissionDto> loadQuestionMaster();
}