package ex_240425;

public class Array2Dim {

	public static void main(String[] args) {
		// 2차원 배열 선언 및 값 출력 해보기.
		// 정의. 기본 배열에서 대괄호[] 하나씩 추가 더 된다.
		// 방법1 -> 3은 크기이고, 인덱스 : 0,1,2
		// int [][] intArray = new int[3][2];
		// 방법2
		// int [][] intArray2 = { {1,2}, {3,4}, {5,6} };
		
		int [][] intArray = new int[3][2];
		// 각각
		// 데이터 입력 방법
		// 1) 각각 더미로 입력 2) 스캐너로 입력 3) 파일로 입력 4) DB에서 불러와서 입력
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;
		intArray[2][0] = 5;
		intArray[2][1] = 6;
		
		// intArray.length -> 3행, 0,1,2
		for (int i = 0; i < intArray.length; i++) {
			// intArray[i].length -> 2열, 0,1
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.println(i + "행, " + j + "열" + " 값 : " + intArray[i][j]);
			}
			System.out.println();
		}
		
	}

}
