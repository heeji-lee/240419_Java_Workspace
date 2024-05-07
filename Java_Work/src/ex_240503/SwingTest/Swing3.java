package ex_240503.SwingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// JFrame 그림도구 상속받기.
public class Swing3 extends JFrame {
	public Swing3() {
		// 제목
		setTitle("300x300 스윙 프레임 만들기");
		// 창의 X 표시를 클릭시 종료하는 코드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 사이즈
		setSize(300, 300);
		// 컨텐트팬 알아내기
		Container contentPane = getContentPane();		
 		// 패널 추가하기
		contentPane.setBackground(Color.PINK); // 오렌지색 배경 설정
		// 배치관리자 달기
		// new GridLayout(행, 열, 수평 간격, 수직 간격)
		contentPane.setLayout(new GridLayout(4,3,20,10));
		contentPane.add(new JButton("Home1"));
		contentPane.add(new JButton("Home2"));
		contentPane.add(new JButton("Home3"));
		contentPane.add(new JButton("Home4"));
		contentPane.add(new JButton("Home5"));
		contentPane.add(new JButton("Home6"));
		contentPane.add(new JButton("Home7"));
		contentPane.add(new JButton("Home8"));
		contentPane.add(new JButton("Home9"));
		contentPane.add(new JButton("Home10"));
		contentPane.add(new JButton("Home11"));
		contentPane.add(new JButton("Home12"));
//		contentPane.add(new JButton("Home13")); // 오버플로우
		
		// 창 보여줄지 여부
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 인스턴스를 생성하는 과정 중에 기본 생성자를 호출해서 실행함.
		Swing3 swing1 = new Swing3();
	}
}
