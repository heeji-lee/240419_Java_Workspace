package ex_240423;

public class StarCraft_BattleNet_Asia {
	
	public static void main(String[] args) {
		System.out.println("스타크래프트로 자바의 기본 객체 순서 및 게터/세터, 함수 등 해보기.");
		// 작업 순서1, 저그 객체를 생성한다.
		Zerg zerg1 = new Zerg();
		// 작업 순서2, 드론을 만들기.
		zerg1.setDrone("9드론 생산함");
		// 작업 순서3, 드론으로 미네랄, 가스 채취하기.
		zerg1.makeMoney();
		// 작업 순서4, 드론으로 정찰 보내기, 상대 종족
		zerg1.patrolDrone();
		// 작업 순서5, 전략 선택하기
		String ZergStrategy = "몰라. 알아서 해.";
		zerg1.selectStrategy(ZergStrategy);
		
		System.out.println("심각한 게임 중독입니다.");
		
	}
	
}
