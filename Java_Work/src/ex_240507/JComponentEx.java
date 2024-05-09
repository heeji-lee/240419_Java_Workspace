package ex_240507;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComponentEx extends JFrame {

	public JComponentEx() {
		//제목
		super("JComponent의 공통 메소드 예제");
		// 패널 도구
		Container c = getContentPane();
		// 배치관리자, 나란히 정렬
		c.setLayout(new FlowLayout());
		// 버튼 3개 생성.
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton("getX(), getY()");
		
		JLabel j1 = new JLabel("테스트");
		// 해당 요소들의 종류와, 이벤트 처리기를 각각 학습.
		
		// ===================================================
		// 버튼1의 배경색
		b1.setBackground(Color.YELLOW);
		// 버튼1의 폰트색
		b1.setForeground(Color.MAGENTA);
		// 버튼1의 글자 폰트 지정. 
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		// 버튼2 비활성화
		b2.setEnabled(false);
		// 버튼3, 이벤트 처리기 붙이기, 방식, 1) 독립 클래스 2) 익명 클래스 방식
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				setTitle(b.getX() + "," + b.getY());
			}
		});
		
		//이미지 라벨 넣기. 
		// 순서1, 이미지 담는 인스턴스 만들기
		ImageIcon testImg = new ImageIcon("src/util/images/sea2_300.png");
		// 순서2, 라벨에 이미지 담기, 
		JLabel imgLabel = new JLabel(testImg); 
		// 순서3, 적용(붙이기)
		c.add(imgLabel);
		
		// 패널에 버튼1 추가
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		c.add(j1);
		// 창 크기
		setSize(260, 200);
		// 모든 요소 보여줄지 여부.
		setVisible(true);
	}

	public static void main(String[] args) {
		// A a = new A();
//		JComponentEx jComponentEx= new JComponentEx();
		// 생성자 호출 바로하기. 
		 new JComponentEx();
	}

}