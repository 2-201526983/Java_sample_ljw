package gamelevel;

public abstract class PlayerLevel {

	//추상 메서드는 반드시 구현을 해주세요. 강제성을 부여
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	// 탬플릿 메서드, go 메서드 ,매개변수 count가 들어가고
	// go 안에 run(), 반복문으로 해당 jump , turn.
	// go는 final로 선언되서 변경할수 없다
	final public void go(int count)
	{
		run();
		for(int i=0; i<count; i++){
			jump();
		}
		turn();
	}
}
