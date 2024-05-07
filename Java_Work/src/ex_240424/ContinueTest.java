package ex_240424;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sum = 0;
		
		// for 안에서continue 확인중. 이 키워드 만나면 다음 조건으로 넘어감.
		for(int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			// continue 확인.
			if(n % 2 == 0) {
				continue;
			} else {
				sum = sum + n;
			}
		}
		System.out.println("sum : "+sum);
	}

}
