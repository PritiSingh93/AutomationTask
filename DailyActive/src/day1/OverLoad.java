package day1;

class OverLoad1 {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class OverLoad {
	public static void main(String[] args) {
		System.out.println(OverLoad1.add(12, 100));
		System.out.println(OverLoad1.add(23, 45, 56));
		System.out.println(OverLoad1.add(12, 10, 93))

	}
}
