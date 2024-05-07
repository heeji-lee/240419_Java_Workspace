package ex_240501_3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class Person {
	
	private String name;
	private Vector<String> foodList;

	public Person(String name, Vector<String> foodList) {
		super();
		this.name = name;
		this.foodList = foodList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector<String> getFoodList() {
		return foodList;
	}

	public void setFoodList(Vector<String> foodList) {
		this.foodList = foodList;
	}
	
}

public class MiniPractice_Vector {

	public static void recommendFood(Scanner scanner, Vector<Person> vector) {
		while (true) {
			System.out.println("1. 메뉴 입력, 2. 메뉴 출력, 3. 검색하기, 4. 멤버 삭제하기, 5. 멤버의 메뉴 삭제하기, 6. 종료하기");

			String choice = scanner.next();

			if (choice.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (choice.equals("1")) {
				System.out.println("메뉴를 입력해주세요>>");
				String userName = scanner.next();
				System.out.println("메뉴 입력(예: 라면,김밥)>>");
				String foodList = scanner.next();

				StringTokenizer st = new StringTokenizer(foodList, ",");
				Vector<String> foodListVector = new Vector<String>();
				while (st.hasMoreTokens()) {
					String food = st.nextToken();
					foodListVector.add(food);
				}

				Person person = new Person(userName, foodListVector);
				vector.add(person);

				continue;
			} else if (choice.equals("2")) {
				System.out.println("메뉴 출력>>");
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					Vector<String> person_foodList = person.getFoodList();
					for (int j = 0; j < person_foodList.size(); j++) {
						System.out.println(person.getName() + "의 메뉴 리스트 : " + (j + 1) + "번 " + person_foodList.get(j));
					}

				}
				continue;
			} else if (choice.equals("3")) {
				System.out.println("검색해주세요>>");
				String searchName = scanner.next();
				Vector<String> search_list = new Vector<String>();
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					Vector<String> person_foodList = person.getFoodList();

					for (int j = 0; j < person_foodList.size(); j++) {
						if (person_foodList.get(j).equals(searchName)) {
							search_list.add(person.getName() + "의 메뉴: " + person_foodList.get(j));
						}
					} // end for 안
				} // end for 밖

				if (!search_list.isEmpty()) {
					for (int i = 0; i < search_list.size(); i++) {
						System.out.println("검색된 메뉴 " + (i + 1) + " " + search_list.get(i));
					}
				} else {
					System.out.println("검색 메뉴가 없습니다.");
				}
				continue;
			} else if (choice.equals("4")) {
				 System.out.println("삭제할 메뉴를 입력하세요>>");
	                String deleteName = scanner.next();
					for (int i = 0; i < vector.size(); i++) {
						Person person = vector.get(i);
						if (person.getName().equals(deleteName)) {
							vector.remove(i);
							System.out.println("삭제되었습니다.");
						} else {
							System.out.println("검색 메뉴가 없습니다.");
						}
					}
					
					continue;
			} else if (choice.equals("5")) {
				System.out.println("삭제할 메뉴 입력>>");
				String deleteName = scanner.next();
				System.out.println("멤버 이름 입력>>");
				String deleteMemberName = scanner.next();
				for (int i = 0; i < vector.size(); i++) {
					Person person = vector.get(i);
					if (person.getName().equals(deleteName)) {
						for (int j = 0; j < person.getFoodList().size(); j++) {
							if (person.getFoodList().get(j).equals(deleteMemberName)) {
								System.out.println(person.getName() + "의 메뉴 " + person.getFoodList().get(j) + "를 삭제했습니다.");
								person.getFoodList().remove(j);
							} // 사람도 일치, 메뉴도 일치 한다면, if
						} // end for 안
					} // if, 입력한 사람과 같다면
				} // end for 밖

				continue;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Vector<Person> verStrings = new Vector<Person>();
		recommendFood(scanner, verStrings);

	}
}