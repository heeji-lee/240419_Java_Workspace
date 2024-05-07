package ex_240502;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import util.ArrayListUtils;
import util.LocalDateTimeMake;
import util.dto.LunchFood;

public class ArrayListTest {

	public static void main(String[] args) {
		// 점심 메뉴 모델(전달용) DTO(Data Transfer Object) 클래스
		// VO(Value Object), 데이터베이스와 연관된 클래스.
		// DTO 한번 작성해보기.
		// LocalDate 한번 사용해보기.
		LocalDate currentDate = LocalDate.now();

		// 년,월,일,시,분,초 -> 포맷팅도 다하게끔.
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//		String nowString = now.format(dateTimeFormatter);
		// 확인
//		System.out.println(nowString);
		
		String nowTime = LocalDateTimeMake.now();

		// 메뉴 추가하기
		LunchFood lunchFood = new LunchFood(9000, nowTime, nowTime, "서면", "김치찌개");
		// 확인
		System.out.println(lunchFood.toString());
		// 메뉴 추가하기
		LunchFood lunchFood2 = new LunchFood(8000, nowTime, nowTime, "가야밀면", "밀면");
		// 메뉴 추가하기
		LunchFood lunchFood3 = new LunchFood(10000, nowTime, nowTime, "문범초밥", "초밥");
		
		// ArrayList에 담기. 제너릭으로, 타입 지정.
		ArrayList<LunchFood> lunchFoodList = new ArrayList<LunchFood>();
		lunchFoodList.add(lunchFood);
		lunchFoodList.add(lunchFood2);
		lunchFoodList.add(lunchFood3);
		
		// 꺼내서 출력 해보기. 출력해주는 기능 만들기.
		ArrayListUtils.showArrayList(lunchFoodList);
				
	}

}