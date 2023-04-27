import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.deposittransfer.model.DepositTransfer;

public interface SentToApproverDepositTransferRepository extends JpaRepository<DepositTransfer, Long>{
    
    Optional<DepositTransfer> findByTransferId(Long transferId);
    
    Long save(DepositTransfer depositTransfer);
    
    void deleteByTransferId(Long transferId);
    
    List<DepositTransfer> findByTransferStatusAndWorkFlowStatus(String transferStatus, String workFlowStatus);
    
    List<DepositTransfer> findAllByIsActive(Boolean isActive);
    
    List<DepositTransfer> findByModifiedBy(String modifiedBy);
    
    List<DepositTransfer> updateNotesByTransferId(Long transferId);
    
}