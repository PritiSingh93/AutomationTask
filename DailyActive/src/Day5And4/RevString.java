package Day5And4;

public class RevString {
	public static void main(String[] args) {
		String str="I will succeed in my life";
		String[] rev=str.split(" ");
		for(int a=rev.length-1;a>=0;a--) {
			System.out.print(rev[a]+" ");
		}
	}

}
