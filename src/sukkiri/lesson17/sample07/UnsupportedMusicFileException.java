package sukkiri.lesson17.sample07;

//例外クラス Exceptionクラスを継承
public class UnsupportedMusicFileException  extends Exception{
	//エラーメッセージを受け取るコンストラクタ
	
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}

}
