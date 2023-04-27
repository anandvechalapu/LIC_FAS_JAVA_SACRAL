@Service
public class GetCommonDocument2Common3ServiceImpl implements GetCommonDocument2Common3Service {

	@Autowired
	private GetCommonDocument2Common3Repository repository;

	@Override
	public List<CommonDocument2Common3DTO> getCommonDocument2Common3(Long productId, Long variantId, String category,
			String subCategory) throws ApplicationException {
		List<CommonDocument2Common3DTO> commonDocument2Common3DTOs;
		try {
			commonDocument2Common3DTOs = repository.getCommonDocument2Common3(productId, variantId, category,
					subCategory);
		} catch (Exception e) {
			throw new ApplicationException("Error occured while retrieving common documents for a product and variant",
					e);
		}
		return commonDocument2Common3DTOs;
	}

}