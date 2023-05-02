@Repository
public interface SendToMakerGroupCustomerCheckerControllerRepository extends JpaRepository<SendToMakerGroupCustomerCheckerController, Long> {

    List<SendToMakerGroupCustomerCheckerController> findByGroupStatus(String groupStatus);

    @Modifying
    @Query("update SendToMakerGroupCustomerCheckerController set activeStatus=:activeStatus, modifiedBy=:modifiedBy, modifiedOn=:modifiedOn where groupStatus=:groupStatus")
    int updateSendToMakerGroupCustomerCheckerController(String activeStatus, String modifiedBy, Date modifiedOn, String groupStatus);

    @Modifying
    @Query(value = "INSERT INTO SendToMakerGroupCustomerCheckerController (groupStatus, activeStatus, modifiedBy, modifiedOn) VALUES (:groupStatus, :activeStatus, :modifiedBy, :modifiedOn)", nativeQuery = true)
    int insertSendToMakerGroupCustomerCheckerController(String groupStatus, String activeStatus, String modifiedBy, Date modifiedOn);

}