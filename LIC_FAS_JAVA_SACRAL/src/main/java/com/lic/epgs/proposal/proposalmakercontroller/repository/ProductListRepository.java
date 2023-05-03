import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;

public interface ProductListRepository extends JpaRepository<Product, Long> {
	List<Product> findByProductType(String productType);
}