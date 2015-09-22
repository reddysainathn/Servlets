package com.action;

import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;

	private HashMap<String, String> userDetails = new HashMap<String, String>();

	public LoginAction() {

		userDetails.put("hary@mail.com", "hary123");
		userDetails.put("raj@mail.com", "raj123");
		userDetails.put("kumar@mail.com", "kumar123");

	}

	// Writing Validation Code-There is a support in Struct2 Framework
	/*@Override
	public void validate() {

		System.out.println("****LoginAction:Validate()******");

		if (userDetails.containsKey(username)) {
			if (userDetails.get(username).equals(password)) {

				System.out.println("Password is Correct");
			} else {
				addFieldError("password", "      Password Incorrect");
			}
		} else {
			addFieldError("username", "Invalid Username");
		}

	}
*/
	@Override
	public String execute() throws Exception {

		System.out.println("LoginAction:Execute()");
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);

		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
