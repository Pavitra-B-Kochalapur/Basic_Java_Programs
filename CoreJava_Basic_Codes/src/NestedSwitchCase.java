import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int empID = in.nextInt();
		String department = in.next();
		
		switch (empID) {
		case 1:
		System.out.println("Pavitra Kochalapur");
		break;
		case 2:
		System.out.println("Devu duvedi");
		break;
		case 3: 
		System.out.println("EMP ID : 3 ");
		switch (department) {
		case "IT":
		System.out.println("IT Department");
		break;
		case "Management":
		System.out.println("Management Department");
		break;
		default:
		System.out.println("invalid department");
		}
		break;
		default:
		System.out.println("invalid emp id entered");
		
		}

	}

}
