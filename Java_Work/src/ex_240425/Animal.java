package ex_240425;

import java.util.Arrays;

public class Animal { // 클래스로 감싸서 캡슐화
	// 멤버, private 외부에서 못보게 가림. 
	private String name;
	private int age;
	private String[] favoriteFood;
	
	// getters/setters -> 멤버의 값을 설정 또는 가져오기 가능. 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(String[] favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
		
	// 메서드 toString , -> 해당 멤버의 값을 다 출력해주는 메서드 ,
	// Object , 최고 부모 클래스 여기에 toString 메서드가 있다. 
	
	// 중요한 사실, 모든 클래스는 암묵적으로 Object 라는 부모 클래스를 다 상속 받고 있다. 전부
	
	// 여기서, 메서드는 출력을 의미 없는 메모리 위치 주솟값을 출력 해주어서, 사용안한다. 
	//
	// 그래서, 이 메서드를 재정의해서, 실제 데이터가 출력이 되게 기능 변경.
	// 자동으로 소스 코드를 이용해서, 만든 기능이, 실제 데이터를 출력 해주는 기능. 
	
	// @Override, 애너테이션이라고 부르고, 
	// 기능은 , 컴파일러에게, 나 이 메서드 재정의 했으니, 나중에 실행할 때, 확인 잘 해줘라고 메세지 남김. 
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", favoriteFood=" + Arrays.toString(favoriteFood) + "]";
	}
	
	public void speakSound(String sound) {
		System.out.println("사운드 : " + sound);
	}
	
	public void moveAction(String action) {
		System.out.println("움직임 : " + action);		
	}
	
}