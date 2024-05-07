package ex_240424;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 정의, 방법1 -> 계란판: 같은 타입만 저장, 크기 고정.
		int [] intArray = new int[5];
		int  intArray2 [] = new int[5];
		
		String [] strArray  = new String[5];
		String strArray2 [] = new String[5];
		
		// 선언과 값할당 안함(초기화를 분리해서 사용) 방법2
		int [] intArray3;
		intArray3 = new int[5];
		
		String [] strArray3;
		strArray3 = new String[5];
		
		// 선언과 할당(바로하기) 방법3 
		int [] intArray4 = {1,2,3,4,5};
		
		// 문자열 버전 
		String [] strArray4 = {"ㅇㅎㅈ1","ㅇㅎㅈ2","ㅇㅎㅈ3"};
	}

}