package ex_240503.SwingTest;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// JFrame 그림도구 상속받기.
public class Swing4 extends JFrame {
	public Swing4() {
		// 제목
		setTitle("300x300 스윙 프레임 만들기");
		// 창의 X 표시를 클릭시 종료하는 코드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 사이즈
		setSize(1000, 800);
		// 컨텐트팬 알아내기
		Container contentPane = getContentPane();
		// 패널 추가하기
		contentPane.setBackground(Color.PINK); // 오렌지색 배경 설정
		// 배치관리자 달기
		// setLayout(null) : 배치 관리자 없이 우리가 직접 절대 위치 잡아야 함.
		contentPane.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		// 오른쪽으로 130만큼 이동, 아랫쪽으로 50만큼 이동
		la.setLocation(300, 50); // la를 (130,50) 위치로 지정
		la.setSize(200, 20); // la를 200x20 크기로 지정
		contentPane.add(la); // la를 컨텐트팬에 부착
		// 9개의 버튼 컴포넌트를 생성하고 동일한 크기로 설정한다.
		// 위치는 서로 겹치게 설정한다.
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton("버튼 " + Integer.toString(i)); // 버튼 생성
			b.setLocation(i * 15, i * 15); // 버튼의 위치 설정                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
			b.setSize(200, 150); // 버튼의 크기는 동일하게 50x20
			contentPane.add(b); // 버튼을 컨텐트팬에 부착
		}

		// 임의로 버튼 오른쪽에 하나 더 추가해보기.
		JButton tempBtn = new JButton("TempBtn");
		tempBtn.setLocation(500,400);
		tempBtn.setSize(300,200);
		contentPane.add(tempBtn);
		
		// 창 보여줄지 여부
		setVisible(true);
	}

	public static void main(String[] args) {
		// 인스턴스를 생성하는 과정 중에 기본 생성자를 호출해서 실행함.
		Swing4 swing1 = new Swing4();
	}
}
