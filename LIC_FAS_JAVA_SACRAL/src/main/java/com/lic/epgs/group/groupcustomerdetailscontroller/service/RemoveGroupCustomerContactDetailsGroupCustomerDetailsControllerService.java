@Service
public class RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerService {

    private final RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerRepository repository;

    public RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerService(RemoveGroupCustomerContactDetailsGroupCustomerDetailsControllerRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public int deleteGroupCustomerContactDetails(Long groupCustomerId, Long contactId) {
        return repository.deleteGroupCustomerContactDetails(groupCustomerId, contactId);
    }
}