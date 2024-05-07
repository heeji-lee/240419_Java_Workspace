package ex_240423_2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// 키보드로 입력된 내용을 Scanner 클래스가 변환 해준다.
		// 사용은 콘솔에서 특정 문자열, 숫자를 입력 받아서 
		// 임시 메모리에 담아서 사용할 예정
		
		// 사용법. Scanner 클래스 객체를 생성
		// A a = new A(System.in);
		// Scanner : 객체, 수납도구, 읽은 내용을 숫자 또는 문자열로 변환해줍니다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름이 뭐예요?");
		String nameString=scanner.next();
		System.out.println("어디 사나요?");
		String addressString=scanner.next();
		System.out.println("취미는 뭔가요?");
		String hobbyString=scanner.next();
		System.out.println("1 ~ 10 중 좋아하는 숫자는 뭔가요?");
		int likeNumber=scanner.nextInt();
				
		System.out.println("이름 : "+nameString);
		System.out.println("사는 곳 : "+addressString);
		System.out.println("취미 : "+hobbyString);
		System.out.println("좋아하는 숫자 : "+likeNumber);
		
		
		
		// 객체 사용 후 반납.
		scanner.close();
	}
	
}
