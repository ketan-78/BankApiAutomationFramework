package api.models.response;

public class UpiStatusResponse {
	
	private String status;
    private String toUpi;
    private String fromUpi;
    private String transactionRef;
    private int amount;
    private String timestamp;

    // Default constructor
    public UpiStatusResponse() {}

    // Parameterized constructor
    public UpiStatusResponse(String status, String toUpi, String fromUpi,
                                  String transactionRef, int amount, String timestamp) {
        this.status = status;
        this.toUpi = toUpi;
        this.fromUpi = fromUpi;
        this.transactionRef = transactionRef;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getToUpi() {
        return toUpi;
    }
    public void setToUpi(String toUpi) {
        this.toUpi = toUpi;
    }

    public String getFromUpi() {
        return fromUpi;
    }
    public void setFromUpi(String fromUpi) {
        this.fromUpi = fromUpi;
    }

    public String getTransactionRef() {
        return transactionRef;
    }
    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    // toString() method
    @Override
    public String toString() {
        return "UpiTransactionResponse [status=" + status +
               ", toUpi=" + toUpi +
               ", fromUpi=" + fromUpi +
               ", transactionRef=" + transactionRef +
               ", amount=" + amount +
               ", timestamp=" + timestamp + "]";
    }

}
