
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Yohana {
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the Name you want ");
		String name = myObj.next();
		String[] UserName = new String[] { "Yohana", "Jeremy", "Kumari", "Atilla" };
		List<String> list = Arrays.asList(UserName);
		if (list.contains(name)) {
			System.out.println("Find " + name);
		}
	}


}