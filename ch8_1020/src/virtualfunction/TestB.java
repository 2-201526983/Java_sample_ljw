package virtualfunction;

public class TestB extends TestA{
	
	@Override
	void aaa(){
		System.out.println("콘솔 출력을 3개로 수정");
		System.out.println("aaa() 출력1");
		System.out.println("aaa() 출력2");
	}

}
