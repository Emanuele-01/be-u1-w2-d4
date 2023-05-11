package Main;

public class product {
	private int Id;
	private String nameProduct;
	private String nameCategory;
	private double price;
	
	public product(int Id , String nameProduct, String nameCategory, double price) {
		this.Id = Id;
		this.nameProduct = nameProduct;
		this.nameCategory = nameCategory;
		this.price = price;
	};
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	};
	
	public String getNameProduct() {
		return nameProduct;
	};
	
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	};
	
	public String getNameCategory() {
		return nameCategory;
	};
	
	public void setPrice(int price) {
		this.price = price;
	};
	
	public int getPrice() {
		return (int) price;
	}
}
