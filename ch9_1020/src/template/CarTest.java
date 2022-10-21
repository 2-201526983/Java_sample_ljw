package template;

public class CarTest {

	public static void main(String[] args) {
		
		// 추가해보기 나만의 자동차
		// 추가 기능 (공통기능과, 각 차량 마다의 기능)
		
		
		System.out.println("=== 자율주행 하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
