package util.eventListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class MyMouseListener implements MouseListener {
	
	private JLabel jLabel;
	
	public MyMouseListener(JLabel jLabel) {
		this.jLabel = jLabel;
	}

	public void mouseClicked(MouseEvent event) {
		int x = event.getX(); // 마우스의 클릭 좌표 x
		int y = event.getY(); // 마우스의 클릭 좌표 y
		jLabel.setLocation(x, y); // (x,y) 위치로 레이블 이동
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
}
