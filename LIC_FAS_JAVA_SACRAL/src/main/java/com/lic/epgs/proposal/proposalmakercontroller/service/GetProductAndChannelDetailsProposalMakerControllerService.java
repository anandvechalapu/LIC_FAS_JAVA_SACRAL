@Service
@Component
public class GetProductAndChannelDetailsProposalMakerControllerService {
 
    @Autowired
    private GetProductAndChannelDetailsProposalMakerControllerRepository getProductAndChannelDetailsProposalMakerControllerRepository;
 
    public List<Lead> findByLeadId(Long leadId) {
        return getProductAndChannelDetailsProposalMakerControllerRepository.findByLeadId(leadId);
    }
 
    public Lead save(Lead lead) {
        return getProductAndChannelDetailsProposalMakerControllerRepository.save(lead);
    }
 
    public List<Lead> findAll() {
        return getProductAndChannelDetailsProposalMakerControllerRepository.findAll();
    }
 
    public void deleteById(Long leadId) {
        getProductAndChannelDetailsProposalMakerControllerRepository.deleteById(leadId);
    }
 
    public Optional<Lead> findById(Long leadId) {
        return getProductAndChannelDetailsProposalMakerControllerRepository.findById(leadId);
    }
}