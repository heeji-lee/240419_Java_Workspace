package util.eventListener;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class MyMouseListener2 implements MouseListener, MouseMotionListener {
	// 외부에서, 해당 클래스의 인스턴스 생성시, jLabel 받기 위한 용도. 
	// DI, Dependency Injection , 의존성 주입, 
	// 생자바, 포함관계 -> has A 관계 라고 부름. , composition 
	public JLabel jLabel;
	

	public MyMouseListener2(JLabel jLabel) {
		this.jLabel = jLabel;
	
	}

	// 이벤트를 처리하는 메서드들입니다. 
	// 마우스 눌렀을 때, 
	public void mousePressed(MouseEvent e) {
		// 라벨을 해당 위치에 이동하기.
		jLabel.setLocation(e.getX(), e.getY());
//		setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")");
		// 라벨에 메모하기. 
		jLabel.setText("mousePressed(" + e.getX() + "," + e.getY() + ")");
	}

	// 마우스를 뗄때,
	public void mouseReleased(MouseEvent e) {
		jLabel.setLocation(e.getX(), e.getY());
//		setTitle("mouseReleased(" + e.getX() + "," + e.getY() + ")");
		jLabel.setText("mouseReleased(" + e.getX() + "," + e.getY() + ")");
	}

	// 누르고, 떼기, 동시 동작. 
	public void mouseClicked(MouseEvent e) {
	}

	// 마우스 호버, 해당 요소에 커서를 올릴 경우
	public void mouseEntered(MouseEvent e) {
		Component comp = (Component) e.getSource();
		comp.setBackground(Color.CYAN);
	}
	// 마우스 호버반대, 해당 요소에 나갔을 경우
	public void mouseExited(MouseEvent e) {
		Component comp = (Component) e.getSource();
		comp.setBackground(Color.YELLOW);
//		setTitle("mouseExited(" + e.getX() + "," + e.getY() + ")");
		jLabel.setText("mouseExited(" + e.getX() + "," + e.getY() + ")");

	}

	// 누른 상태에서, 이동하기(끌기)
	public void mouseDragged(MouseEvent e) {
		jLabel.setLocation(e.getX(), e.getY());
//		setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")");
		jLabel.setText("mouseDragged(" + e.getX() + "," + e.getY() + ")");
	}

	// 마우스 포인터 이동시
	public void mouseMoved(MouseEvent e) {
		jLabel.setLocation(e.getX(), e.getY());
//		setTitle("mouseMoved (" + e.getX() + "," + e.getY() + ")");
		jLabel.setText("mouseMoved(" + e.getX() + "," + e.getY() + ")");

	}
}