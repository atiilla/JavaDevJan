import java.util.Scanner;



public class App {
	// static int sum = 0;
	static int[] nums = { 66, 88 };
	static String[] usernames = { "Yana", "Nihat", "Nadira", "Irina", "Jeremy", "Aviva", "Yohana", "Ramba", "Kubra",
			"Dilshad", "Priyanka", "Nazgul" };
	
	
	
	
	static void FindUsername(String username) {
		
		for(String x:usernames) {
			//System.out.println(x); // debug testing
		//	System.out.println(x.equals(username));
			if(x.equals(username)) {
				System.out.println("Hello " + x);
			}
			
			
			boolean result =  x.equals(username);
			if(result) {
				System.out.println("exists");
			}else {
				System.out.println("not exists");
			}
			
		}
		
	}
	
	/// method
	/*
	 * static void HelloWorld() { System.out.println("Hello Method!"); }
	 * 
	 * static void addNumber(int newNumber) { sum += newNumber; // 10 // sum = 0 +
	 * 10 = 10 System.out.println("sum value "+ sum); }
	 * 
	 * static void getSumOfTwoNumber(int n1, int n2) { int getResult = n1+n2;
	 * System.out.println("Sum result=> " + getResult); }
	 */

	static void ChangeArrayValue(int posIndex, int newValue) {
		// nums[1] = 44
		// System.out.println(posIndex); // 1
		// System.out.println(newValue); // 0
		nums[posIndex] = newValue;

	}

	/// method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 	ChangeArrayValue(1, 77); // update array item value
		System.out.println(nums[1]); // print updated array item value
		User user1 = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a username! ");
		String TakeUserFromConsole = scanner.next();
		user1.setUsername(TakeUserFromConsole);
		System.out.println(user1.toString());
	 */
		
		FindUsername("Yohana");
		
		FindAndReplace();
		
	}
	// method

	static void Message() {
		System.out.println("Hello friend!");
	}

	// method
}
