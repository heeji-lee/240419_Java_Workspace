package ex_240424;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 0을 입력시 계산 종료");
		
		// 임시로 담을 변수 설정.
		int count = 0, n = 0;
		double sum = 0;
		
		while ((n = scanner.nextInt())!=0) {
			sum=sum+n; // sum+=n;
			count++;
		}
		System.out.println("총합 : "+sum);
		System.out.println("갯수 : "+count);
		System.out.println("평균 : "+sum/count);
	}

}
