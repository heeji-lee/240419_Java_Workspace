package ex_240423_2;

import ex_240423.Hello;
import ex_240423.KoreanFood;
import ex_240423.Zerg;

public class TestHello {

	public static void main(String[] args) {
		// 패키지명 : ex_240423
		// 클래스명 : Hello
		// 사용할 메서드 : sum, 리턴이 있고 파라미터도 있다.
		// 사용해보기.
		// 다른 패키지의 클래스 사용하려면 : import
		int result;
		result=Hello.sum(10, 20);
		System.out.println("result : "+ result);
		
		// 앞시간에 열심히 만들었던 오늘 점심 메뉴 불러와서 사용해보기.
		// 인스턴스, 객체를 사용해서 이용함.
		KoreanFood forkSoup = new KoreanFood("섞어국밥", 9500, "밀양돼지국밥 서면점");
		forkSoup.showInfo();
		
		Zerg zerg1=new Zerg();
		zerg1.setDrone("드론9마리");
		zerg1.setZergling("6저글링");
		zerg1.selectStrategy("3해처리 뮤탈 기본 운영");
		zerg1.setHydra("히드라 4마리, 레이서, 커세어 방어용으로 뽑기");
		System.out.println("zerg1 객체를 바로 출력 "+zerg1);
		
		
		// 생성자 3개짜리 방법으로 객체 만들기.
		// Zerg(String drone, String zergling, String hydra)
		Zerg zerg2=new Zerg("드론 9마리", "저글링 4마리", "히드라 12마리");
		System.out.println("zerg1 객체를 바로 출력 "+zerg2);
		
		// Zerg라는 클래스의 공통의 멤버 전역 상수를 이용하기.
		String resultString1=zerg1.COMMONTE_STRING;
		String resultString2=zerg2.COMMONTE_STRING;
		// 결과 확인
		System.out.println("resultString1 : "+resultString1);
		System.out.println("resultString2 : "+resultString2);
	}

}
