@Service
public class GstByProposalNumber23Service {

    private final GstByProposalNumber23Repository gstByProposalNumber23Repository;

    @Autowired
    public GstByProposalNumber23Service(GstByProposalNumber23Repository gstByProposalNumber23Repository) {
        this.gstByProposalNumber23Repository = gstByProposalNumber23Repository;
    }

    // Retrieve GST details for a given proposal number
    public GstByProposalNumber23 findByProposalNumber(Long proposalNumber) {
        return gstByProposalNumber23Repository.findByProposalNumber(proposalNumber);
    }
    
    // Retrieve proposal number, type of client and status
    public List<GstByProposalNumber23> findByProposalNumberAndTypeOfClientAndStatus(Long proposalNumber, String typeOfClient, Integer status) {
        return gstByProposalNumber23Repository.findByProposalNumberAndTypeOfClientAndStatus(proposalNumber, typeOfClient, status);
    }
    
    // Retrieve proposal number and set status to 1 if GST exemption category is null
    public List<GstByProposalNumber23> findByProposalNumberAndGstExemptionCategoryIsNull(Long proposalNumber) {
        return gstByProposalNumber23Repository.findByProposalNumberAndGstExemptionCategoryIsNull(proposalNumber);
    }
    
    // Retrieve proposal number and set status to 0 if GST exemption category is not null
    public List<GstByProposalNumber23> findByProposalNumberAndGstExemptionCategoryIsNotNull(Long proposalNumber) {
        return gstByProposalNumber23Repository.findByProposalNumberAndGstExemptionCategoryIsNotNull(proposalNumber);
    }
    
    // Retrieve proposal number and return appropriate error responses if proposal number is invalid
    public List<GstByProposalNumber23> findByProposalNumberAndInvalid(Long proposalNumber) {
        return gstByProposalNumber23Repository.findByProposalNumberAndInvalid(proposalNumber);
    }
    
}