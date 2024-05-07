package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 우리가 만든 , 이벤트 리스너임. 
import util.eventListener.MyActionListener;

// 이벤트 리스너를 처리하는 클래스 만들기. : MyActionListener

// 작업 순서1,JFrame 상속 받기. 
public class EventTest2 extends JFrame {
	// 작업 순서2,
	// 생성자에서, 그림을 그리는 요소를 배치 및 이벤트 처리 작업 하기.
	public EventTest2() {
		setTitle("Action 이벤트 리스너, 익명클래스로 구현하기. 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 창 위에, 패널을 붙이기, 도화지.
		Container c = getContentPane();
		// flex , 그림 요소를 나란히 정렬해주는 도구(매니저)
		c.setLayout(new FlowLayout());
		// 요소, 컴포넌트라고도 부름. 버튼.
		JButton btn = new JButton("test");

		// 미니실습, 작업순서1, 그림 그리기, 버튼 추가.
		JButton btn2 = new JButton("test2");
		
		JButton btn3 = new JButton("test3");

		// 버튼을 클릭시, 리스너를 등록하기.
		// 리스너는, 따로 클래스를 만들어서, 재사용을 함.
		// 1 독립 클래스, 2 내부클래스, 3 익명클래스
		// 이벤트 리스너, 일회용으로 많이 사용하지만,
		// 자주 반복적으로 작업시, 1,2, 따로 이름있는 클래스
		// 만들어서 재사용을함.

		// 작업순서, 마지막, 이벤트 처리기 적용하기.
		// 독립된 클래스, util.eventListener 패키지 밑에 클래스 만들어서, 재사용.
		// 재사용을 안하고, 익명 클래스로, 1회용으로 사용하겠다.
		// 익명 클래스 정의, -> 원래 : A a = new A();
		// 부모 클래스 이름을 이용해서 사용함. 이벤트 처리하는 중.
		// 이벤트 처리 할려면, ActionListener 필요했음. 활용해보기.
		// 정의 : new 익명클래스의 부모클래스(인터페이스)() {재정의를 해서 사용함. }
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				JButton testBtn = (JButton) event.getSource();

				if (testBtn.getText().equals("test")) {
					testBtn.setText("테스트");
				} else if (testBtn.getText().equals("테스트")) {
					testBtn.setText("test");
				} else if (testBtn.getText().equals("test2")) {
					testBtn.setText("테스트2");
				} else if (testBtn.getText().equals("테스트2")) {
					testBtn.setText("test2");
				}
			}// actionPerformed 닫기

		});// 익명클래스 구현 닫는 부분.
		
		// 패널에 버튼 붙이기 작업.
		c.add(btn);

		// 미니실습, 작업순서2, 버튼 패널에 붙이기.
		c.add(btn2);
		
		c.add(btn3);

		// 미니실습, 작업순서3, 이벤트 처리기(리스너) 붙이기.
		btn2.addActionListener(new MyActionListener());
		
		btn3.addActionListener(
			// 부모 클래스(인터페이스)
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					JButton testBtn = (JButton) event.getSource();
	
					if (testBtn.getText().equals("test3")) {
						testBtn.setText("테스트3");
					} else {
						testBtn.setText("test3");
					}
				}
		});

		// 창 크기,
		setSize(250, 120);
		// 모든 요소를 화면에 보여줄 여부
		setVisible(true);
	}

	public static void main(String[] args) {
		// 화면을 그리는 인스턴스 생성 , 실행하기.
		EventTest2 eventTest1 = new EventTest2();

	}

}