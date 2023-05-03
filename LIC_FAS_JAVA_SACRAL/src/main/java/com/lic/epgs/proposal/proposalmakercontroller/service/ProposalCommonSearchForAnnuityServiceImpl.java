@Service
@Transactional
public class ProposalCommonSearchForAnnuityServiceImpl implements ProposalCommonSearchForAnnuityService {

    private final ProposalCommonSearchForAnnuityRepository proposalCommonSearchForAnnuityRepository;

    public ProposalCommonSearchForAnnuityServiceImpl(ProposalCommonSearchForAnnuityRepository proposalCommonSearchForAnnuityRepository) {
        this.proposalCommonSearchForAnnuityRepository = proposalCommonSearchForAnnuityRepository;
    }

    @Override
    public List<ProposalCommonSearchForAnnuity> getAnnuityProposals(String unitCode, Integer pageCount, Integer limit) {
        return proposalCommonSearchForAnnuityRepository.getAnnuityProposals(unitCode, pageCount, limit);
    }

}