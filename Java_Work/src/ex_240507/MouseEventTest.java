package ex_240507;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;

public class MouseEventTest extends JFrame {
	
	// 레퍼런스, 참조형, 인스턴스 -> 집주소, 0x100
//	private JLabel la = new JLabel("Hello"); // "Hello" 레이블
	// 레퍼런스, 참조형, 인스턴스 -> 집주소, 0x200
//	private JLabel la2 = new JLabel("먹고 싶은게 없어요.");
		
	public MouseEventTest() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
//		c.addMouseListener(new MyMouseListener(la));
		ArrayList<JLabel> labels = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel("Label " + (i + 1));
            labels.add(label);
            label.setSize(50, 100);
            int ran = RandomSelectNumber.selectInt(5);
            label.setLocation(30*ran, 30*ran);
    		c.add(label);
        }
		c.addMouseListener(
			// 익명 클래스
			new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent event) {
					int x = event.getX();
					int y = event.getY();
//					la.setLocation(x, y);
//					la2.setLocation(x+30, y+20);
					for(int i = 0; i < labels.size(); i++) {
						JLabel label = labels.get(i);
				        label.setLocation(x+50*i, y+50*i);
					}
				}
	
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			}
		);
		c.setLayout(null);
//		la.setSize(50, 20); // 레이블의 크기 50x20 설정
//		la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
//		la2.setSize(30, 30);
//		la2.setLocation(100, 100);
//		c.add(la);
//		c.add(la2);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 인스턴스 생성, A a = new A();
		MouseEventTest mouserEventTest = new MouseEventTest();
	}

}
