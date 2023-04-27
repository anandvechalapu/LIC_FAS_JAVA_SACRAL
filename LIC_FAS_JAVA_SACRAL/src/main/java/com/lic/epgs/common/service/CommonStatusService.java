@Service
public class CommonStatusService {

	@Autowired
	private CommonStatusRepository commonStatusRepository;
	
	public List<CommonStatus> findAllByIsActiveTrue(){
		return commonStatusRepository.findAllByIsActiveTrue();
	}
	
	public List<CommonStatus> findAllByIsActiveFalse(){
		return commonStatusRepository.findAllByIsActiveFalse();
	}
	
	public List<CommonStatus> findAllByIsActive(){
		return commonStatusRepository.findAllByIsActive();
	}
	
	public Optional<CommonStatus> findByIdAndIsActiveTrue(Long id){
		return commonStatusRepository.findByIdAndIsActiveTrue(id);
	}
	
	public Long countByIdAndIsActiveTrue(Long id) {
		return commonStatusRepository.countByIdAndIsActiveTrue(id);
	}
	
	public Long countByIdAndIsActiveFalse(Long id) {
		return commonStatusRepository.countByIdAndIsActiveFalse(id);
	}
}