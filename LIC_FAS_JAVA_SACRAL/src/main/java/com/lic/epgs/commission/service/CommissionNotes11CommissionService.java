@Service
public class CommissionNotes11CommissionService {
    @Autowired
    private SaveCommissionNotes11CommissionRepository saveCommissionNotes11CommissionRepository;
    
    //Deactivates the commission notes object with the given ID and updates the modified date and user
    public void deactivateCommissionNotes11Commission(Long commissionId, LocalDateTime modifiedDate, Long modifiedUser){
        saveCommissionNotes11CommissionRepository.deactivateCommissionNotes11Commission(commissionId, modifiedDate, modifiedUser);
    }
    
    //Creates a new commission notes object
    public CommissionNotes11Commission save(CommissionNotes11Commission commissionNotes11Commission){
        return saveCommissionNotes11CommissionRepository.save(commissionNotes11Commission);
    }
    
    //Returns the commission notes object with the given ID
    public Optional<CommissionNotes11Commission> findById(Long commissionId){
        return saveCommissionNotes11CommissionRepository.findById(commissionId);
    }
    
    //Returns a response object with the commission ID, commission notes object and a success message
    public CommissionNotes11CommissionResponse findResponseById(Long commissionId){
        return saveCommissionNotes11CommissionRepository.findResponseById(commissionId);
    }
}