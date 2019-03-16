package Day5And4;

public class Fibonasies {
	public static void main(String[] args) {
		int x=0,y=1,temp;
		System.out.println(x);
		System.out.println(y);
		for(int a=0;a<=10;a++) {
			temp=x+y;
			x=y;
			y=temp;
			System.out.println(temp);
			
		}
	}

}
