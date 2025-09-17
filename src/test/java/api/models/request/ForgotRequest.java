package api.models.request;

public class ForgotRequest {

	private String email;

	public ForgotRequest(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "ForgotRequest [email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
