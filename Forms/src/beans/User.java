package beans;

public class User {

	private String email="";
	private String password="";

	private String message = "Error Validating Information.";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User() {

	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validate() {
		if (email == null) {
			message = "No email Address set";
		} else if (email.matches("\\w+@\\w+\\.\\w+ ")) {
			message = "Invalid Email-Address";
			return false;
		}
		
		if (password == null) {
			message = "No Password set";
		}
		if (password.length() < 8) {
			message = "Password Must be atleast 8 Characters.";
			return false;
		} else if (password.matches("\\w*\\s+\\w*")) {
			message = "Password Cannot Contain space.";
			return false;
		}

		return true;
	}
}
