package ex_240423;

public class Zerg {
	// Zerg 클래스 이용하는 모든 객체에서 공동으로 사용이 가능한
	// static 설명 : 전역 상수
	public static final String COMMONTE_STRING="스타1에서 저그가 짱이다. 개인적인 의견.";
	
	// 멤버
	private String drone;
	private String zergling;
	private String hydra;
	
	// 멤버의 값에 접근 또는 설정을 위해서 getter/setter를 만든다.
	public String getDrone() {
		return drone;
	}
	public void setDrone(String drone) {
		this.drone = drone;
	}
	public String getZergling() {
		return zergling;
	}
	public void setZergling(String zergling) {
		this.zergling = zergling;
	}
	public String getHydra() {
		return hydra;
	}
	public void setHydra(String hydra) {
		this.hydra = hydra;
	}
	
	// 드론 일하기 메서드 만들기.
	public void makeMoney() {
		System.out.println("드론으로 미네랄, 가스 같이 채취하기.");
	}
	
	// 정찰을 반드시 보내야함.
	public void patrolDrone() {
		System.out.println("드론으로 스타팅 포인트로 정찰 보내기.");			
	}
	
	public void selectStrategy(String strategy) {
		System.out.println("내가 선택한 전략 : " + strategy);
	}
	
	// 생성자 -> 객체를 생성시 멤버의 파라미터를 미리 사용할지 여부를 정하기.
	// 매개변수 3개짜리 생성자
	public Zerg(String drone, String zergling, String hydra) {
		super();
		this.drone = drone;
		this.zergling = zergling;
		this.hydra = hydra;
	}
	
	// 매개변수가 없는 생성자, = 디폴트 생성자라고 함.
	// 별로 말이 없으면, 시스템이 알아서 만들어줌.
	// 하지만, 내가 따로 매개변수가 있는 생성자를 만들면 기본 생성자를 안 만들어줌.
	public Zerg() {
		
	}
	
	// toString, 해당 객체에 있는 내용ㅇ을 한방에 출력해주는 메서드 만들기.
	// 우클릭 -> Source -> Generate toString -> 멤버 3개 선택하고 만들기, 옵션 선택 무.
	@Override
	public String toString() {
		return "Zerg [drone=" + drone + ", zergling=" + zergling + ", hydra=" + hydra + "]";
	}
}
