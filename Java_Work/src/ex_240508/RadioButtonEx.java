package ex_240508;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {

	private JRadioButton[] fruits = new JRadioButton[3];
	private String[] names = { "사과", "배", "체리" };
	private JLabel selectedFruitLabel;

	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		//
		selectedFruitLabel = new JLabel("선택 된 과일은 : ");
		MyItemRadioListener listener = new MyItemRadioListener(fruits,selectedFruitLabel);

		// 라디오 버튼을 그룹에 추가 하고, 패널에 붙이는 작업.
		ButtonGroup g = new ButtonGroup(); // 버튼 그룹 객체 생성
		for (int i = 0; i < fruits.length; i++) {

			fruits[i] = new JRadioButton(names[i]);

			fruits[i].setBorderPainted(true);

			g.add(fruits[i]);
			c.add(fruits[i]);

			fruits[i].addItemListener(listener);

		}

		c.add(selectedFruitLabel);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
