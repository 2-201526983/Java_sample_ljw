package duckWorld;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		System.out.println("======청둥오리======");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		
		// 물오리 만들기. 
		System.out.println("======물오리======");
		Duck swimDuck = new WaterDuck();
		swimDuck.performQuack();
		swimDuck.performFly();
		swimDuck.swim();
		swimDuck.performSwim();
		
	}

}
