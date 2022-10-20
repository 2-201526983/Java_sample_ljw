package virtualfunction;

public class TestA {

	int num;

	void aaa(){
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args){
		
		TestA a1 = new TestA();
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.aaa();
		
		
		// 부모와 자식에 같은 메서드가 있다면 우선순위는 자식에 있는메서드  TestB에 있는걸 주석으로하면 TestA의 메서드가 출력ㄴ
		
		System.out.println("TestB 자기꺼 원래 출력");
		TestB b1 = new TestB();
		b1.aaa();
		
		System.out.println("TestB 부모형 선언 하고 출력");
		TestB b2 = new TestB();
		b2.aaa();
		
		
	}
}
