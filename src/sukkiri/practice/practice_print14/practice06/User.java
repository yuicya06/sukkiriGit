package sukkiri.practice.practice_print14.practice06;

//●Userクラス
//・フィールド　※アクセス修飾子はすべてprivate
//型	変数名・定数名
//int	userCount    ※static, 初期値は0
//int	id
//String	username
//・コンストラクタ
//　　：usernameの引数を1つ受け取り、フィールドにセットする。
//フィールド変数idに関しては、staticなフィールド変数userCountをインクリメントした後、代入する。
//・メソッド
//　　getUserCountメソッド
//　　　：引数はなく、staticなフィールドを返すstaticメソッド。
//　　displayUserInfoメソッド
//　　　：出力結果例のように、非staticフィールドを表示する。


public class User {
	
	/*fields*/
	private static int userCount = 0;
	private int id;
	private String username;
	
	/*constructor*/
	public User(String username) {
		setUsername(username);
		setId(userCount+=1);
	}

	/*methods*/
	
	//static
	public static int getUserCount() {
		return userCount;
	}
	
	
	public void displayUserInfo() {
		System.out.println("User ID:" + getId());
		System.out.println("Username:" + getUsername());
	}
	

	/*getter/setter*/
	public static void setUserCount(int userCount) {
		User.userCount = userCount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	

}
