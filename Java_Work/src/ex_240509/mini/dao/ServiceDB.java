package ex_240509.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ServiceDB {

	// 추가

	public boolean insertMember(String name, String email, String password) {
		boolean ok = false;

		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 명령

		try {

			con = ConnectionDB.getConn();
			String sql = "insert into member501(" + "id,name,email,password" + ") "
					+ "values(member501_seq.NEXTVAL,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			int r = pstmt.executeUpdate(); // 실행 -> 저장

			if (r > 0) {
				System.out.println("insert 성공");
				ok = true;
			} else {
				System.out.println("insert");
			}

		} catch (Exception e) {
			e.printStackTrace();
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

		return ok;
	}

	// 조회
	public String selectMember() {
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 명령
		ResultSet rs = null; // 결과
		
		StringBuffer stringBuffer = new StringBuffer();

		try {
			con = ConnectionDB.getConn();
			String sql = "select * from member501";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				stringBuffer.append("아이디 : " + id + ", 이름 : " + name + ", 이메일 : " + email + ", 비밀번호: " + password +"\n");			
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return stringBuffer.toString();

	}
	
	// 수정
	public String updateMember(int id, String name, String email, String password) {
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 명령
		
		String result = "";

		try {
			con = ConnectionDB.getConn();
            String sql = "UPDATE member501 SET name = ? , email = ?, password = ? WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            pstmt.setInt(4, id);
            int r = pstmt.executeUpdate();
            if (r > 0) {
            	result = "update 성공";
			} else {
				result = "update 실패";
			}
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            try {;
               if (pstmt != null)
                  pstmt.close();
               if (con != null)
                  con.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
		
		return result;
	}

	// 삭제
	public String deleteMember(int id) {
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 명령
		
		String result = "";
		
		try {
			con = ConnectionDB.getConn();
            String query = "DELETE FROM member501 WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            int r = pstmt.executeUpdate();
            if (r > 0) {
				result = "delete 성공";
			} else {
				result = "delete 실패";
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
		
		return result;
	}
	
}