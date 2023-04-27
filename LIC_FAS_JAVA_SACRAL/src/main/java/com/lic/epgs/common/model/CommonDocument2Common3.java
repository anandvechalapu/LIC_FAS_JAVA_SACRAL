/**
 * Entity/Model class for common documents.
 */
@Entity
@Table(name = "COMMON_DOCUMENT2_COMMON3")
public class CommonDocument2Common3 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD2C3_ID")
	private Long id;

	@Column(name = "CD2C3_PRODUCT_ID")
	private Long productId;

	@Column(name = "CD2C3_VARIANT_ID")
	private Long variantId;

	@Column(name = "CD2C3_CATEGORY")
	private String category;

	@Column(name = "CD2C3_SUB_CATEGORY")
	private String subCategory;

	@Column(name = "CD2C3_DOCUMENT_NAME")
	private String documentName;

	@Column(name = "CD2C3_DOCUMENT_DESCRIPTION")
	private String documentDescription;

	@Column(name = "CD2C3_DOCUMENT_TYPE")
	private String documentType;

	@Column(name = "CD2C3_DOCUMENT_FILE")
	private String documentFile;

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getVariantId() {
		return variantId;
	}

	public void setVariantId(Long variantId) {
		this.variantId = variantId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentDescription() {
		return documentDescription;
	}

	public void setDocumentDescription(String documentDescription) {
		this.documentDescription = documentDescription;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentFile() {
		return documentFile;
	}

	public void setDocumentFile(String documentFile) {
		this.documentFile = documentFile;
	}
}