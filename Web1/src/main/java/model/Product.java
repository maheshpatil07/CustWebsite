package model;

public class Product {
	int productId;
	String productName;
	int price;
	int stock;
	String category;
	String supplier;
	String productDesc;
	
	public Product() {}
	
	public Product(int productId,String productName,String productDesc,int price,int stock,String category,String supplier)
	{
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.category = category;
		this.supplier = supplier;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


}
