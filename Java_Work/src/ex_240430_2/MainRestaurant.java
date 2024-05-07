package ex_240430_2;

import util.RandomSelectNumber;

public class MainRestaurant {

	public static void main(String[] args) {
		// 확인
		RiceRiceNoodle lhj = new RiceRiceNoodle();
		
		System.out.println("쌀국수 만들기.");
		
		lhj.boiledNoodle("5분");
		String[] toppStrings = {"고수","양파","숙주","소고기","쪽파","레몬"};
		lhj.addTopping(toppStrings);
		String[] soupSource = {"멸치","다시다","월계수","후추","팔각","향신료"};
		lhj.makeSoup(soupSource);
		String[] source = {"칠리","땅콩","피쉬"};
		lhj.makeSource(source);
		
		// 1. 가는 면 2. 굵은 면
		lhj.selectNoodleSize(1);
		
		System.out.println("쌀국수 완성");
		
		// 시식
		String[] eatMembers = {"오현제","이한솔","이상용","임채수","김소영","이수진","강루키"};
		// 랜덤 멤버 한명 뽑기
		// util 패키지 : 자주 사용하는 기능들 모아두기.
		// RandomSelectNumber, 메서드 명 : selectInt
		int selectNumberofMember = RandomSelectNumber.selectInt(7);
		System.out.println("시식하는 사람 : " + eatMembers[selectNumberofMember] + " 당첨.ㅋㅋㅋ");
	}

}
