package sukkiri.practice.practice_print11.practice03;

public class HorzLine extends AbstLine{

	public HorzLine(int length) {
		super(length);
	}

	//default constructor 記述しなければ、暗黙的に呼ばれる
	//super()は書かなくてok

			   //オーバーロードの場合、実装できていない
	@Override //付けても記述は可能だが、もとと異なった場合（引数追加など）、にエラーを出してくれる
	public void draw() {
		
		for(int i = 0; i < getLength(); i++) {
			System.out.print(getHorzline());
			
		}
		
		System.out.println();
		
	}

	
	
}
