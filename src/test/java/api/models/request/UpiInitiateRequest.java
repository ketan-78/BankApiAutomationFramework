package api.models.request;

public class UpiInitiateRequest {

	private String fromUpi;
	private String toUpi;
	private int amount;
	private String note;

	// Parameterized constructor
	public UpiInitiateRequest(String fromUpi, String toUpi, int amount, String note) {
		this.fromUpi = fromUpi;
		this.toUpi = toUpi;
		this.amount = amount;
		this.note = note;
	}

	// Getters and setters
	public String getFromUpi() {
		return fromUpi;
	}
	public void setFromUpi(String fromUpi) {
		this.fromUpi = fromUpi;
	}
	public String getToUpi() {
		return toUpi;
	}
	public void setToUpi(String toUpi) {
		this.toUpi = toUpi;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	// Overridden toString() method
	@Override
	public String toString() {
		return "UpiTransfer [fromUpi=" + fromUpi + 
				", toUpi=" + toUpi + 
				", amount=" + amount + 
				", note=" + note + "]";
	}
	
}
