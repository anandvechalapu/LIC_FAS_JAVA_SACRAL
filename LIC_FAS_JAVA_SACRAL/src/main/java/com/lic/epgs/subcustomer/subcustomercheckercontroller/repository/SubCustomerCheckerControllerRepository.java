import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCustomerCheckerControllerRepository extends JpaRepository<SubCustomerCheckerController, Long> {

    SubCustomerCheckerController getExitingSubCustomerDetails(String subCustomerId);

}