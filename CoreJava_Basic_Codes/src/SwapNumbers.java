import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " "+b);
		//swap(a,b);

	}
	
	//This method not swap the numbers 
	//bcz of pass by value the numbers are not swapped at original
	static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		//this will valid in this function scope only
		System.out.println(a + " "+b);
		
	}

}
