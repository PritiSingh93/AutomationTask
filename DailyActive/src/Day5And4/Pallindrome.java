package Day5And4;

public class Pallindrome {
	public static void main(String[] args) {
		int r,c=0,temp;
		int n=13431;
		temp=n;
		while(n>0) {
			r=n%10;
			c=(c*10)+r;
			n=n/10;
		}
		if(temp==c) {
			System.out.println("Its a Palindrome Number");
		}
		else
			System.out.println("Nots a Palindrome Number");
	}

}
