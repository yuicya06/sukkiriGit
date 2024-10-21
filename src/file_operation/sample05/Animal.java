package file_operation.sample05;

public class Animal {

	String name;
	String kind;
	int age;

	public Animal(String name, String kind, int age) {

		setName(name);
		setKind(kind);
		setAge(age);

	}

	/*method*/
	public void show() {

		//		名前：太郎
		//		種類：犬
		//		年齢：5
		System.out.println("==================");
		System.out.println("名前 : " + getName());
		System.out.println("名前 : " + getKind());
		System.out.println("名前 : " + getAge());
		System.out.println("==================");

	}

	/*getter/setter*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
