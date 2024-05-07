package ex_240423;

public class Drama {
	
	public static final String COMMENT="7인의 탈출 재밌어!!";
	
	public static String showComment() {
		return COMMENT;
	}
	
	private String dramaName;
	private String dramaTime;
	private String dramaChannel;
	
	public String getDramaName() {
		return dramaName;
	}
	public void setDramaName(String dramaName) {
		this.dramaName = dramaName;
	}
	public String getDramaTime() {
		return dramaTime;
	}
	public void setDramaTime(String dramaTime) {
		this.dramaTime = dramaTime;
	}
	public String getDramaChannel() {
		return dramaChannel;
	}
	public void setDramaChannel(String dramaChannel) {
		this.dramaChannel = dramaChannel;
	}
	
	public void showInfo() {
		System.out.println("dramaName=" + this.dramaName + ", dramaTime=" + this.dramaTime + ", dramaChannel=" + this.dramaChannel);
	}
	
	@Override
	public String toString() {
		return "Drama [dramaName=" + dramaName + ", dramaTime=" + dramaTime + ", dramaChannel=" + dramaChannel + "]";
	}
	
	
	
	public void Characters() {
		System.out.println("매튜 리, 금라희, 민도혁, 한모네, 차주란, 양진모, 고명지, 남철우, 방칠성, 강기탁, 황찬성, 메두사");			
	}
	
	public Drama(String dramaName, String dramaTime, String dramaChannel) {
		super();
		this.dramaName = dramaName;
		this.dramaTime = dramaTime;
		this.dramaChannel = dramaChannel;
	}
	
	public Drama() {
		
	}
	
	
	
}
