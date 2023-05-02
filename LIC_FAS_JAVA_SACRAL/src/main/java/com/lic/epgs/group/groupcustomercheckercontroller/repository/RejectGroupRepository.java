must be logged in the database.

package com.lic.epgs.group.groupcustomercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.group.groupcustomercheckercontroller.model.GroupCustomerBasicDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.model.GroupCustomerBasicDetailsTempEntity;

public interface RejectGroupRepository extends JpaRepository<GroupCustomerBasicDetailsTempEntity, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerBasicDetailsTempEntity gc SET gc.isActive = false WHERE gc.groupCustomerId = :groupCustomerId")
	void rejectGroupCustomerTemp(@Param("groupCustomerId") Long groupCustomerId);

	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerBasicDetailsTempEntity gc SET gc.rejectionRemarks = :rejectionRemarks, gc.modifiedBy = :modifiedBy WHERE gc.groupCustomerId = :groupCustomerId")
	void updateRejectionRemarks(@Param("groupCustomerId") Long groupCustomerId, @Param("rejectionRemarks") String rejectionRemarks, @Param("modifiedBy") String modifiedBy);

	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerBasicDetailsEntity gc SET gc.groupStatus = :status, gc.workflowStatus = :workflowStatus WHERE gc.groupCode = :groupCode AND gc.defunctFlag = true")
	void updateGroupStatusForDefunct(@Param("groupCode") String groupCode, @Param("status") String status, @Param("workflowStatus") String workflowStatus);

	@Transactional
	@Modifying
	@Query("UPDATE GroupCustomerBasicDetailsEntity gc SET gc.groupStatus = :status, gc.workflowStatus = :workflowStatus WHERE gc.groupCode = :groupCode AND gc.groupStatus = 'REOPEN'")
	void updateGroupStatusForReopen(@Param("groupCode") String groupCode, @Param("status") String status, @Param("workflowStatus") String workflowStatus);
	
	@Transactional
	@Modifying
	@Query("INSERT INTO GroupCustomerBasicDetailsEntity (groupCode, groupStatus, workflowStatus, tempGroupCustomerId) VALUES(:groupCode, :groupStatus, :workflowStatus, :tempGroupCustomerId)")
	void insertGroupCustomerBasicDetails(@Param("groupCode") String groupCode, @Param("groupStatus") String groupStatus, @Param("workflowStatus") String workflowStatus, @Param("tempGroupCustomerId") Long tempGroupCustomerId);
}