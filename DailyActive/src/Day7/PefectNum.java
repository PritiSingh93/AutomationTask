package Day7;

import java.util.Scanner;

public class PefectNum {
	public static void main(String[] args) {
		int i,number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		number = sc.nextInt();
		
		for(i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(sum==number) {
			System.out.println("Perfect  number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
	}

}
