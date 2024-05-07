package util.dto;

public class LunchFood {
	// 멤버 5개 정하고, 1)생성자 5개짜리 2)게터/세터 3)toString
	private int foodPrice;
	private String foodRegDate;
	private String foodmodDate;
	private String foodLocator;
	private String foodName;
	
	public LunchFood(int foodPrice, String foodRegDate, String foodmodDate, String foodLocator, String foodName) {
		super();
		this.foodPrice = foodPrice;
		this.foodRegDate = foodRegDate;
		this.foodmodDate = foodmodDate;
		this.foodLocator = foodLocator;
		this.foodName = foodName;
	}
	
	@Override
	public String toString() {
		return "LunchFood [foodPrice=" + foodPrice + ", foodRegDate=" + foodRegDate + ", foodmodDate=" + foodmodDate
				+ ", foodLocator=" + foodLocator + ", foodName=" + foodName + "]";
	}
	
	public int getFoodPrice() {
		return foodPrice;
	}
	
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	public String getFoodRegDate() {
		return foodRegDate;
	}
	
	public void setFoodRegDate(String foodRegDate) {
		this.foodRegDate = foodRegDate;
	}
	
	public String getFoodmodDate() {
		return foodmodDate;
	}
	
	public void setFoodmodDate(String foodmodDate) {
		this.foodmodDate = foodmodDate;
	}
	
	public String getFoodLocator() {
		return foodLocator;
	}
	
	public void setFoodLocator(String foodLocator) {
		this.foodLocator = foodLocator;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
}