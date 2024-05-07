package ex_240503;

public class ThreadTest1 extends Thread {
	int n = 0;
	// run 메소드 재정의
	@Override
	public void run() {
		super.run();
		while(true) {
			System.out.println("숫자 카운트 스레드1 : " + n);
			n++;
			// 잠시 대기
			try {
				sleep(1000); // 1000ms = 1초
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		// Thread 클래스 상속받은 클래스의 인스턴스 생성하기.
		ThreadTest1 threadTest1 = new ThreadTest1();
		ThreadTest2 threadTest2 = new ThreadTest2();
		ThreadTest3 threadTest3 = new ThreadTest3();
		ThreadTest4 threadTest4 = new ThreadTest4();
		// start 메소드 호출하면 run 메소드가 호출이 되어 스레드가 동작함.
		threadTest1.start();
		threadTest2.start();
		threadTest3.start();
		threadTest4.start();
	}
	
}
