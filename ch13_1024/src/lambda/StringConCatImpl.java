package lambda;

public class StringConCatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println("일반 메서드 호출 확인중.");
		System.out.println( s1 + "," + s2 );
	}
}
