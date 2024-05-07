package ex_240501;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String query = "메뉴=면류&가격=7000&장소=학원근방200m내외";
		
		// st 구분자를 기준으로 나누어진 문자열 정보를 st라는 레퍼런스가 가지고 있다. 
		StringTokenizer st = new StringTokenizer(query, "&=");
		
		int n = st.countTokens(); // 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);
		while (st.hasMoreTokens()) {
			// 0행 부터 대기하고 있다가
			// 요소를 요소1, 요소2, 요소3
			String token = st.nextToken(); // 토큰 얻기
			System.out.println(token); // 토큰 출력
		}

	}

}