public class Product {
	
	private Long id;
	private String productName;
	private String productType;
	private Double productPrice;
	
	public Product() {}
	
	public Product(String productName, String productType, Double productPrice) {
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public Double getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
}