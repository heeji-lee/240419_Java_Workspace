package ex_240509.mini;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ex_240509.mini.dao.ServiceDB;

public class TextAreaJdbcExMini extends JFrame {
	
	private JTextArea ta = new JTextArea(7, 20);
	
	// 인스턴스 멤버로 선언만하고, 아래에서 할당했음. 
	// 각 메서드 안에서도 이용이 가능해요, -> 이 클래스 내부에 전역처럼 이용됨.
	JTextField idField;
	JTextField nameField;
	JTextField emailField;
	JTextField passwordField;
	JTextField passwordConfirmField;
	
	JButton joinBtn;
	JButton selectBtn;
	JButton updateBtn;
	JButton deleteBtn;
	JButton clearBtn;
	
	// 행과 열을 테이블 형식으로 배치 관리자. 
	GridBagLayout gb;
	// Constraints , 제약 조건, 행, 열의 위치, 크기, 여백, 가득채우기 등. 옵션을 지정 가능. 
	GridBagConstraints gbc;

	public TextAreaJdbcExMini() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
//		c.setLayout(new FlowLayout());
		// GridBagLayout, 인스턴스 생성. 
		gb = new GridBagLayout();
		// 패널에 붙이기 
		setLayout(gb);
		// GridBagConstraints, 옵션을 추가하는 도구. 
		gbc = new GridBagConstraints();
		
		// 가로, 세로의 빈공간을 가득 채우겠다. 
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

//		c.setLayout(new GridLayout(4, 2));

		JLabel id = new JLabel("아이디 ");
		idField = new JTextField(20);
		gbAdd(id, 0, 0, 1, 1);
		gbAdd(idField, 1, 0, 3, 1);
		
		JLabel name = new JLabel("이름 ");
		nameField = new JTextField(20);
		// gbAdd : 메서드 (배치할 요소(버튼,라벨),x(열), y(행), w(가로폭),h(세로높이))
		gbAdd(name, 0, 1, 1, 1);
		gbAdd(nameField, 1, 1, 3, 1);

		JLabel email = new JLabel("이메일 ");
		emailField = new JTextField(20);
		gbAdd(email, 0, 2, 1, 1);
		gbAdd(emailField, 1, 2, 3, 1);
//
		JLabel password = new JLabel("패스워드 ");
		passwordField = new JTextField(20);
		gbAdd(password, 0, 3, 1, 1);
		gbAdd(passwordField, 1, 3, 3, 1);
//		
		JLabel passwordConfirm = new JLabel("패스워드 확인 ");
		passwordConfirmField = new JTextField(20);
		gbAdd(passwordConfirm, 0, 4, 1, 1);
		gbAdd(passwordConfirmField, 1, 4, 3, 1);
		
		joinBtn = new JButton("회원가입");
		gbAdd(joinBtn, 0, 5, 4, 1);
		
		clearBtn = new JButton("클리어");
		gbAdd(clearBtn, 0, 6, 4, 1);
		
		selectBtn = new JButton("조회");
		gbAdd(selectBtn, 0, 7, 4, 1);
		
		updateBtn = new JButton("수정");
		gbAdd(updateBtn, 0, 8, 4, 1);
		
		deleteBtn = new JButton("삭제");
		gbAdd(deleteBtn, 0, 9, 4, 1);
		
		JLabel resultLabel = new JLabel("결과뷰");
		gbAdd(resultLabel, 0, 10, 4, 1);
		
		JScrollPane resultJScrollPane = new JScrollPane(ta);
		gbAdd(resultJScrollPane, 0, 11, 4, 1);
		
		// 이벤트 처리기. 방식, 익명클래스로 이용.
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == joinBtn) {
					String name = nameField.getText();
					String email = emailField.getText();
					String password = passwordField.getText();
					String passwordConfirm = passwordConfirmField.getText();
					ServiceDB serviceDB = new ServiceDB();
					serviceDB.insertMember(name, email, password);
				} 			
			}
		});
		
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == clearBtn) {
					idField.setText("");
					nameField.setText("");
					emailField.setText("");
					passwordField.setText("");
					passwordConfirmField.setText("");
//					resultLabel.setText("");
					ta.setText("");
				}
			
			}
		});
		
		selectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == selectBtn) {
					ServiceDB serviceDB = new ServiceDB();
					String result = serviceDB.selectMember();
					ta.setText(result);
				}
			
			}
		});
		
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == updateBtn) {
					int id = Integer.parseInt(idField.getText());
					String name = nameField.getText();
					String email = emailField.getText();
					String password = passwordField.getText();
					ServiceDB serviceDB = new ServiceDB();
					String result = serviceDB.updateMember(id, name, email, password);
					ta.setText(result);
				}
			
			}
		});
		
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == deleteBtn) {
					int id = Integer.parseInt(idField.getText());
					ServiceDB serviceDB = new ServiceDB();
					String result = serviceDB.deleteMember(id);
					ta.setText(result);
				}
			
			}
		});
		
		setSize(400, 700);
//		setResizable(false);
		setVisible(true);
	}

	// 그리드백레이아웃에 붙이는 메소드
	private void gbAdd(JComponent c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gb.setConstraints(c, gbc);
		gbc.insets = new Insets(2, 2, 2, 2);
		add(c, gbc);
	}// gbAdd

	public static void main(String[] args) {
		new TextAreaJdbcExMini();
	}

}