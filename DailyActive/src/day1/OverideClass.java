package day1;

class OverideClass1 {
	void run() {
		System.out.println("Run");
	}
}

public class OverideClass extends OverideClass1 {
	void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		OverideClass r = new OverideClass();
		r.run();
	}
}
