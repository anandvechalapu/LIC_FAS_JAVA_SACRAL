package com.lic.epgs.trust.repository;

import com.lic.epgs.trust.dto.CommonTrustDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrustManagementRepository extends JpaRepository<CommonTrustDto, Long> {

    CommonTrustDto findByTrustId(Long trustId);
}