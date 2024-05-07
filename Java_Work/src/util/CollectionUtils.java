package util;

import java.util.Vector;

public class CollectionUtils {
	// Vector의 요소를 출력해주는 메서드 만들기.
	public static void showVectorElem(Vector<String> vector) {
		for (int i = 0; i < vector.size(); i++) {
			if (i == 0) {
				System.out.print(vector.get(i));
			} else {
				System.out.print(", " + vector.get(i));
			}
		}
	}

	// 더미 데이터 만들기. 함수.
	// 만들고 싶은 더미 데이터 갯수 입력시, 그 갯수 만큼 벡터에 추가하기.
	// 기존 벡터에 데이터 넣는 형식.
	public static void addVectorElem(int wantInt, Vector<String> vector) {
//			vector.setSize(wantInt);
		for (int i = 0; i < wantInt; i++) {
			vector.add("더미 데이터 : " + i);
		}

	}

}