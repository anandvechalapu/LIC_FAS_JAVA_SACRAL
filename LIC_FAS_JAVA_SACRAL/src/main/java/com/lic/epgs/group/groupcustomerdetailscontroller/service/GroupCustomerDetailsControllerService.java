import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;

@Repository
public interface SaveGroupCustomerBasicDetailsRepository extends JpaRepository<GroupCustomerDetailsController, Long> {

	Optional<GroupCustomerDetailsController> findByGroupName(String groupName);
    
	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerDetailsController g SET g.groupName = :groupName, g.customerName = :customerName, g.customerNumber = :customerNumber WHERE g.id = :id")
	void saveGroupCustomerBasicDetails(@Param("groupName") String groupName, @Param("customerName") String customerName, @Param("customerNumber") String customerNumber, @Param("id") Long id);
	
	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerDetailsController g SET g.groupName = :groupName, g.customerName = :customerName, g.customerNumber = :customerNumber WHERE g.id = :id")
	void updateGroupCustomerRelatedDetails(@Param("groupName") String groupName, @Param("customerName") String customerName, @Param("customerNumber") String customerNumber, @Param("id") Long id);
}

package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.SaveGroupCustomerBasicDetailsRepository;

@Service
public class GroupCustomerDetailsControllerService {
	
	@Autowired
	SaveGroupCustomerBasicDetailsRepository saveGroupCustomerBasicDetailsRepository;
	
	public Optional<GroupCustomerDetailsController> findByGroupName(String groupName) {
		return saveGroupCustomerBasicDetailsRepository.findByGroupName(groupName);
	}
	
	public void saveGroupCustomerBasicDetails(String groupName, String customerName, String customerNumber, Long id) {
		saveGroupCustomerBasicDetailsRepository.saveGroupCustomerBasicDetails(groupName, customerName, customerNumber, id);
	}
	
	public void updateGroupCustomerRelatedDetails(String groupName, String customerName, String customerNumber, Long id) {
		saveGroupCustomerBasicDetailsRepository.updateGroupCustomerRelatedDetails(groupName, customerName, customerNumber, id);
	}

}