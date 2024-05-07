package ex_240424;

import java.util.Scanner;

public class TodayPick {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("오늘 점심 메뉴 무엇을 먹을까요?");
		System.out.println("날씨가 어떤가요?(1.비 2.흐림 3.맑음 4.바람 5.기타)");
		int number = scanner.nextInt();
		// 숫자 비교 할 경우, 연산자 ==
		// 문자열를 비교 할 경우, 문자열.equals("")
		if(number==1) {
			System.out.println("오늘은 비가 오니 삼선우동을 추천드려요.");
		} else if(number==2) {
			System.out.println("오늘은 흐림이니 밀면을 추천드려요.");
		} else if(number==3) {
			System.out.println("오늘은 맑음이니 된장찌개를 추천드려요.");
		} else if(number==4) {
			System.out.println("오늘은 바람이 많이 부니 돼지국밥을 추천드려요.");
		} else {
			System.out.println("오늘은 마라탕을 추천드려요.");
		}
		
		switch (number) {
			case 1:
				System.out.println("오늘은 비가 오니 삼선우동을 추천드려요.");
				break;
			case 2:
				System.out.println("오늘은 흐림이니 밀면을 추천드려요.");
				break;
			case 3:
				System.out.println("오늘은 맑음이니 된장찌개를 추천드려요.");
				break;
			case 4:
				System.out.println("오늘은 바람이 많이 부니 돼지국밥을 추천드려요.");
				break;
			default:
				System.out.println("오늘은 마라탕을 추천드려요.");
		}
		
		System.out.println("사계절 중 어느 계절을 좋아하시나요?(봄, 여름, 가을, 겨울)");
		String season = scanner.next();
		switch (season) {
		case "봄":
			System.out.println("봄은 3,4,5월입니다.");
			break;
		case "여름":
			System.out.println("여름은 6,7,8월입니다.");
			break;
		case "가을":
			System.out.println("가을은 9,10,11월입니다.");
			break;
		case "겨울":
			System.out.println("겨울은 12,1,2월입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}		
		
		scanner.close();
	}

}
