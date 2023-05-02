@Repository
public interface GroupCustomerDetailsControllerRepository extends JpaRepository<GroupCustomerDetailsController, Long> { 
 
    List<GroupCustomerDetailsController> getInProgressCommonSearch_GROUP_CUSTOMER_DETAILS_CONTROLLER(String groupName, String groupCode, String groupStatus, String workflowStatus,
                                                                                                    Integer pageCount, Integer limit, Date startDate, Date endDate);
}