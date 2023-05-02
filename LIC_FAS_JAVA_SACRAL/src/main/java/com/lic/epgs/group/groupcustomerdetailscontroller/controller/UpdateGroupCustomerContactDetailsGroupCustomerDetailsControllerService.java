@Service
public class UpdateGroupCustomerContactDetailsGroupCustomerDetailsControllerService {

    private final UpdateGroupCustomerContactDetailsGroupCustomerDetailsControllerRepository repository;

    public UpdateGroupCustomerContactDetailsGroupCustomerDetailsControllerService(UpdateGroupCustomerContactDetailsGroupCustomerDetailsControllerRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public int updateGroupCustomerContactDetails(Long groupCustomerId, Long contactId) {
        return repository.updateGroupCustomerContactDetails(groupCustomerId, contactId);
    }
}

@RestController
@RequestMapping("/group/customer/details/controller")
public class GroupCustomerDetailsController {
    
    private final RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerService removeGroupCustomerContactDetailsGroupCustomerDetailsControllerService;
    private final UpdateGroupCustomerContactDetailsGroupCustomerDetailsControllerService updateGroupCustomerContactDetailsGroupCustomerDetailsControllerService;
    
    public GroupCustomerDetailsController(
        RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerService removeGroupCustomerContactDetailsGroupCustomerDetailsControllerService, 
        UpdateGroupCustomerContactDetailsGroupCustomerDetailsControllerService updateGroupCustomerContactDetailsGroupCustomerDetailsControllerService) {
        this.removeGroupCustomerContactDetailsGroupCustomerDetailsControllerService = removeGroupCustomerContactDetailsGroupCustomerDetailsControllerService;
        this.updateGroupCustomerContactDetailsGroupCustomerDetailsControllerService = updateGroupCustomerContactDetailsGroupCustomerDetailsControllerService;
    }
    
    @DeleteMapping("/delete/contact/details")
    public ResponseEntity<Object> deleteGroupCustomerContactDetails(@RequestParam Long groupCustomerId, @RequestParam Long contactId) {
        return ResponseEntity.ok(removeGroupCustomerContactDetailsGroupCustomerDetailsControllerService.deleteGroupCustomerContactDetails(groupCustomerId, contactId));
    }
    
    @PutMapping("/update/contact/details")
    public ResponseEntity<Object> updateGroupCustomerContactDetails(@RequestParam Long groupCustomerId, @RequestParam Long contactId) {
        return ResponseEntity.ok(updateGroupCustomerContactDetailsGroupCustomerDetailsControllerService.updateGroupCustomerContactDetails(groupCustomerId, contactId));
    }
    
}