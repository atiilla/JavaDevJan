
public class User {
	
	protected String username;
	final int token = 3434;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
	
	

}
