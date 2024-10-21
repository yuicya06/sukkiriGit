package sukkiri.lesson14.sample04;


public class Hero {
	
	String name;
	int hp;
	
	/*14-9*/
	static int money; // 静的フィールド
	
	@Override
	public String toString() {
		return "名前：" + this.name + " / HP : " + this.hp;
	}
	
	/*14-7*/
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(o instanceof Hero h) {
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	

	
	
	
}
