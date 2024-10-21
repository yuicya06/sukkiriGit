package file_operation.sample06;

public class Animal {
	
	String name;
	String kind;
	String age;
	
	public Animal(String name, String kind, String age) {
		
		setName(name);
		setKind(kind);
		setAge(age);
		
	}
	
	
	public void show() {
		System.out.println("-------------------");
		System.out.println("名前： " + getName());
		System.out.println("種類： " + getKind());
		System.out.println("年齢： " + getAge());
		System.out.println("-------------------");
	}
	
	
	
	

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
	
	

}
