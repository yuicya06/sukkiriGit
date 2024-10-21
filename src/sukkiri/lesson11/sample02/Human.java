package sukkiri.lesson11.sample02;

//interface からinterfaceの継承
//interface から class は implements
public interface Human extends Creature{
	void talk();
	void watch();
	void hear();
	//さらに、親インタフェースからrun()を継承する
	

}
