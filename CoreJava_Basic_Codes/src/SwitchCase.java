import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//String fruit = in.next();
		/*
		switch(fruit) {
		case "mango" : 
			System.out.println("king of the fruit");
			break;
		case "apple" : 
			System.out.println("a sweet red fruit");
			break;
		case "grapes" :
			System.out.println("bunch of small fruits");
			break;
			
		default:
				System.out.println("invalid fruit entered");
		
		}
		*/
		
		//Enhanced SwitchaCse
		int days = in.nextInt();
		switch (days) {
		case 1,2,3,4,5 -> System.out.println("week days");
		case 6,7 -> System.out.println("week offs");
		
		default ->
		System.out.println("invalid day");
		}
		
	}

}
