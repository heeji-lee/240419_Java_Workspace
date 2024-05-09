package miniProject;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import miniProject.dao.ServiceDB;

public class Main extends JFrame {
	
	private boolean isLogin = false;
	
    public Main() {
        setTitle("메인화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 창 크기
        setSize(1200, 600);
        
        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 5, 5));
        
        // 회원가입
        JButton joinBtn = new JButton("회원가입");
        // 폰트 설정
        joinBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // 맑은 고딕, 굵게, 크기 20
        // 이미지 아이콘
        try {
            URL imageUrlObject = new URL("https://cdn-icons-png.flaticon.com/512/456/456249.png");
            Image image = new ImageIcon(imageUrlObject).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(image);
            joinBtn.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 이미지, 텍스트 정렬
        joinBtn.setVerticalTextPosition(SwingConstants.BOTTOM); // 텍스트를 버튼의 아래쪽에 위치
        joinBtn.setHorizontalTextPosition(SwingConstants.CENTER); // 텍스트를 버튼의 수평 가운데에 위치
        // 버튼을 클릭했을 때 이벤트
        joinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	JTextField idField = new JTextField(10);
        	    JPasswordField passwordField = new JPasswordField(10);		
        	    
        	    JPanel signUpPanel = new JPanel();
        	    signUpPanel.add(new JLabel("아이디:"));
        	    signUpPanel.add(idField);
        	    signUpPanel.add(new JLabel("비밀번호:"));
        	    signUpPanel.add(passwordField);
        	    
        	    Object[] options = {"가입", "취소"};
        	    int result = JOptionPane.showOptionDialog(null, signUpPanel, "회원가입", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        	    
        	    if (result == JOptionPane.OK_OPTION) {
        	    	String id = idField.getText();
        			String password = new String(passwordField.getPassword());
        			ServiceDB serviceDB = new ServiceDB();
        			serviceDB.admin_join(id, password);
        	    }
            }
        });
        panel.add(joinBtn);

        // 로그인
        JButton loginBtn = new JButton("로그인");
        loginBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        try {
            URL imageUrlObject = new URL("https://cdn-icons-png.flaticon.com/512/7856/7856337.png");
            Image image = new ImageIcon(imageUrlObject).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(image);
            loginBtn.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        loginBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        loginBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JTextField idField = new JTextField(10);
                JPasswordField passwordField = new JPasswordField(10);

                JPanel loginPanel = new JPanel();
                loginPanel.add(new JLabel("아이디:"));
                loginPanel.add(idField);
                loginPanel.add(new JLabel("비밀번호:"));
                loginPanel.add(passwordField);
                
                int result = JOptionPane.showOptionDialog(null, loginPanel, "로그인", JOptionPane.OK_OPTION,JOptionPane.PLAIN_MESSAGE, null, new String[]{"로그인"}, "로그인");
                if (result == JOptionPane.OK_OPTION) {
                	String id = idField.getText();
        			String password = new String(passwordField.getPassword());
        			ServiceDB serviceDB = new ServiceDB();
        			isLogin = serviceDB.admin_login(id, password);
                }
            }
        });
        panel.add(loginBtn);

        // 회원관리
        JButton memberBtn = new JButton("회원관리");
        memberBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        try {
            URL imageUrlObject = new URL("https://cdn-icons-png.flaticon.com/512/11573/11573263.png");
            Image image = new ImageIcon(imageUrlObject).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(image);
            memberBtn.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        memberBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        memberBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        memberBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(isLogin) {
            		JTable table;
            		DefaultTableModel model; // DfaultTableModel이 같이 필요함
            		
            		String header[] = { "도서 번호", "도서명", "출판사", "저자명", "도서가격", "카테고리" };
            		String categoryNames[] = { "IT도서", "소설", "비도서", "경제", "사회" };
            		public Book_DB db = new Book_DB();

            		// 패널 선언
            		JPanel p;
            		JLabel bookid[] = new JLabel[header.length]; // 참조형 변수 선언
            		JTextField tf[] = new JTextField[header.length - 1]; // JTextfield 5개 필요 카테고리 하나 빼서

            		setLayout(new BorderLayout());

            		p = new JPanel();
            		p.setLayout(new GridLayout(4, 4)); // 하단에 정렬하기 위해 grid 사용

            		for (int i = 0; i < header.length; i++) {
            		bookid[i] = new JLabel(header[i]);
            		p.add(bookid[i]); // 구역이 나눠진 p에 라벨 넣기
            		if (i < header.length - 1) {
            		tf[i] = new JTextField();
            		p.add(tf[i]);
            		}
            		}
            		// 도서추가 앞에 빈칸 3개 추가 (버튼 나중에 추가)
            		for (int i = 0; i < 2; i++) {
            		p.add(new JLabel(" "));
            		}
            		
            		//JTable 관련 메소드
            		model = new DefaultTableModel(header, bookList.size()) { // 편집이 됨
            		// isCell 단축키
            		@Override
            		public boolean isCellEditable(int row, int column) { // 패널에 저장되어 있는
            		return false; // 편집안됨
            		}
            		};
            		// 컬럼들의 너비 설정
            		table = new JTable(model);
            		table.getColumnModel().getColumn(0).setPreferredWidth(50);
            		table.getColumnModel().getColumn(1).setPreferredWidth(200);
            		table.getColumnModel().getColumn(2).setPreferredWidth(100);
            		table.getColumnModel().getColumn(4).setPreferredWidth(50);
            		table.getColumnModel().getColumn(5).setPreferredWidth(50);

            		// 스크로바 만들기
            		JScrollPane scroll = new JScrollPane(table);

            		putResult();

            		add("Center", scroll); // 위치 순서 상관없음
            		add("South", p);

            		}

            		public BookDTO InsertData() {
            		BookDTO vo = new BookDTO();
            		vo.setBookid(Integer.parseInt(tf[0].getText()));
            		vo.setBookName(tf[1].getText());
            		vo.setPublish(tf[2].getText());
            		vo.setAuthor(tf[3].getText());
            		vo.setPrice(Integer.parseInt(tf[4].getText()));
            		vo.setCategory((String) categoryCombo.getSelectedItem());
            		//DB에 삽입
            		db.insertbook(vo);
            		return vo;
            		}

            		public void initInsertData() {
            		for (int i = 0; i < tf.length; i++) {
            		tf[i].setText("");
            		}
            		categoryCombo.setSelectedIndex(0);
            		}
            		}
            		
            	} else {
            		JOptionPane.showMessageDialog(null, "로그인이 필요합니다.");
            	}
            }
        });
        panel.add(memberBtn);

        // 주문관리
        JButton productBtn = new JButton("주문관리");
        productBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        try {
            URL imageUrlObject = new URL("https://cdn-icons-png.flaticon.com/512/34/34627.png");
            Image image = new ImageIcon(imageUrlObject).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(image);
            productBtn.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        productBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        productBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        productBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            }
        });
        panel.add(productBtn);
        
        // 메인 프레임에 패널 추가
        add(panel);
        // 모든 요소를 화면에 보여줄 여부 
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

