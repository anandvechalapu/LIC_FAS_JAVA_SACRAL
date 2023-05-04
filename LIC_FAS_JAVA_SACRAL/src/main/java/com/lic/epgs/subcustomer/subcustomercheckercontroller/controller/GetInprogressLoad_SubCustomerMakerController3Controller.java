package com.lic.epgs.subcustomer.subcustomercheckercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GetInprogressLoad_SubCustomerMakerController3Repository extends JpaRepository<DataModel, Long> {

	@Query("SELECT dm FROM DataModel dm WHERE dm.roleType = ?1 AND dm.unitCode = ?2")
	List<DataModel> getInprogressLoad_SubCustomerMakerController3(String roleType, String unitCode);

}

package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller; 
  
import java.util.List; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
 
import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.DataModel; 
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.GetInprogressLoad_SubCustomerMakerController3Service; 
 
@RestController 
public class GetInprogressLoad_SubCustomerMakerController3Controller { 
	 
	@Autowired 
	GetInprogressLoad_SubCustomerMakerController3Service getInprogressLoad_SubCustomerMakerController3Service; 
	 
	@PostMapping("/getInprogressLoad_SubCustomerMakerController3") 
	public List<DataModel> getInprogressLoad_SubCustomerMakerController3(@RequestParam String roleType, @RequestParam String unitCode){ 
		return getInprogressLoad_SubCustomerMakerController3Service.getInprogressLoad_SubCustomerMakerController3(roleType, unitCode); 
	} 
	 
}