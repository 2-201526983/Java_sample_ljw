package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		System.out.println("strClass.getConstructors() 의 내용 출력 해보기.");
		
		for(Constructor c : cons){
			System.out.println(c);
		}
		System.out.println();
		Field[] fields = strClass.getFields();
		System.out.println("strClass.getFields() 의 내용 출력 해보기.");
		for(Field f : fields){
			System.out.println(f);
		}
		System.out.println();
		Method[] methods = strClass.getMethods();
		System.out.println("strClass.getMethods() 의 내용 출력 해보기.");
		for(Method m : methods){
			System.out.println(m);
		}
	}
}
