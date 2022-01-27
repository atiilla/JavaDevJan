import java.util.Arrays;

public class tutorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break;
		for (int i = 0; i < 10; i++) {
			// System.out.println(i);
			if (i == 6) {
				break;
			}
		}

		// continue
		for (int i = 0; i < 10; i++) {
			// System.out.println(i);
			if (i == 6) {
				continue;
			}
			// System.out.println(i + "result");
		}

		// Arrays int/char/str/byte
		String[] names = { "Jeremy", "Dilshad", "Irina" };
		// System.out.println(names[0]);
		// System.out.println(names.toString());
		for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]);
		}

		int[] numbers = { 9, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		// numbers[0] = 999;

		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				// odd numbers

				// before update
			//	System.out.println("before " + numbers[i]);

				// update odd number values with 999 here
				numbers[i] = 999;

			//	System.out.println("after " + numbers[i]);

			}
		}

		int[][] multiArray = { { 1, 2, 3 }, { 4, 5, 6 } };

		// System.out.println(multiArray[0][1]);
		// System.out.println(multiArray[1][0]);

		for (int x = 0; x < multiArray.length; x++) {
			// System.out.println(x);
			// System.out.println(multiArray[x].length);
			for (int y = 0; y < multiArray[x].length; y++) {
			//	System.out.println("SubArray Index Number " + x);
			//	System.out.println("SubArray item Index Number " + y);
			//	System.out.println(multiArray[x][y]);
			}

		}

		String[][] usernames = { { "root", "admin" }, { "guest", "user" } };

		for (int x = 0; x < usernames.length; x++) {
			// System.out.println(x);

			for (int y = 0; y < usernames[x].length; y++) {
			//	System.out.println(x + " : " + y);
				//System.out.println(usernames[x][y]);
			}
		}

		int[] fizzgame = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] game = { 11, 33, 33, 65, 88, 66, 44, 99, 11,88 };

		String[] xyz = { "root", "root", "admin", "user", "guest", "user" };

		for (int x = 0; x < game.length-1; x++) {
		//	System.out.println("first loop" + game[x]);
			for(int y=0;y<game.length;y++) {
			//	System.out.println("second loop" + game[y]);
				if(game[x] == game[y]) { // 
					System.out.println(game[y] + "duplication found!!!!");
				}
			}
		}

		/*
		 * if odd number fizz even buzz
		 * 
		 */
	}

}
