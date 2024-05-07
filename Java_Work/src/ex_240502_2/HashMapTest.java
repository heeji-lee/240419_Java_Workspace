package ex_240502_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import util.LocalDateTimeMake;
import util.RandomSelectNumber;

public class HashMapTest {
	// 연락처 프로그램 만들기
	public static void PhoneNumber(Scanner scanner, HashMap<String, Person> hash) {
		while (true) {
			System.out.println("1. 연락처 입력, 2. 연락처 출력, 3. 연락처 검색, 4. 연락처 삭제, 5. 멤버 랜덤 뽑기, 6. 종료하기");

			String choice = scanner.next();

			if (choice.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (choice.equals("1")) {
				System.out.println("이름과 연락처를 입력해주세요>>");
				String name = scanner.next();
				String number = scanner.next();
				String nowTime = LocalDateTimeMake.now();
				Person person = new Person(name, number, nowTime);
				hash.put(name, person);
				
				System.out.println("연락처가 추가되었습니다.");

				continue;
			} else if (choice.equals("2")) {
				System.out.println("연락처 출력>>");
				
				Set<String> keys = hash.keySet();
				Iterator<String> iterator = keys.iterator(); 
				
				while (iterator.hasNext()) {
					String key = iterator.next();
					Person value = hash.get(key);
					System.out.println("이름 : " + value.getName() + ", 연락처 : " + value.getNumber());
				}
				 
			} else if (choice.equals("3")) {			
				System.out.print("검색할 이름을 입력하세요>>");
				String searchName = scanner.next();
		
				Person val = hash.get(searchName);
				if (val == null)
					System.out.println("연락처를 찾을 수 없습니다.");
				else
					System.out.println("이름 : " + val.getName() + "\n연락처 : " + val.getNumber() + "\n등록일 : " + val.getNow());
				
				continue;
			} else if (choice.equals("4")) {
				System.out.println("삭제할 이름을 입력하세요>>");
                String deleteName = scanner.next();
                if (hash.containsKey(deleteName)) {
					hash.remove(deleteName);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("연락처를 찾을 수 없습니다.");
				}
				
				continue;
			} else if (choice.equals("5")) {
				ArrayList<Person> personList = new ArrayList<Person>(hash.values());
				
				if (personList.isEmpty()) {
	               System.out.println("등록된 연락처가 없습니다.");
	            } else {
	            	try {
	            		System.out.println("3초");
	                    Thread.sleep(1000);
	                    System.out.println("2초");
	                    Thread.sleep(1000);
	                    System.out.println("1초");
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	               int selectNumberofMember = RandomSelectNumber.selectInt(personList.size());
	               Person randomPerson = personList.get(selectNumberofMember);
	               System.out.println("이름 : " + randomPerson.getName() + ", 연락처 : " + randomPerson.getNumber() + ", 등록일 : " + randomPerson.getNow());
	               
//	               int randomIndex = (int) (Math.random() * hash.size());
//	               String[] keys = hash.keySet().toArray(new String[0]);
//	               String randomName = keys[randomIndex];
//	               Person randomPerson = hash.get(randomName);
//	               System.out.println("랜덤으로 선택된 멤버: " + randomPerson.getName());
	            }
	            
				continue;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Person> hashmap = new HashMap<String, Person>();
		PhoneNumber(scanner, hashmap);

	}
}