@Repository
public interface GstByProposalNumber23Repository extends JpaRepository<GstByProposalNumber23, Long> {
 
    // Retrieve GST details for a given proposal number
    GstByProposalNumber23 findByProposalNumber(Long proposalNumber);
    
    // Retrieve proposal number, type of client and status
    List<GstByProposalNumber23> findByProposalNumberAndTypeOfClientAndStatus(Long proposalNumber, String typeOfClient, Integer status);
    
    // Retrieve proposal number and set status to 1 if GST exemption category is null
    List<GstByProposalNumber23> findByProposalNumberAndGstExemptionCategoryIsNull(Long proposalNumber);
    
    // Retrieve proposal number and set status to 0 if GST exemption category is not null
    List<GstByProposalNumber23> findByProposalNumberAndGstExemptionCategoryIsNotNull(Long proposalNumber);
    
    // Retrieve proposal number and return appropriate error responses if proposal number is invalid
    List<GstByProposalNumber23> findByProposalNumberAndInvalid(Long proposalNumber);
}