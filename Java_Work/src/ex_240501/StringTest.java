package ex_240501;

public class StringTest {

	public static void main(String[] args) {
		String java = "java";
		String bus = "bus";
		String butter = "butter";
		String energy = "energy";
		// compareTo(String anotherStr) : 기존 문자열, anotherStr 비교 
		// 기존 문자열이 anotherStr 보다 먼저 나오면, 음수
		// 기존 문자열이 anotherStr 보다 나중에 나오면, 양수
		// 같으면 , 0
		// 0,1,2,3,4,5,6,7,8,9
		// a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u
		int javaCompareBus =java.compareTo(bus);
		System.out.println("javaCompareBus :" + javaCompareBus);
		
		int busCompareJava =bus.compareTo(java);
		System.out.println("busCompareJava :" + busCompareJava);
		
		int busCompareBus =bus.compareTo(bus);
		System.out.println("busCompareBus :" + busCompareBus);
		
		int energyCompareBus =energy.compareTo(bus);
		System.out.println("energyCompareBus :" + energyCompareBus);
		
		int butterCompareBus =butter.compareTo(bus);
		System.out.println("butterCompareBus :" + butterCompareBus);
		
		// 메모리 위치 주솟값 비교 테스트 
		int resultBusAddr = System.identityHashCode(bus);
		System.out.println("resultBusAddr : " + resultBusAddr);
		
		int resultJavaAddr = System.identityHashCode(java);
		System.out.println("resultJavaAddr : " + resultJavaAddr);
		
		// bus concat java 
		String busConcatJavaString = bus.concat(java);
		System.out.println("busConcatJavaString : " + busConcatJavaString);
		
		int resultBusJavaAddr = System.identityHashCode(busConcatJavaString);
		System.out.println("resultBusJavaAddr : " + resultBusJavaAddr);
		
		// StringBuffer를 이용해서 가변이다 그래서 변경 가능하다. 
		// 비교. String 불변이어서 문자열을 2개 붙이면 새로운 문자열을 만들어서 또 메모리 사용한다. 
		// 낭비가 심하다. 
		// 반면에, StringBuffer 하나의 메모리 주소에서 변경이 가능하다. 
		// 테스트, 자바 라는 문자열에 버스를 추가하고 메모리 주소를 비교 해보기. 
		StringBuffer stringBufferJava = new StringBuffer("java");
		System.out.println("stringBufferJava : " + stringBufferJava);
		int resultStringBufferJavaAddr = System.identityHashCode(stringBufferJava);
		System.out.println("resultStringBufferJavaAddr : " + resultStringBufferJavaAddr);
		
		// java에 bus 붙이기. 
		stringBufferJava.append("bus");
		
		System.out.println("stringBufferJava : " + stringBufferJava);
		int resultStringBufferJavaAddr2 = System.identityHashCode(stringBufferJava);
		System.out.println("resultStringBufferJavaAddr2 : " + resultStringBufferJavaAddr2);

	}

}