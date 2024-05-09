package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.eventListener.MyKeyListener;

public class KeyEventTest extends JFrame{
	// 1 화면에 요소를 배치
	// 2 이벤트 처리기를 붙이는 작업.

	// 생성자 정의. 
	public KeyEventTest(JLabel jLabel) {
		//1 화면에 요소를 배치
		// 윈도우 창의 제목. 
			super("KeyListener의 문자 키 입력 예제");
			// 엑박 닫기 클릭시 종료
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 패널 도구를 이용하기위한 준비 단계
			Container c = getContentPane();
			// 패널의 정렬 배치 관리자, 나란히 정렬하겠다. 
			c.setLayout(new FlowLayout());
			
			// 패널에 라벨 붙이기 작업
			c.add(jLabel);
//			1 화면에 요소를 배치
			
			//2 이벤트 처리기를 붙이는 작업.
			// 생성자 호출 하는 코드, 매개변수 2개 짜리. 
			c.addKeyListener(new MyKeyListener(c,jLabel));
			// 창의 크기
			setSize(250, 150);
			// 보여줄지 여부. 
			setVisible(true);
			
			c.setFocusable(true); // 컨텐트팬이 포커스를 받을 수 있도록 설정
			c.requestFocus(); // 컨텐트팬에 포커스 설정
	}

	public static void main(String[] args) {
		JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");
		// 생성자 이용, 인스턴스 생성. 
		KeyEventTest keyEventTest = new KeyEventTest(la);

	}

}