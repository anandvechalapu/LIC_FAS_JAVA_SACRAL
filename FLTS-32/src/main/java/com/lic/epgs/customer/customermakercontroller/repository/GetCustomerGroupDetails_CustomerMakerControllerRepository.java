@Repository
public interface GetCustomerGroupDetails_CustomerMakerControllerRepository {

    // Method to retrieve customer group details by group code
    public CommonResponseDto getCustomerGroupDetails(String groupCode);

    // Method to handle exceptions gracefully and return appropriate error messages
    public CommonResponseDto handleError(String message);

}