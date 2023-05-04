@Repository
public interface GetExistingSearchFilterSubCustomerMakerController2Repository extends JpaRepository<SubCustomer, Long> {

    List<SubCustomer> findByCustomerCode(String customerCode);
    List<SubCustomer> findByCustomerName(String customerName);
    List<SubCustomer> findByCustomerType(String customerType);
    List<SubCustomer> findByPan(String pan);
    List<SubCustomer> findByStartDate(Date startDate);
    List<SubCustomer> findByEndDate(Date endDate);
    List<SubCustomer> findByRoleType(String roleType);
    List<SubCustomer> findByUnitCode(String unitCode);
    List<SubCustomer> findBySubCustomerStatus(String subCustomerStatus);

    @Query("SELECT s FROM SubCustomer s ORDER BY s.customerCode DESC")
    List<SubCustomer> findAllOrderedByCustomerCode();

    @Query("SELECT s FROM SubCustomer s WHERE s.customerCode LIKE :customerCode OR s.customerName LIKE :customerName OR s.customerType LIKE :customerType OR s.pan LIKE :pan OR s.startDate LIKE :startDate OR s.endDate LIKE :endDate OR s.roleType LIKE :roleType OR s.unitCode LIKE :unitCode OR s.subCustomerStatus LIKE :subCustomerStatus ORDER BY s.customerCode DESC")
    List<SubCustomer> findByMultipleFields(@Param("customerCode") String customerCode,
                                          @Param("customerName") String customerName,
                                          @Param("customerType") String customerType,
                                          @Param("pan") String pan,
                                          @Param("startDate") Date startDate,
                                          @Param("endDate") Date endDate,
                                          @Param("roleType") String roleType,
                                          @Param("unitCode") String unitCode,
                                          @Param("subCustomerStatus") String subCustomerStatus);

}