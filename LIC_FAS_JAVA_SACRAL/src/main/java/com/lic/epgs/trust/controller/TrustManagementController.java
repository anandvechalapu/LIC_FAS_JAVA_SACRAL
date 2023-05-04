package com.lic.epgs.trust.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.dto.TrustDTO;
import com.lic.epgs.trust.service.InProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Service;

@RestController
@RequestMapping("/trust")
public class TrustManagementController {

@Autowired
private InProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Service inProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Service;

@GetMapping("/search")
public List<TrustDTO> searchByTrustCodeAndUnitCodeAndRole(@RequestParam String trustCode, @RequestParam String unitCode, @RequestParam String role) {
	return inProgressTrustCodeSearchTRUSTMANAGEMENTCONTROLLER15Service.findByTrustCodeAndUnitCodeAndRole(trustCode, unitCode, role);
}

}