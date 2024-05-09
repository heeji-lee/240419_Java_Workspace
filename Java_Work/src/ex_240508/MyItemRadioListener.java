package ex_240508;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//Item 리스너 구현
class MyItemRadioListener implements ItemListener {
	// 인스턴스 멤버,
	private String selectedFruit = ""; // 가격의 합
	// 결과 라벨
	private JLabel selectedFruitLabel;
	private JRadioButton[] fruits;

	public MyItemRadioListener(JRadioButton[] fruits, JLabel selectedFruitLabel) {
		this.fruits = fruits;
		this.selectedFruitLabel = selectedFruitLabel;
	}

	// 체크박스 -> 구성품 -> 아이템이라고 부름. 각 요소가 아이템입니다.
	// 각 아이템 요소들이 체크 또는 체크 해제가 될 때마다, 이 메서드가 호출이 됨.
	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) { // 아이템 요소가 체크 될경우
			// event.getItem() , 어느 아이템을 선택 했나요? 사과 라는 체크박스 타입을 선택
			// , JCheckBox [] fruits
			//"돼지국밥 9500원, 회덮밥 10000원, 돌솥비빔밥 7000원, 찜닭 20000원, 햄버거 8000원"));
			if (event.getItem() == fruits[0]) {
				selectedFruit = fruits[0].getText();
				selectedFruitLabel.setText("현재 선택된 과일은 " + selectedFruit + " 입니다.");
			}
			else if (event.getItem() == fruits[1]) {
				selectedFruit = fruits[1].getText();
				selectedFruitLabel.setText("현재 선택된 과일은 " + selectedFruit + " 입니다.");
			}else if (event.getItem() == fruits[2]) {
				selectedFruit = fruits[2].getText();
				selectedFruitLabel.setText("현재 선택된 과일은 " + selectedFruit + " 입니다.");
			}

		}
	}
}
