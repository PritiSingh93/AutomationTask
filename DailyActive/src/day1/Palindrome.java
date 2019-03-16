package day1;

public class Palindrome {
	public static void main(String[] args) {
		int x=0, y=1, fact;
		System.out.println(x);
		System.out.println(y);
		for(int a=0;a<=10;a++) {
			fact=x+y;
			x=y;
			y=fact;
			System.out.println(fact);
		}
	}
}
