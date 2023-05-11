package Main;

public class order {
	private int Id;
	private String status;
	private String orderDate;
	private String deliveryDate;
	private product products;
	private custumer Custumers;
	
	public order(int Id, String status, String orderDate, String deliveryDate, product products, custumer Custumers) {
		this.Id = Id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.Custumers = Custumers;
	};
	
	public void setStatus(String status) {
		this.status = status;
	};
	
	public String getStatus() {
		return status;
	};
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	};
	
	public String getOrderDate() {
		return orderDate;
	};
	
	public void setDeliveryDate(String deliveryDate) {
		this.orderDate = deliveryDate;
	};
	
	public String getDeliveryDate() {
		return deliveryDate;
	};
	
}
