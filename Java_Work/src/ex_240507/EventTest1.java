package ex_240507;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 우리가 만든 , 이벤트 리스너임. 
import util.eventListener.MyActionListener;

// 이벤트 리스너를 처리하는 클래스 만들기. : MyActionListener

// 작업 순서1,JFrame 상속 받기. 
public class EventTest1 extends JFrame{
	// 작업 순서2, 
	// 생성자에서, 그림을 그리는 요소를 배치 및 이벤트 처리 작업 하기. 
	public EventTest1() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 창 위에, 패널을 붙이기, 도화지.
		Container c = getContentPane();
		// flex , 그림 요소를 나란히 정렬해주는 도구(매니저)
		c.setLayout(new FlowLayout());
		// 요소, 컴포넌트라고도 부름. 버튼. 
		JButton btn = new JButton("test");
		JButton btn2 = new JButton("test2");
		// 버튼을 클릭시, 리스너를 등록하기. 
		// 리스너는, 따로 클래스를 만들어서, 재사용을 함.
		// 1 독립 클래스, 2 내부클래스, 3 익명클래스
		// 이벤트 리스너, 일회용으로 많이 사용하지만, 
		// 자주 반복적으로 작업시, 1,2, 따로 이름있는 클래스
		// 만들어서 재사용을함. 
		btn.addActionListener(new MyActionListener());
		btn2.addActionListener(new MyActionListener());
		// 패널에 버튼 붙이기 작업. 
		c.add(btn);
		c.add(btn2);
		// 창 크기,
		setSize(250, 120);
		// 모든 요소를 화면에 보여줄 여부 
		setVisible(true);
	}

	public static void main(String[] args) {
		EventTest1 eventTest1 = new EventTest1();
	}

}