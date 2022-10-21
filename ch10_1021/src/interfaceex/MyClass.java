package interfaceex;

public class MyClass implements MyInterface{

	// MyClass 가 MyInterface를 인터페이스 했는데 MyInterface가 X와 Y를 상속받았기떄문에
	// MyClass 에 x와 y를 재정의 해야함
	
	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");		
	}

}
