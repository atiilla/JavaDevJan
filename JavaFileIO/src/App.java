import java.io.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filePath = scan.next();
		
		File filename = new File(filePath);

		System.out.println(filename.exists());
		if (!filename.exists()) {
			System.out.println("File not found, created a new file!");
			try {
				filename.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("The file is exists!");
			while (true) {
				String val = scan.nextLine();
				try {
					FileWriter frw = new FileWriter(filename, false);
					BufferedWriter bWriter = new BufferedWriter(frw);
					bWriter.write("You've wrote: ");
					bWriter.write(val);
					bWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
