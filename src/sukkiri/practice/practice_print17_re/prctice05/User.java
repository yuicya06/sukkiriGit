package sukkiri.practice.practice_print17_re.prctice05;

public class User {

	private int id;
	private String name;

	public User(int id, String name) {

		if (id < 0) {
			throw new IllegalArgumentException("idが負");

		}

		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("nameがnull or 空");
		}
		
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return this.id + this.name;
	}

}
