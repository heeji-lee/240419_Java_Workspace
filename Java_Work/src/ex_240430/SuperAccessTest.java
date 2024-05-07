package ex_240430;

abstract class Parent {
	//  추상 클래스는, 추상 메서드를 재료로 가집니다. 
	// 추상 메서드는 , 선언부(메서드 이름) 있고, 몸통(메서드 구현체)이 없다
	// 단 하나라도 추상 메서드를 가진다면, 그 클래스는 추상 클래스로 변경 해야합니다. 
	// 또는 추상 메서드를 원래의 일반 메서드로 변경 해야합니다. 
	
	// 결론, 일반 클래스가, 추상 클래스를 상속을 받으면, 
	// 자식 클래스는 반드시, 부모의 추상 메소드를 의무 적으로 상속을 받아야함. 
	// 예) 선배 개발자, 개발을 하기 위해서, 하나의 클래스를 만들었음.
	// 후임 개발자가 걱정이 되요, 실수로, 반드시 사용해야할 메서드를 사용을 안할 까봐.
	// 그래서, 클래스 추상 클래스로 변경을 해서, 추상 메서드로 만들었음. 
	// 그러면, 후임 개발자, 중요한 메서드를 의무적으로 사용하게끔. 안하면 오류가 나니까. 
	// 개발시, 반드시 필요한 메서드 등은 이런식으로 추상 메서드 , 또는 인터페이스 형식으로 지정.
	
	public String parentName;
	
	public void makeNoodle() {
		System.out.println("부모님 레시피로 국수 만들기.");
	}
	// 추상 메서드. 
	public abstract void makeBiBimNoodle();
}

abstract class Child extends Parent {
	public String childName;
	
	public void makeNoodle() {
		System.out.println("자식 레시피로 국수 만들기.");
		// 부모의 멤버 변경
		super.parentName = "부모님 국수 이름 테스트";
		// 부모의 메서드 호출
		super.makeNoodle();
	}
}

class ChildChild extends Child {

	@Override
	public void makeBiBimNoodle() {
		System.out.println("ChildChild에서 비빔국수를 만들기.");
	}
	// 추상 클래스가 되거나 추상 메서드를 구현해서 재정의하거나
	
}


public class SuperAccessTest {
	
	public static void main(String[] args) {
		// 업캐스팅 : 부모 타입 = 자식 타입
		// 자식 클래스 멤버에 접근이 가능한가? No
//		Parent p1 = new Child();
		Parent p1 = new ChildChild();
		// 부모 멤버에 접근이 가능.
//		p1.parentName;
		
		// 다운 캐스팅 : 자식 타입 = (자식 타입) 부모 타입
		Child c1 = (Child)p1;
		// 자식 클래스 멤버 및 부모 클래스 멤버도 접근이 가능.(상속)
//		c1.childName;
		
		// 자식에서 국수 만들기 메서드 호출
		// 부모에도 같은 메서드가 있고 자식에도 있다.
		// 그러면 누구를 선택하는가? 자식 메서드(재정의한 메서드가 우선이다.)
		c1.makeNoodle();
		// ctrl+h : 범위 지정해서 검색 가능
		
		// 자식 메서드 안에서 부모의 멤버 값을 변경하고 확인해보기.
		System.out.println("c1.parentName : " + c1.parentName);
		// c1의 인스턴스에는, 본인 꺼도 있지만, 부모 클래스의 멤버도 같이 있음.
	}

}
