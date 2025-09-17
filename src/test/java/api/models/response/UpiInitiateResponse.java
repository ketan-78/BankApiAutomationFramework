package api.models.response;

public class UpiInitiateResponse {

	private String transactionRef;
	private String status;
	private String message;

	// Default constructor
	public UpiInitiateResponse() {}

	// Parameterized constructor
	public UpiInitiateResponse(String transactionRef, String status, String message) {
		this.transactionRef = transactionRef;
		this.status = status;
		this.message = message;
	}

	// Getters and setters
	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// toString() method
	@Override
	public String toString() {
		return "PaymentResponse [transactionRef=" + transactionRef +
				", status=" + status +
				", message=" + message + "]";
	}

}
