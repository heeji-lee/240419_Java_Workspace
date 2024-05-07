package ex_240501;

public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper 클래스, 기본형 -> 참조형(객체), 타입 변경. 박싱, 
		// 언박싱, 참조형 -> 기본형, 자동으로 업캐스팅, 다운 캐스팅등을 지원을 함. 
		Integer integer = Integer.valueOf(31);
		//bitCount(int i) -> 반환 : 이진숫자에서 1의 갯수를 리턴. 
		int bitCountResult = integer.bitCount(7);
		System.out.println("bitCountResult : " + bitCountResult);
		
		// 참조형 -> 기본형 변환. 
		// intValue() : int 타입으로 반환 한다. 
		int refTointResult = integer.intValue();
		System.out.println("refTointResult : " + refTointResult);
		
		// int parseInt(String str)
		 int stringTointResult = integer.parseInt("1234");
		 System.out.println("stringTointResult : " + stringTointResult);
		 
		 // int parseInt(String str, int radix)
		 int intToBinaryResult = integer.parseInt("31", 8);
		 // 해당 진법으로 계산한 10진수 결과값 출력.
		 // 결과 : 3x8 + 1x1 = 25 출력.
		 System.out.println("intToBinaryResult : " + intToBinaryResult);
		 
		 // 오토 박싱, 언박싱. 
		 // 오토 박싱 : 기본형 -> 참조형
		 Integer i = 10 ; 
		 
		 // 언박싱 : 참조형 -> 기본형 
		 int i2 = i;

	}

}