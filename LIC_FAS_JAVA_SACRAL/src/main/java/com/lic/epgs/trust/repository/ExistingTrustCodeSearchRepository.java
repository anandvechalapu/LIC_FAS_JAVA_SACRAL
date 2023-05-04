@Repository
public interface ExistingTrustCodeSearchRepository extends JpaRepository<CommonTrustDto, Long> {
 
    List<CommonTrustDto> findByTrustCodeAndUnitCode(String trustCode, String unitCode);
    List<CommonTrustDto> findByStatusInAndTrustCodeAndUnitCode(List<String> status, String trustCode, String unitCode);
    List<CommonTrustDto> findByTransactionMessage(String transactionMessage);
}