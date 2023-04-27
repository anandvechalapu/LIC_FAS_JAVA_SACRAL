@Service
@Transactional
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public Optional<Commission> findByCommissionDetailsId(Long commissionDetailsId) {
        return commissionRepository.findByCommissionDetailsId(commissionDetailsId);
    }

    public int updateCommissionStatusAndWorkflowStatusByCommissionId(Long commissionId) {
        return commissionRepository.updateCommissionStatusAndWorkflowStatusByCommissionId(commissionId);
    }

    public int deleteByCommissionDetailsIdIsNull() {
        return commissionRepository.deleteByCommissionDetailsIdIsNull();
    }

    public Optional<CommissionDetails> findCommissionDetailsByCommissionDetailsId(Long commissionDetailsId) {
        return commissionRepository.findCommissionDetailsByCommissionDetailsId(commissionDetailsId);
    }

    public List<CommissionQuestionDetailsTemp> findCommissionQuestionDetailsTempByCommissionDetailsId(Long commissionDetailsId) {
        return commissionRepository.findCommissionQuestionDetailsTempByCommissionDetailsId(commissionDetailsId);
    }

    public List<CommissionNotesTemp> findCommissionNotesTempByCommissionDetailsId(Long commissionDetailsId) {
        return commissionRepository.findCommissionNotesTempByCommissionDetailsId(commissionDetailsId);
    }

}