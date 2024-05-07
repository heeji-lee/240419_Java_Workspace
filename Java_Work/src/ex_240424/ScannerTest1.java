package ex_240424;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// 스캐너 사용하기.
		// 순서1. Scanner 클래스 사용하기.
		// 클래스 객체(인스턴스) 생성 어떻게 하나요?
		// A a = new A(); A : 클래스명, a : 참조형 변수
		// new : 키워드, 예약어
		// A() : 생성자 -> 초기화를 하는 역할. 반대말 null
		// 동적 메모리 어딘가에 할당을 한다.
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("가입할 이메일을 작성해주세요 : ");
		String userEmail = scanner.next();
		
		System.out.println("가입할 메일은 : "+userEmail);
		
		// 자원 반납. -> scanner라는 객체를 생성자 호출해서 초기화 했다.
		// 동적 메모리 어딘가에 자리를 잡았다(메모리 사용했다.)
		// 사용했던 메모리를 반납함.
		scanner.close();
	}

}
