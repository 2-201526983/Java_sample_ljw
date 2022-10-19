package ch6_1019;

public class Animal {
	
	String name;
	int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void move() {
		System.out.println("이동하기.");
	}
	
	
	public Animal() {}
	
	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;

	}
	

}
