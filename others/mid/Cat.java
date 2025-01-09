package mid;

public class Cat {

	public String name;

	public void parseName() {
		System.out.print("1");
		try {
			System.out.print("2");
			int x = Integer.parseInt(name);
			System.out.print("3");
		} catch (NullPointerException e) {
			System.out.print("5");
		}
		System.out.println("5");
	}

	public static void main(String args[]) {

		Cat felix = new Cat();
		felix.name = "Felix";
		felix.parseName();
		System.out.print("6");
	}
}
