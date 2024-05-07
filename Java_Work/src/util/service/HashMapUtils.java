package util.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import util.RandomSelectNumber;
import util.dto.Person;

// 기능들을 모아두었다.
// 서비스 -> 백엔드 -> 데이터베이스 , 비지니스 로직()
// 기능들의 모음집
// 인터페이스, 구현한 클래스로 분리해서 작업.
public class HashMapUtils {
	// 출력
	// 파라미터 정의 : HashMap<String, Person> hashMap
	// 하는 역할? hashMap 무엇이 들어있나요? 입력된 모든 연락처가 다 들어 있음. 
	// hashMap(참조형 변수, 집주소: 0x100), 입력시 사용했던 모든 연락처 공간
	// 출력하는 메서드에서 또 재사용하는것. hashMap(참조형 변수, 집주소: 0x100)
	
	public static void showElem(HashMap<String, Person> hashMap) {
		// 2)HashMap<String, Person> hashMap : key : 사람이름, value : Person 타입(클래스)
		//예) "이상용" : Person("이상용","01012345678","2024-05-03 09:32:00")
		//예) "이상용2" : Person("이상용2","01012345678","2024-05-03 09:32:00")
		//예) "이상용3" : Person("이상용3","01012345678","2024-05-03 09:32:00")
		
		//hashMap.keySet() -> 키만 다 들고 오겠다. -> 어디에 담았니? Set<String> keys, 집합 그릇
		// 집합(중복 허용안됨, 중복제거용) 그릇, 중복
		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		//keys : 모든 키가 다 있어요? "이상용", "이상용2", "이상용3"
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		// 반복 준비, keys.iterator(), 
		// 0행부터 스탠바이 준비중,  실제 데이터 : 1행: 이상용, 2행: 이상용2, 3행: 이상용3
		// it.hasNext() -> 다음행 있니? 있다. true
		while (it.hasNext()) {
			// it.next() : 1행 가져오기 , key 변수에 담기. 
			String key = it.next(); // 키
			//key: 이상용
			// hashMap.get(이상용) : 해당하는 값을 가져오라, Person의 인스턴스를 가져오라. 
			//  value을 꺼내서, Person 타입에 담기. 
			Person value = hashMap.get(key); // 값
			// 인스턴스 메서드를 이용해서, 인스턴스.메서드 이용해서, 값 가져오기. 
			System.out.println("(이름: " + value.getName() + ", 연락처 : " + value.getContact() + ", 등록일 : "
					+ value.getRegDate() + ")");
		}

	} // 출력 닫기

	// 검색, 함수가 정의된곳 , 함수를 사용하면 어디로 가나요? 함수로 정의가 된곳으로 간다. 
	// 검색 기능 , 함수분리, 인자값에 전달 준비물 
	// 1) hashMap : 모든 연락처가 들어가 있다. 소멸안함. 인스턴스 -> 집주소
	// 2) searchName : 검색할 이름.  소멸안함. 인스턴스 -> 집주소
	public static HashMap<String, Person> findElem(HashMap<String, Person> hashMap, String searchName) {

		//hashMap.keySet() -> 키만 다 들고 오겠다. -> 어디에 담았니? Set<String> keys, 집합 그릇
		// 집합(중복 허용안됨, 중복제거용) 그릇, 중복
		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		// 위에 반본됨. 
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		// 임시 공간. searchMap
		HashMap<String, Person> searchMap = new HashMap<String, Person>();
		// 있으면 
		while (it.hasNext()) {
			String key = it.next(); // 키
			// searchName : "이상용2"
			if (key.equals(searchName)) {
				// key에 검색된 이름이 있다.
				// hashMap : 모든 연락처가 있는 곳에서, 검색된 이름으로 value 값 가져오기. 
				Person person = hashMap.get(searchName);
				// 키 : searchName, 값 : person
				// searchMap : 임시 공간. 
				searchMap.put(searchName, person);
			}

		} // 조건에 검색된 내용이 있다면, 하나 담은 인스턴스를 전달하고, 
		// 조건에 검색된 내용이 없다면, null 반환. 
		return searchMap;

	}// 검색 닫기

	// 삭제
	public static void deleteElem(HashMap<String, Person> hashMap, String deleteName) {
		hashMap.remove(deleteName);
		// 유효성 체크 후 삭제 해도됨. 
		// 삭제는 본인이 일단, 화면에 보여야 되고, 
		// 인증 로그인해서, 본인 만 삭제가 가능하게 , 시스템안에 시큐리티 설정이 되어 있음. 
		
//		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
//		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
//
//		while (it.hasNext()) {
//			String key = it.next(); // 키
//			if (key.equals(searchName)) {
//				System.out.println(searchName + "님 삭제 완료");
//				hashMap.remove(searchName);
//			}
//		}
	}// 삭제 닫기

	// 랜덤
	public static String randomElem(HashMap<String, Person> hashMap) {
		// 모든 연락처의 크기 : 예 현재 3명이 등록됨. 
		int memberSize = hashMap.size();
		// 예, 3명 -> 0,1,2 정수 중 하나가 랜덤하게 뽑힘.
		int randomNumber = RandomSelectNumber.selectInt(memberSize);
		// 모든 연락처에서, 이름만 뽑아서, 리스트에 담을 임시 공간. 
		ArrayList<String> memberArrayList = new ArrayList<String>();
		// 모든 연락처에서 키만 뽑아 내는 코드. 
		Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴

		while (it.hasNext()) {
			String key = it.next(); // 키
			// 모든 연락처에서 이름 만 뽑아서, 임시 공간에 담기. 
			memberArrayList.add(key);
		}									// 0   ,    1    ,  2
		// memberArrayList-> 가변 길이의 배열, {"이상용","이상용2","이상용3"}
		String randomPickedMemberName = memberArrayList.get(randomNumber);
		// 예) 이상용2 랜덤하게 뽑힘. 
		return randomPickedMemberName;
	}// 랜덤 닫기

	// value 역순 정렬
	// 정렬할 대상을 : 모든 연락처를 담은 hashMap 받았음. 
	public static HashMap<String, Person> sortReverseElem(HashMap<String, Person> hashMap) {
		//hashMap.entrySet() -> 키와 값을 반환함. 
		// Linked 연결이 되어 있다. 정렬할 때 좋다. 단, 정렬을 하기위한 오버헤드 발생한다. 
		// 오버헤드 : 쉽게 말해서, 일을 조금 더 한다. 
		
		// 모든 연락처를 hashMap -> LinkedList 로 변환해서 -> list 에 담겨있다. 
		// 모든 연락처는 임시로 list 로 담겨 있다. 
		List<Map.Entry<String, Person>> list = new LinkedList<Map.Entry<String, Person>>(hashMap.entrySet());

		// Collections.sort : 1) 정렬하고 싶은 대상, 2) 정렬하는 방식.
		// list를 comp(내림차순도구)이용해서, 날짜 최신순으로 정렬함. 
		Collections.sort(list, comp);

		HashMap<String, Person> temp = new LinkedHashMap<String, Person>();

		for (Map.Entry<String, Person> entry : list) {
			temp.put(entry.getKey(), entry.getValue());

		}
		return temp;
	}// value 역순 정렬

	// 역순 기능 정렬 도구
	// new Comparator<Map.Entry<String, Person>>() { : 익명 클래스. 
	// 익명 클래스 : 이름이 없는 클래스 -> 일회용 함수. -> 클릭 이벤트 핸들러 처리 할 때,
	// 안드로이드 작업시, 이벤트 처리할 때 자주 보게 될 코드 스타일. 
	
	// A a = new A(); -> new 인터페이스 
	// class A implements interface1 { }
	
	// Comparator : 인터페이스, , 구성품 : 1)상수 2) 추상메서드, -> 
	static Comparator<Map.Entry<String, Person>> comp = new Comparator<Map.Entry<String, Person>>() {

		@Override
		public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
			// Entry<String, Person> o1 : map -> o1.getValue() -> Person 타입 인스턴스.
			// date1 = "2024-05-03 09:32:00" . 중간에 기호 3개, 1)하이픈 - , 2) 공백, 3)콜론
			String date1 = o1.getValue().getRegDate();
//			System.out.println("date1 : " + date1);
			// replaceAll -> 중간에 기호 3개, 1)하이픈 - , 2) 공백(\\s), 3)콜론 -> "" 변경하기. 
			String date1_trim = date1.replaceAll("[\\s-:]", "");
			// date1_trim = "20240503093200"
			// 시간은 클수록 최신이다? yes or no , yes 
//			System.out.println("date1_trim : " + date1_trim);
			
			//"20240503093200" -> 타입 : 긴 정수로 변경. Long 
			Long l1 = Long.parseLong(date1_trim);
						
			String date2 = o2.getValue().getRegDate();
//			System.out.println("date2 : " + date2);
			String date2_trim = date2.replaceAll("[\\s-:]", "");
//			System.out.println("date2_trim : " + date2_trim);
			Long l2 = Long.parseLong(date2_trim);
			
			//"20240503093203" -> 타입 : 긴 정수로 변경. Long
			// 시스템에서, 정렬은 기본이 : 오름차순. 
			// 1,2,3,4,5 
			// 비교 원리, 1 - 2 = -1 , 결과 음수 이면 변경 안함. 
			
			// 2,1,3,4,5
			// 비교 원리, 2 - 1 = 1 , 결과 양수 이면 변경함. 
			
//			System.out.println("l1 - l2 : " + (l1-l2));
//			System.out.println("l1.compareTo(l2) : " + l1.compareTo(l2));
			// 음수 이면: 변경안함, 양수이면, 2개의 위치를 변경함. 기본: 오름차순. 
			// 시간을 오름차순 정렬 : 과거순. 
			
			// -resultInt
			// -음수 -> 양수, -양수 -> 음수, 기본은 반대이니: 내림차순. 
			int resultInt = (int)(l1 - l2);
			return -resultInt;
		}
		// 역순 기능 정렬 도구
	};

} // 클래스 닫는 기호