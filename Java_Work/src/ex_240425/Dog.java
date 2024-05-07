package ex_240425;

public class Dog {
	private String place;
	private String type;
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void speakSound(String sound) {
		System.out.println("사운드 : " + sound);
	}
	
	public void moveAction(String action) {
		System.out.println("움직임 : " + action);		
	}
	
}
