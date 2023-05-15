
interface Animal {
	void eat();
	void run();
	void talk();
}

class Person implements Animal {

	@Override
	public void eat() {
		System.out.println("사람이 먹는다.");
	}

	@Override
	public void run() {
		System.out.println("사람이 달린다.");

	}

	@Override
	public void talk() {
		System.out.println("사람이 말한다.");

	}
}

class Elephant implements Animal {

	@Override
	public void eat() {
		System.out.println("코끼리가 먹는다.");

	}

	@Override
	public void run() {
		System.out.println("코끼리가 달린다.");

	}

	@Override
	public void talk() {
		System.out.println("코끼리가 말한다.");

	}
}

public class Main {
	public static void main(String[] args) {
		test(new Elephant());
	}

	static void test(Animal animal) {
		animal.eat();
		animal.run();
		animal.talk();
	}
}