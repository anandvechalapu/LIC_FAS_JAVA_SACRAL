@Repository
public interface SaveLmsLeadBasicDetailsLeadRepository {

    public ResponseEntity<Object> saveLmsLeadBasicDetails(String leadName, String lmsLeadNumber, String leadContactNumber, 
    String pan, String emailId, String customerCode, String customerName, String trustName, String product, 
    String subProduct, String lineOfBusiness, int numberOfLives, int premiumExpected, String unitOfficeId, 
    String moCode, String moName, String intermediaryCode, String intermediaryName, String intermediaryContactNumber, 
    String leadSourceType, String leadSourceName);

}