package day1;

public class Palindrome {
	public static void main(String[] args) {
		int r,c=0,temp;
		int n = 431;
		temp=n;
		while(n>0) {
			r=n%10;
			c=(c*10)+r;
			n=n/10;
		}
		if(temp==c) {
			System.out.println(temp +" is a Palindrome Number");
		}
		else{
			System.out.println( temp + " is not a Palindrome Number ");
		}  
	}
}
