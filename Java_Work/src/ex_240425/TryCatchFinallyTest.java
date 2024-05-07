package ex_240425;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세요.");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i+ ">>");
			try {
				// 정수를 입력하기로 했는데, 우리는 임시로 예외를 만들기 위해서, 문자열 입력하기. 
				n = scanner.nextInt();
//			} catch (InputMismatchException e) {
			} catch (Exception e) {
				// 예외에도 계층 구조가 있음. 
				// InputMismatchException , exceptio 부모 예외의 하위, 구체적인 예외로 처리.
				// 큰 포괄적으로 처리도 가능. 
								
				System.out.println("정수가 아닙니다. 다시 입력해주세요");
				// 오류가 발생한 발자국을 조사. 
				e.printStackTrace();
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합 : " +sum);
		scanner.close();
	}

}