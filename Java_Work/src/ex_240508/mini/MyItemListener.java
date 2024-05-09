package ex_240508.mini;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

//Item 리스너 구현
class MyItemListener implements ItemListener {
	// 인스턴스 멤버,
	private int sum = 0; // 가격의 합
	
	// A 클래스 -> B 클래스, 인스턴스를 전달하고, 
	// B 클래스에서 받을 때, 멤버를 만들고, 생성자로 받기. 
	private JCheckBox[] fruits;
	private JLabel sumLabel;
	
	public MyItemListener(JCheckBox[] fruits, JLabel sumLabel) {
		this.fruits = fruits;
		this.sumLabel = sumLabel;
	}
	

	// 체크박스 -> 구성품 -> 아이템이라고 부름. 각 요소가 아이템입니다.
	// 각 아이템 요소들이 체크 또는 체크 해제가 될 때마다, 이 메서드가 호출이 됨.
	public void itemStateChanged(ItemEvent event) {
		// 아이템 요소 중에서, 예를 들어서 사과를 선택 했음.
		// event.getStateChange() -> 아이템 요소의 체크 여부 확인.
		if (event.getStateChange() == ItemEvent.SELECTED) { // 아이템 요소가 체크 될경우
			// event.getItem() , 어느 아이템을 선택 했나요? 사과 라는 체크박스 타입을 선택
			// , JCheckBox [] fruits
			//"돼지국밥 9500원, 회덮밥 10000원, 돌솥비빔밥 7000원, 찜닭 20000원, 햄버거 8000원"));
			if (event.getItem() == fruits[0])
				sum += 9500;
			else if (event.getItem() == fruits[1])
				sum += 10000;
			else if (event.getItem() == fruits[2])
				sum += 7000;
			else if (event.getItem() == fruits[3])
				sum += 20000;
			else
				sum += 8000;
		} else { // 아이템 요소가 체크 안 될 경우
			if (event.getItem() == fruits[0])
				sum -= 9500;
			else if (event.getItem() == fruits[1])
				sum -= 10000;
			else if (event.getItem() == fruits[2])
				sum -= 7000;
			else if (event.getItem() == fruits[3])
				sum -= 20000;
			else
				sum -= 8000;
		}
		sumLabel.setText("현재 " + sum + "원 입니다.");
	}
}
