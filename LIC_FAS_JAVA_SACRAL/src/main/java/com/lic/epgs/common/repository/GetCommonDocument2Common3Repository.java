@Repository
public interface GetCommonDocument2Common3Repository extends JpaRepository<CommonDocument2Common3, Long> {

	/**
	 * Retrieve the details of common documents for a specific product and variant, based on document category and sub-category.
	 *
	 * @param productId		Product ID
	 * @param variantId		Variant ID
	 * @param category		Document category
	 * @param subCategory	Document sub-category
	 * @return				List of {@link CommonDocument2Common3DTO}s
	 * @throws ApplicationException	If no data is found for the provided values
	 */
	List<CommonDocument2Common3DTO> getCommonDocument2Common3(Long productId, Long variantId, String category, String subCategory) throws ApplicationException;
}