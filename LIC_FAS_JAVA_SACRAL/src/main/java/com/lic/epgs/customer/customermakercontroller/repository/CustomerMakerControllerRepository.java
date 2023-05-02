@Repository
public interface CustomerMakerControllerRepository {

    CommonResponseDto searchCustomerdetailsbyName(String customerName);
}