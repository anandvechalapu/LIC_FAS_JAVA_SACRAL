@Repository
public interface InprocesscustomerSearchCustomerMakerControllerRepository extends JpaRepository<CommonResponseDto, Long> {
    CommonResponseDto getInprocessCustomerSearch(String roleType, String unitCode, String customerName, String trustCode, String trustName);
}