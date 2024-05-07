package ex_240424;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// scanner 도구 추가하기.
		Scanner scanner = new Scanner(System.in);
		// 배열 선언
		int intArray[] = new int[5];
		// 임시로 저장할 정수 변수
		int max = 0;
		System.out.println("양수 5개 입력 해주세요.");

		// 반복문 이용해서, 콘솔에서 입력한 양수 5개를 배열에 담기
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			// 입력한 값 중에서, 최댓값을 분류 하는 로직 넣기.
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("입력한 양수 5개중 가장 큰값은: " + max);
		scanner.close();

		// 얕은 복사 간단 예제 -> 바로가기. 
		int copyArray[] = new int[5];
		// 참조형 변수, 실제로 , 메모리 위치 주솟값이 들어가 있다.
		// 같다는 개념은 저장하고 있는 메모리 위치 주솟값을 말한다.
		copyArray = intArray;

		System.out.println("copyArray 출력해보기. ");
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println("copyArray :" + copyArray[i]);
		}

		// 메모리 위치 주솟값 출력하기. copyArray
		int copyArrayAddress = System.identityHashCode(copyArray);
		System.out.println("copyArray 메모리 위치 주솟값: " + copyArrayAddress);

		System.out.println("intArray 출력해보기. ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray :" + intArray[i]);
		}

		// 메모리 위치 주솟값 출력하기. copyArray
		int intArrayAddress = System.identityHashCode(intArray);
		System.out.println("intArray 메모리 위치 주솟값: " + intArrayAddress);
		
	}

}