@Service
public class ExistingProposalCommonSearchService {

    @Autowired
    private ExistingProposalCommonSearchRepository existingProposalCommonSearchRepository;

    public List<ProposalBasicDetailsDto> searchExistingProposal(ProposalCommonSearchDto searchDto) {
        return existingProposalCommonSearchRepository.searchExistingProposal(searchDto);
    }
}