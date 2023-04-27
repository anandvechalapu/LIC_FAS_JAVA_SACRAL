@Repository
public interface GetExistingLoadStampDutyRepository extends JpaRepository<StampDuty, Long> {

    Optional<StampDuty> findByRoleAndUnitOfficeCode(String role, String unitOfficeCode);

}