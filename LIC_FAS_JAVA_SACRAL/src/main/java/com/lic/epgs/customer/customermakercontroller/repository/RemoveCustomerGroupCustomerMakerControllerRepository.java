@Repository
public interface RemoveCustomerGroupCustomerMakerControllerRepository {
    
    public CommonResponseDto removeCustomerGroupCompany(String groupId, String customerId);
    
}