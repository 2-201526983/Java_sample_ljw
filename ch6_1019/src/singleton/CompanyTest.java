package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//같은 인스턴스를 사용했기때문에 같은 값을 가짐
		
		System.out.println("myCompany1 의 참조값 주소 :" + myCompany1);
		System.out.println("myCompany2 의 참조값 주소 :" + myCompany2);
		System.out.println( myCompany1 == myCompany2 );
		
		
		myCompany1.address = "부산";
		myCompany1.name = "ljw";
		myCompany1.age = 39;
		
		System.out.println("myCompany1 address : " + myCompany1.address);
		System.out.println("myCompany1 name : " + myCompany1.name);
		System.out.println("myCompany1 age : " + myCompany1.age);
		
		System.out.println("======================================================");
		
		System.out.println("myCompany2 address : " + myCompany2.address);
		System.out.println("myCompany2 name : " + myCompany2.name);
		System.out.println("myCompany2 age : " + myCompany2.age);
		
	}
}
