@Repository
public interface TrustContactDetailsRepository extends JpaRepository<ContactEntityList, Long> {
 
    CommonTrustDto listTrustContacts(Long trustId);
 
    ContactDetailsDto saveContactDetails(ContactEntityList contactEntityList);
 
    void deleteContactDetails(ContactEntityList contactEntityList);
 
    List<ContactEntityList> findAllByTrustId(Long trustId);
}