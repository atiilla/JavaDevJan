package tutorial2;
import java.util.Scanner;
public class kubra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // scanner object
		
		System.out.println("Hello!");
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your city: ");
		String city = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.printf("My name is %s I live in %s. I am %d%n years old.", name,city,age);
		scanner.close();
	}

}
