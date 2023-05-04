package com.lic.epgs.trust.repository;

import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
 
import com.lic.epgs.trust.dto.TrustDTO;

public interface InProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Repository extends JpaRepository<TrustDTO, Long> {

@Query("SELECT t FROM TrustDTO t WHERE t.trustCode = :trustCode AND t.unitCode = :unitCode AND t.role = :role")
List<TrustDTO> findByTrustCodeAndUnitCodeAndRole(@Param("trustCode") String trustCode, @Param("unitCode") String unitCode, @Param("role") String role);

}