package login;

import java.sql.*;

public class Database {
	Connection con = null;
	Statement stmt = null;
	
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "scott"; // DB ID
	private static final String PASS = "tiger"; // DB 패스워드

	Database() { // 데이터베이스에 연결한다.
		try {
			Class.forName(DRIVER); // 1. 드라이버 로딩
			con = DriverManager.getConnection(URL, USER, PASS); // 2. 드라이버 연결
			System.out.println("DB연결 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public int login(String id, String password) { // 어떤 계정에 대한 실제로 로그인을 시도하는 함수, 인자값으로 ID와 Password를 받아 login을 판단함.
		String SQL = "SELECT password FROM USER WHERE id = ?"; // 실제로 DB에 입력될 명령어를 SQL 문장으로 만듬.
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,  id);
			rs = pstmt.executeQuery(); // 어떠한 결과를 받아오는 ResultSet 타입의 rs 변수에 쿼리문을 실행한 결과를 넣어줌 
			if (rs.next()) {
				if (rs.getString(1).contentEquals(password)) {

					return 1; // 로그인 성공
				}
				else {
					return 0; // 비밀번호 불일치
				}
			}
			return -1; // 아이디가 없음
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // DB 오류 
	}
	
	
	

	
	  //로그인 정보를 확인 
	boolean logincheck(String _i, String _p) { boolean flag = false;
	    
	  String id = _i; 
	  String pw = _p;
	  
	  try { 
		   String checkingStr = "SELECT password FROM RD_member WHERE id='" + id + "'"; 

		  ResultSet result = stmt.executeQuery(checkingStr);
	  
	  int count = 0; while(result.next()) {
		  
	  if(pw.equals(result.getString("password"))) { flag = true;
	  System.out.println("로그인 성공"); 
	  }
	  
	  else {
		  flag = false; System.out.println("로그인 실패"); } count++; 
		  }
	  }
	  catch(Exception e) {
		  flag = false; System.out.println("로그인 실패 > " +
	  e.toString()); 
		  
	  }
	  
	  return flag; 
	  }
	 

}