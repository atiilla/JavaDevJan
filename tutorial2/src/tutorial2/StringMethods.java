package tutorial2;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// String vs StringBuilder
	/*
	 String companyname = "Intec";
	companyname += "Brussel"; // companyname = companyname + "Brussel"
	System.out.println(companyname);
	
	StringBuilder str = new StringBuilder("");
	str.append("Intec");
	str.append("Brussel");
	System.out.println(str);
	 */
	
	
	// string methods
	
	// length
	String username = "root";
	System.out.println("Length of username is " + username.length());
	
	// trim method
	
	String companyName = "                    intecbrussel                                    ";
	System.out.println(companyName);
	System.out.println(companyName.trim());
	
	// toUpperCase
	System.out.println(companyName.toUpperCase().trim());
	
	// replace method
	String long_text = "Lorem Ipsum is simply dummy text of the printing and dummy typesetting industry.";
	System.out.println(companyName.replace("intec","xxxx"));
	
	//System.out.println(long_text.replaceAll("dummy", "xxxx"));
	
	// match
	//System.out.println(long_text.matches("[a-zA-Z0-9]{6}","Lorem"));

	System.out.println(long_text.length());
	// substring
	
	System.out.println(long_text.substring(10,long_text.length() - 20));
	
	// concat() 
	String n1 = "Intec";
	System.out.println(n1.concat("Brussel"));
	
	System.out.println("123".concat("456"));
	
	System.out.println("Index Of Result" + long_text.indexOf("Ipsum"));
	
	}

}
