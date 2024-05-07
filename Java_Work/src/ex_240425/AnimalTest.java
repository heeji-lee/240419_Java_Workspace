package ex_240425;

public class AnimalTest {

	public static void main(String[] args) {
		// 고양이 만들기
		Cat cat1 = new Cat();
		cat1.setName("모찌");
		cat1.setAge(2);
		String[] catFoodList = {"츄르","참치캔","생선"};
		cat1.setFavoriteFood(catFoodList);
		cat1.setPlace("집");
		// 고양이 정보 출력하기
		String catInformation = cat1.toString();
		System.out.println("고양이 정보 : "+catInformation);
		// 고양이 기능 출력하기
		cat1.moveAction("누워있음.");
		cat1.speakSound("야옹");
		System.out.println("고양이가 사는 곳 : "+cat1.getPlace());
		
		System.out.println("==================================");
		
		Dog dog1 = new Dog();
		dog1.setPlace("유기견보호센터");
		dog1.setType("골든 리트리버");
		System.out.println("강아지가 사는 곳 : "+dog1.getPlace());
		System.out.println("강아지 종 : "+dog1.getType());
		dog1.moveAction("뛰어다님.");
		dog1.speakSound("멍멍");
	}

}