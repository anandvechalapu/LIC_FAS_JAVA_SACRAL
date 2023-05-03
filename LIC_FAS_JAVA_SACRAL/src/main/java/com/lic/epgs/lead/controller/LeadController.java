@RestController
@RequestMapping("/epgs/lead")
public class LeadController {

	@Autowired
	private SendToCheckerLeadService sendToCheckerLeadService;
	
	@GetMapping("/findByLeadId/{leadId}")
	public Optional<LeadBasicDetailsTempEntity> findByLeadId(@PathVariable Long leadId) {
		return sendToCheckerLeadService.findByLeadId(leadId);
	}
	
	@PutMapping("/updateLeadBasicDetailsTempEntity/{leadId}")
	public int updateLeadBasicDetailsTempEntity(@PathVariable Long leadId, @RequestParam String modifiedBy, @RequestParam String leadStatus,
			@RequestParam String leadSubStatus, @RequestParam String workflowStatus) {
		return sendToCheckerLeadService.updateLeadBasicDetailsTempEntity(leadId, modifiedBy, leadStatus, leadSubStatus, workflowStatus);
	}
	
	@PutMapping("/updateLeadProductDetailsTempEntity/{leadId}")
	public int updateLeadProductDetailsTempEntity(@PathVariable Long leadId, @RequestParam String modifiedBy, @RequestParam String createdBy,
			@RequestParam Date createdOn) {
		return sendToCheckerLeadService.updateLeadProductDetailsTempEntity(leadId, modifiedBy, createdBy, createdOn);
	}
	
	@PutMapping("/updateLeadChannelDetailsTempEntity/{leadId}")
	public int updateLeadChannelDetailsTempEntity(@PathVariable Long leadId, @RequestParam String modifiedBy, @RequestParam String createdBy,
			@RequestParam Date createdOn) {
		return sendToCheckerLeadService.updateLeadChannelDetailsTempEntity(leadId, modifiedBy, createdBy, createdOn);
	}
	
	@PutMapping("/updateLeadNotesActiveTempEntity/{leadId}")
	public int updateLeadNotesActiveTempEntity(@PathVariable Long leadId, @RequestParam String modifiedBy, @RequestParam String createdBy,
			@RequestParam Date createdOn) {
		return sendToCheckerLeadService.updateLeadNotesActiveTempEntity(leadId, modifiedBy, createdBy, createdOn);
	}
	
	@GetMapping("/getLeadResponse/{leadId}")
	public LeadResponse getLeadResponse(@PathVariable Long leadId) {
		return sendToCheckerLeadService.getLeadResponse(leadId);
	}

}