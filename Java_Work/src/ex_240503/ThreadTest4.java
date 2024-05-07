package ex_240503;

public class ThreadTest4 extends Thread {
	int n = 0;
	// run 메소드 재정의
	@Override
	public void run() {
		super.run();
		while(true) {
			System.out.println("숫자 카운트 스레드2 : " + n);
			n++;
			// 잠시 대기
			try {
				sleep(1000); // 1000ms = 1초
			} catch (Exception e) {
				
			}
		}
	}
}
