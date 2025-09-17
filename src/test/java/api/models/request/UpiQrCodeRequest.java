package api.models.request;

public class UpiQrCodeRequest {

	private String merchantVpa;
    private String merchantName;
    private int amount;
    private String transactionNote;

    // Parameterized constructor
    public UpiQrCodeRequest(String merchantVpa, String merchantName, int amount, String transactionNote) {
        this.merchantVpa = merchantVpa;
        this.merchantName = merchantName;
        this.amount = amount;
        this.transactionNote = transactionNote;
    }

    // Getters and Setters
    public String getMerchantVpa() {
        return merchantVpa;
    }

    public void setMerchantVpa(String merchantVpa) {
        this.merchantVpa = merchantVpa;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransactionNote() {
        return transactionNote;
    }

    public void setTransactionNote(String transactionNote) {
        this.transactionNote = transactionNote;
    }

    // toString() method
    @Override
    public String toString() {
        return "MerchantTransaction [merchantVpa=" + merchantVpa +
                ", merchantName=" + merchantName +
                ", amount=" + amount +
                ", transactionNote=" + transactionNote + "]";
    }
	
}
