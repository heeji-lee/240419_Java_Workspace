package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// 자동 임포트 : ctrl + shift + o, 젯브레인 계열 IDE 사용하면, 자동 임포트 됩니다.
public class ButtonImageEx extends JFrame {
	public ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 이미지 아이콘 타입.
		// 이미지 준비물 3장 준비.
		// 평상시 버튼의 이미지
		ImageIcon normalIcon = new ImageIcon("src/util/images/sea2_300.png");
		// 버튼 위에 가져갈 때
		ImageIcon rolloverIcon = new ImageIcon("src/util/images/sea1_300.png");
		// 버튼 클릭시 변경되는 이미지 
		ImageIcon pressedIcon = new ImageIcon("src/util/images/test_img_300.jpg");
		
		JButton btn = new JButton("바다 이미지 샘플", normalIcon);
		
		btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		
		c.add(btn);
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();
	}

}
