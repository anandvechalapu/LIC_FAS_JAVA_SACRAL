@Service
public class LoadCommissionNotesService {

    @Autowired
    private LoadCommissionNotesRepository loadCommissionNotesRepository;

    public List<CommissionNotes> getCommissionNotesByCommissionId(Integer commissionId) {
        return loadCommissionNotesRepository.getCommissionNotesByCommissionId(commissionId);
    }

}