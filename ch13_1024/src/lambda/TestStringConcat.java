package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		//일반메서드 방식
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		int i = 100;
		
		// 람다식 방식
		// interface StringConcat : 다형성으로 변수를 선언.
		// 함수 호출 시 익명 함수(메서드) , 디버깅시 왼쪽에 스택 메모리 구조를 보면 이름 대신에,
		// 숫자로 표기가 되어 있음.
		System.out.println("람다식으로 출력 확인중.");
		StringConcat concat2 = (s, v)->System.out.println(s + "," + v ); //System.out.println(i);
		concat2.makeString(s1, s2);
		i = 300;
		
		// 익명의 내부클래스 생략 되있음
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("익명의 내부클래스 형식으로 재정의된 메서드 호출.");
				System.out.println( s1 + "," + s2 );
			}
		};
		
		concat3.makeString(s1, s2);
		
	}

}