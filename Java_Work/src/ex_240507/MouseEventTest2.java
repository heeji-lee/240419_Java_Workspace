package ex_240507;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;
import util.dto.Person;
import util.eventListener.MyMouseListener;
import util.eventListener.MyMouseListener2;

public class MouseEventTest2 extends JFrame {

	// 생성자 정의,
	public MouseEventTest2(JLabel jLabel) {
		// 창제목
		setTitle("MouseListener와 MouseMotionListener 예제");
		// 창 잘 닫기 기능. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 패널 붙이는 도구. 
		Container c = getContentPane();
		
		// 이벤트 처리기 인스턴스 생성. 
		MyMouseListener2 listener = new MyMouseListener2(jLabel);
		// 패널에 이벤트 처리기 붙이기 적용
		c.addMouseListener(listener);
		// 패널에 이벤트 처리기 붙이기 적용.
		c.addMouseMotionListener((MouseMotionListener) listener);
		// 배치 관리자 없음. 위치를 자유롭게 지정. 
		c.setLayout(null);
		// 라벨의 가로 , 세로 크기
		jLabel.setSize(150, 20);
		// 라벨의 시작 위치. 
		jLabel.setLocation(100, 80);
		// 레이블 컴포넌트 삽입
		c.add(jLabel); 
		// 창의 크기
		setSize(300, 200);
		// 전체 요소를 보여줄지 여부. 
		setVisible(true);
	}

	public static void main(String[] args) {
		JLabel la = new JLabel(" Move Me");
		// 생성자 이용(호출), 인스턴스 생성. 
		MouseEventTest2 mouseEventTest2 = new MouseEventTest2(la);

	}

}