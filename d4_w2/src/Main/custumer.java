package Main;

public class custumer {
	private int Id;
	private String nameCustumer;
	private int tier;
	
	public custumer(int Id, String nameCustumer, int tier) {
		this.Id = Id;
		this.nameCustumer = nameCustumer;
		this.tier = tier;
	};
	
	public void setNameCustumer(String nameCustumer) {
		this.nameCustumer = nameCustumer;
	};
	
	public String getNameCustumer() {
		return nameCustumer;
	};
	public void setTier(int tier) {
		this.tier = tier;
	};
	
	public int getTier() {
		return (int) tier;
	};
}
