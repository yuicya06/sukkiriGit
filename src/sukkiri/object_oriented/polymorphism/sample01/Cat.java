/**
 * 
 */
package sukkiri.object_oriented.polymorphism.sample01;

/**
 * 
 */
class Cat implements Animal {
	final String kind = "猫";

	@Override
	public void cry() {
		System.out.println("にゃーにゃー");
	}

	@Override
	public String getKind() {
		return this.kind;
	}
}