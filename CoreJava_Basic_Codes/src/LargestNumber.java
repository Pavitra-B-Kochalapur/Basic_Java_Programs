import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Enter Numbers : ");
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		//Logic-1
	/*	int max = a;
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		System.out.println(max);
		*/
		//Logic-2
		/* int max = 0;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		System.out.println(max);	
		*/
		
		//Logic-3
		int max = Math.max(c, Math.max(a, b));
		System.out.println(max);
	}
}
