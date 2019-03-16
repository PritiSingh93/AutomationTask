package Day2;

public class Poly1 {
	public static void main(String[] args) {
		System.out.println(OverLo.add(13, 67));
		System.out.println(OverLo.add(23, 56, 89));
	}
	
}

class OverLo{
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}

