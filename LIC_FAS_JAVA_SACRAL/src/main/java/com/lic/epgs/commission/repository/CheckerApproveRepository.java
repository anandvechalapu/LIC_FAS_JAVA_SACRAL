import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;

@Repository
public interface CheckerApproveRepository extends JpaRepository<CommissionEntity, Long> {
    
    @Transactional
    @Modifying
    @Query("UPDATE CommissionEntity c SET c.status = 'approved' WHERE c.commissionId = :commissionId AND c.role = :role")
    int updateCommissionStatus(String commissionId, String role);

    @Transactional
    @Modifying
    @Query("INSERT INTO CommissionTempEntity c (c.commissionId, c.status) VALUES (:commissionId, 'approved')")
    int insertCommissionTemp(String commissionId);

    @Transactional
    @Modifying
    @Query("INSERT INTO CommissionNotesEntity c (c.commissionId, c.notes) VALUES (:commissionId, :notes)")
    int insertCommissionNotes(String commissionId, String notes);

    @Transactional
    @Modifying
    @Query("INSERT INTO CommissionQuestionEntity c (c.commissionId, c.question) VALUES (:commissionId, :question)")
    int insertCommissionQuestion(String commissionId, String question);
}