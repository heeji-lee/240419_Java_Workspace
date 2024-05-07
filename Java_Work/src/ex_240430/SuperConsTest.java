package ex_240430;

class A {
	// jvm에서 생성자에서 매개변수 타입이 선언되었다면 기본 생성자를 안 만들어준다.
	public A() {
		System.out.println("생성자 A() 호출");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("생성자 B() 호출");
	}
}

class C extends B {
	public C() {
		super();
		System.out.println("생성자 C() 호출");
	}
	
	public C(String name) {
		super();
		System.out.println("생성자 C() 호출");
	}
}

public class SuperConsTest {

	public static void main(String[] args) {
		C c = new C("lhj");
	}

}
