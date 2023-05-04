package com.lic.epgs.trust.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.dto.TrustDTO;
import com.lic.epgs.trust.repository.InProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Repository;

@Service
public class InProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Service {

@Autowired
private InProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Repository inProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Repository;

public List<TrustDTO> findByTrustCodeAndUnitCodeAndRole(String trustCode, String unitCode, String role) {
	return inProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Repository.findByTrustCodeAndUnitCodeAndRole(trustCode, unitCode, role);
}

}