import java.util.Arrays;

public class FindAndReplace {

	static String[] usernames = { "Yana", "Nihat", "Nadira", "Irina", "Jeremy", "Aviva", "Yohana", "Ramba", "Kubra",
			"Dilshad", "Priyanka", "Nazgul" };

	/*static void FindAndReplace(String username, String newValue) {
		System.out.println("You've sent " + username);
		for (int i = 0; i < usernames.length; i++) {
		//	System.out.println(usernames[i]);
			if (usernames[i] == username) {
				// success
			//	System.out.println(usernames[i]);
				usernames[i] = newValue;
			}
		}
	}*/
	
	static void FindAndReplace(String oldUsername, String newUsername) {
		// array index number of username
		int getIndexOfUsername = Arrays.asList(usernames).indexOf(oldUsername);
		System.out.println(getIndexOfUsername);
		
		// update username
		usernames[getIndexOfUsername] = newUsername;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*FindAndReplace("Nadira","Jack");
		System.out.println(usernames[2]);
		*/
		
		FindAndReplace("Irina", "Mike");
		for(int i=0; i<usernames.length;i++) {
			System.out.println(usernames[i]);
		}

	}

}
