package sukkiri.object_oriented.polymorphism.sample01;

class Dog implements Animal {
	final String kind = "犬";

	@Override
	public void cry() {
		System.out.println("わんわん");
	}

	@Override
	public String getKind() {
		return this.kind;
	}
}