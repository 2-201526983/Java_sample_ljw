package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID(){
		return userID;
	}
	// throws 예외를 미룸
	// throw 임의로 예외 발생        구별 잘하기
	
	//  throws IDFormatException : 정해져있는 예외 처리가 아닌 사용자가 정한 이름 -> IDFormatException 클래스에 정의
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID == null){
			// 임의로 예외를 발생시킴.
			throw new IDFormatException("아이디는 null 일 수 없습니다");
		}
		else if( userID.length() < 8 || userID.length() > 20){
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) { 
			// 사용자가 정의한 예외 클래스 형으로 실행중
			// 맨땅에 다 구현 한게아니라 부모클래스의 도움을 받아 구현 중
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
