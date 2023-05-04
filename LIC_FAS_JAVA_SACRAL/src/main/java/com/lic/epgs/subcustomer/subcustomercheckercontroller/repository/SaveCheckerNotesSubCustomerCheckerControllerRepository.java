@Repository
public interface SaveCheckerNotesSubCustomerCheckerControllerRepository extends JpaRepository<SaveCheckerNotesSubCustomerCheckerController, Long> {

    @Query("SELECT scnsc FROM SaveCheckerNotesSubCustomerCheckerController scnsc WHERE scnsc.subCustomer = :subCustomer")
    SaveCheckerNotesSubCustomerCheckerController findBySubCustomer(String subCustomer);

    @Transactional
    void deleteBySubCustomer(String subCustomer);

    SaveCheckerNotesSubCustomerCheckerController save(SaveCheckerNotesSubCustomerCheckerController saveCheckerNotesSubCustomerCheckerController);

}