@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Long> {
	
	List<CommonStatus> findAllByIsActiveTrue();
	List<CommonStatus> findAllByIsActiveFalse();
	List<CommonStatus> findAllByIsActive();
	Optional<CommonStatus> findByIdAndIsActiveTrue(Long id);
	Long countByIdAndIsActiveTrue(Long id);
	Long countByIdAndIsActiveFalse(Long id);
}

package com.lic.epgs.common.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.CommonStatus;
import com.lic.epgs.common.service.CommonStatusService;

@RestController
@RequestMapping("/commonstatus")
public class CommonStatusController {
	
	@Autowired
	private CommonStatusService commonStatusService;
	
	@GetMapping
	public List<CommonStatus> findAllByIsActiveTrue() {
		return commonStatusService.findAllByIsActiveTrue();
	}
	
	@GetMapping("/active/{id}")
	public Optional<CommonStatus> findByIdAndIsActiveTrue(@PathVariable Long id) {
		return commonStatusService.findByIdAndIsActiveTrue(id);
	}
	
	@GetMapping("/inactive/{id}")
	public Long countByIdAndIsActiveFalse(@PathVariable Long id) {
		return commonStatusService.countByIdAndIsActiveFalse(id);
	}
}