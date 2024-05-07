package ex_240501;

import util.RandomSelectNumber;
import util.showArrayString;

public class TestUtil {

	public static void main(String[] args) {
		int result = RandomSelectNumber.selectInt(5);
		System.out.println("랜덤한 숫자 결과 : " + result);
		// 문자열 배열, 출력해주는 함수 이용해보기. 
		String[] todayLunchMenu = {"수제비","칼국수","김밥","라면","쌀국수"};
		showArrayString.show(todayLunchMenu);
		
	}

}