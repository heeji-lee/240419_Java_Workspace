package ex_240508.mini;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.RandomSelectNumber;

public class CheckBoxItemEventExMini extends JFrame {
	
	// 인스턴스 멤버
	private JCheckBox[] fruits = new JCheckBox[5];
	private String[] names = { "돼지국밥", "회덮밥", "돌솥비빔밥" ,"찜닭", "햄버거"};
	private JLabel sumLabel;

	// 생성자, 
	public CheckBoxItemEventExMini() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 패널에 라벨 붙이기
		JLabel menuJLabel = new JLabel("돼지국밥 9500원, 회덮밥 10000원, 돌솥비빔밥 7000원, 찜닭 20000원, 햄버거 8000원");
		c.add(menuJLabel);
		
		sumLabel = new JLabel("현재 0 원 입니다.");
		
		//이벤트 처리기 작업.
		MyItemListener listener = new MyItemListener(fruits,sumLabel);
		
		//
		for (int i = 0; i < fruits.length; i++) {
			// fruits[0] 요소로, JCheckBox 인스턴스, 
			// String[] names = { "사과", "배", "체리" };
			// 각 체크박스 구성하기.
			fruits[i] = new JCheckBox(names[i]);
			// 각 체크박스 테두리 설정. 
			fruits[i].setBorderPainted(true);
			// 패널에 체크박스 추가하기. 
			c.add(fruits[i]);
			// 각 체크 박스 마다, 이벤트 처리기 붙이기 작업. 
			// 이벤트 처리기 붙이는 방법1) 독립 클래스, 방법2) 익명클래스. 
			fruits[i].addItemListener(listener);
			//fruits[i].addItemListener(new MyItemListener());
		}
		//버튼 추가하기. 
		JButton recommendBtn = new JButton("자동 메뉴 랜덤 추천");
		recommendBtn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						System.out.println("작업순서1 , 자동 메뉴 램덤 추천 클릭");
						JButton testBtn = (JButton) event.getSource();
						if (testBtn.getText().equals("자동 메뉴 랜덤 추천")) {
							//랜덤한 정수 뽑기.
							// randomNum : 정수 : 0이상 5미만, 예) 3 뽑힘
							// 1 이상 5미만
							System.out.println("작업순서2 , 자동 메뉴 램덤 추천 클릭");
							int randomNum = RandomSelectNumber.selectInt(4)+1;
//							System.out.println("randomNum : "+ randomNum);
							System.out.println("작업순서3 , 자동 메뉴 램덤 추천 클릭 randomNum: " + randomNum);
							// randomNum : 3, 3번을 반복, 0, 1, 2
							for (int i = 0; i < randomNum; i++) {
								// randomNum : 3 , 0이상 3미만
								System.out.println("작업순서4 , 자동 메뉴 램덤 추천 클릭 : 반복문 안");
								int randomNum2 = RandomSelectNumber.selectInt(5);
								System.out.println("작업순서5 , 자동 메뉴 램덤 추천 클릭 : 반복문 안 randomNum2: " + randomNum2);
								// 체크박스 요소를 체크를 하는 메서드. 
								fruits[randomNum2].setSelected(true);
								System.out.println("작업순서6 , 자동 메뉴 램덤 추천 클릭 : 체크박스가 체크가 됨.");
								
							}
						}
						
					}
				}
				);
		c.add(recommendBtn);
		//버튼 추가하기. 
		JButton clearBtn = new JButton("Clear");
		//이벤트 
		clearBtn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						JButton testBtn = (JButton) event.getSource();
						if (testBtn.getText().equals("Clear")) {
							for (int i = 0; i < fruits.length; i++) {
								fruits[i].setSelected(false);
							}
						}
						
					}
				}
				);
		c.add(recommendBtn);
		c.add(clearBtn);
		
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	} // 생성자 끝



	public static void main(String[] args) {
		new CheckBoxItemEventExMini();
	}

}
