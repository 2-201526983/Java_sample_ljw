package ch6_1019;

public class AnimalTest {

	public static void main(String[] args) {
		

		
		Animal tomDog = new Animal();
		tomDog.age = 3;
		tomDog.setName("톰강아지");
		
		System.out.println("동물 나이 " +tomDog.getAge());
		System.out.println("동물 이름 " + tomDog.name);
		tomDog.move();
		

		
		System.out.println("============================================");
		
		//나이와 이름을 한번에 초기화하는 생성자 생성해서(매개변수2개인 생성자) 나이와 이름을 출력해보기 
		
		
		Animal tomDog2 = new Animal(4,"강아지");
		
		System.out.println("동물 나이 " +tomDog2.getAge());
		System.out.println("동물 이름 " + tomDog2.name);
		tomDog2.move();
		
		
		
		System.out.println(tomDog2);
		
		
		
	}

}
