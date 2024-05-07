package ex_240424;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 을 담는 배열 선언 
		String[] foodMenu = new String[5];
		
		// 더미로 넣은 데이터를, 콘솔에서, 입력을 받아서, 배열에 담아주세요.
		foodMenu[0] = "된장찌개";
		foodMenu[1] = "돼지국밥";
		foodMenu[2] = "제육볶음";
		foodMenu[3] = "불고기";
		foodMenu[4] = "비빔밥";
		// 반복문 이용해서, 문자열을 배열에 입력하기. 
//		System.out.println("오늘 점심 먹고 싶은 메뉴 5개 정도 후보 등록 해보기.");
		System.out.println("오늘 점심 먹고 싶은 메뉴 등록된 5개 메뉴 중에서 추천해주기.");
//		for (int i = 0; i < foodMenu.length; i++) {
//			foodMenu[i] = scanner.next();
			// 입력한 값 중에서, 최댓값을 분류 하는 로직 넣기.
//			if (intArray[i] > max) {
//				max = intArray[i];
//			}

//		}
		// 사용 후 메모리 반납 해주기. 
		scanner.close();
		
		// 랜덤한 숫자 0 ~ 4 중에서, 하나 선택 후, 임시 변수에 담아서,
		// 정의 
		Random random = new Random();
		// 함수 사용. 	random.nextInt(5); , 5미만의 정수, 랜덤 뽑기. 
		int randomNumber = random.nextInt(5);
		System.out.println("랜덤한 숫자 : " + randomNumber );
						
		// 배열에 foodMenu[임시변수], 출력 하면 됨.
		System.out.println("============================================");
		System.out.println("오늘의 추천 메뉴 : " + foodMenu[randomNumber] );
		System.out.println("============================================");		
		
		// 배열에서, 하나씩 출력하기, 반복문 이용해서. 
		for (int i = 0; i < foodMenu.length; i++) {
			System.out.println("상용이가 좋아하는 점심 메뉴 : " + foodMenu[i]);
		}
		
		// 자바 버전에서, 랜덤으로 숫자를 출력해주는 클래스를 하나 가지고 와서. 
		// 배열의 갯수가 5개, 인덱스 , 0,1,2,3,4
		// 0 ~ 4 까지중에서, 하나의 정수를 랜덤하게 선택 후, 
		// 랜덤하게 선택이 된 숫자를 이용해서, 배열에서 꺼내서 출력 하면 어떨까? 자동 추천. 
		

	}

}