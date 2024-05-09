package miniProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;

public class ServiceDB {

	// 회원가입
	public void admin_join(String id, String password) {
		
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 명령

		try {
			con = ConnectionDB.getConn();
			String sql = "INSERT INTO admin(id,password) VALUES(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			int r = pstmt.executeUpdate(); // 실행 -> 저장
			
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "회원가입에 실패했습니다."); // e.getMessage()
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
				// 사용한 자원을 finally 문을 이용해서 반납한다.
				// 자원 반납은 사용했던 객체의 역순으로 하며 모두 공통적으로
				// close() 메소드를 사용한다.
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 로그인
	public boolean admin_login(String id, String password) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean loginSuccess = false;

		try {
			con = ConnectionDB.getConn();
			String sql = "SELECT * FROM admin WHERE id=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				loginSuccess = true;
	            JOptionPane.showMessageDialog(null, "로그인 성공");
	        } else {
	            JOptionPane.showMessageDialog(null, "로그인 실패");
	        }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return loginSuccess;
	}
	
	
	
}