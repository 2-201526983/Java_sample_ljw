package ch5_1018;

public class Student {
	int stuNo;//1번
	String stuName; // 이재원
	String stuClass; //402호
	String stuHome; //부산 oo구
	
//	public void getStuNo() {
//		//get 메서드
//	}
	
//	public void setStuNo() {
//		//set 메서드
//	}
	
	
//	자동으로 만드는법 우클릭 소스 제너레이트 게터 and 세터
	
	
	

	
	

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	
	

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public String getStuHome() {
		return stuHome;
	}

	public void setStuHome(String stuHome) {
		this.stuHome = stuHome;
	}
	
	
	
	
	
	
	
	
	
	
	public void studySub(String stuName)  {
		System.out.println(stuName +"자바 공부중.");
		
	}
	
	

	
	
	


//	
//	public Student() {};
//	public Student(int stuNo) {};
//	public Student() {};
//	public Student() {};
//	
//	
	
	
	
	public Student(int stuNo, String stuName, String stuClass, String stuHome) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuHome = stuHome;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
//		Student ljw = new Student();
//		ljw.stuNo = 1;
//		ljw.stuName = "LJW";
//		
//		System.out.println("해당 학생증 번호를 get 메서드를 통해서 접근해서 출력");
//		System.out.println(ljw.getStuNo());
//		
//		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
//		System.out.println(ljw.stuNo);
//		
//		
//		
//		Student ljw2 = new Student(); // ljw2 학생의 학생 번호를 2번으로 set 메서드를 통해서 지정
//		ljw2.setStuNo(2);
//		System.out.println("해당 학생증 번호를 get 메서드를 통해서 접근해서 출력");
//		System.out.println(ljw2.getStuNo());
//		
//		System.out.println("=========================");
//		
//		
//		Student ljw3 = new Student();
//		ljw3.stuNo = 12;
//		ljw3.stuName = "LJW";
//		ljw3.setStuClass("402");
//		ljw3.setStuHome("연제구");
//
//		
//		System.out.println("해당 학생증 번호와 이름 직접 접근해서 출력");
//		System.out.println(ljw3.stuNo);
//		System.out.println(ljw3.stuName);
//		
//		System.out.println("해당 학생증 클래스랑 집 get 메서드를 통해서 접근해서 출력");
//		System.out.println(ljw3.getStuClass());
//		System.out.println(ljw3.getStuHome());
//		
//	
//		ljw3.studySub("LJW3  ");
		
		
		// 본인들의 아이디로 이니셜로 해당 참조형 변수(인스턴스) 만들기
		// 해당 값 설정은 번호 이름 직접 설정하고 클래스랑 집은 set 함수를 통해서 만들기
		//해당 값을 출력 할때 번호 이름 직접 출력하고 클래스랑 집은 get 함수를 통해서 만들기
		
		
		
		
//		System.out.println("========해당 인스턴스(참조형 변수)를 확인 안에 뭐가들어있는지.? ============");
//		System.out.println("ljw : " + ljw );
//		System.out.println("ljw2 : " + ljw2 );
//		System.out.println("ljw3 : " + ljw3 );

		
		Student ljw4 = new Student(4,"ljw4","402","연제구구");

		System.out.println(ljw4.stuNo);
		System.out.println(ljw4.stuName);
		System.out.println(ljw4.stuClass);
		System.out.println(ljw4.stuHome);
		
		
		
	}

}
