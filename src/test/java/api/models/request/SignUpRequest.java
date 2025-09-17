package api.models.request;

public class SignUpRequest {
	
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	private SignUpRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	// A Builder inner class is a static helper class inside the main class that constructs complex 
	// objects in a step-by-step, readable way.
	// If a class has many fields (especially optional ones), constructors become messy.
	public static class Builder	{ // inner class, to implement builder design pattern
		
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		
		public Builder username(String username) {
			this.username=username;
			return this; // return the current object and object is of builder type (for chaining).
		}
		public Builder password(String password) {
			this.password=password;
			return this;
		}
		public Builder email(String email) {
			this.email=email;
			return this;
		}
		public Builder firstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		public Builder lastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;
			return this;
		}
		
		public SignUpRequest build() {
			SignUpRequest signUpRequest=new SignUpRequest(username, password, email, firstName, lastName, mobileNumber);
			return signUpRequest;
		}
	}
}
