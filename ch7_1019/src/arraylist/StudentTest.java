package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
		
		
		
		Student studentjw = new Student(1003, "LJW");
		
		studentjw.addSubject("국어", 100);
		studentjw.addSubject("수학", 15);
		studentjw.addSubject("영어", 85);
		studentjw.addSubject("역사", 95);
		
		
		System.out.println("======================================");
		studentjw.showStudentInfo();
		
		
	}
}
