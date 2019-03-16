package Day2;

public class Poly2 extends OverRi {
	void run() {
		System.out.println("Run");
	}
	public static void main(String[] args) {
		Poly2 p2=new Poly2();
		p2.run();
	}
}
class OverRi{
	void run() {
		System.out.println("Running");
	}
}