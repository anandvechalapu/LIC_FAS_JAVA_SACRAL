import org.springframework.data.jpa.repository.JpaRepository;

public interface GetProductSubVariantNameListRepository extends JpaRepository<GetProductSubVariantNameList, Long> {
	
	List<GetProductSubVariantNameList> getProductSubVariantNameList_PROPOSALMAKERCONTROLLER12(Long productVariantId);

}