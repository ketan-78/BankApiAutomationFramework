package api.models.response;

public class UpiQrCodeResponse {
	
	 private int expiresIn;
	    private int amount;
	    private String qrCodeData;
	    private String qrCodeRef;
	    private String upiUrl;
	    private String merchantVpa;

	    // Default constructor
	    public UpiQrCodeResponse() {}

	    // Parameterized constructor
	    public UpiQrCodeResponse(int expiresIn, int amount, String qrCodeData, String qrCodeRef, String upiUrl, String merchantVpa) {
	        this.expiresIn = expiresIn;
	        this.amount = amount;
	        this.qrCodeData = qrCodeData;
	        this.qrCodeRef = qrCodeRef;
	        this.upiUrl = upiUrl;
	        this.merchantVpa = merchantVpa;
	    }

	    // Getters and setters
	    public int getExpiresIn() {
	        return expiresIn;
	    }

	    public void setExpiresIn(int expiresIn) {
	        this.expiresIn = expiresIn;
	    }

	    public int getAmount() {
	        return amount;
	    }

	    public void setAmount(int amount) {
	        this.amount = amount;
	    }

	    public String getQrCodeData() {
	        return qrCodeData;
	    }

	    public void setQrCodeData(String qrCodeData) {
	        this.qrCodeData = qrCodeData;
	    }

	    public String getQrCodeRef() {
	        return qrCodeRef;
	    }

	    public void setQrCodeRef(String qrCodeRef) {
	        this.qrCodeRef = qrCodeRef;
	    }

	    public String getUpiUrl() {
	        return upiUrl;
	    }

	    public void setUpiUrl(String upiUrl) {
	        this.upiUrl = upiUrl;
	    }

	    public String getMerchantVpa() {
	        return merchantVpa;
	    }

	    public void setMerchantVpa(String merchantVpa) {
	        this.merchantVpa = merchantVpa;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "QrPaymentData [expiresIn=" + expiresIn +
	               ", amount=" + amount +
	               ", qrCodeData=" + qrCodeData +
	               ", qrCodeRef=" + qrCodeRef +
	               ", upiUrl=" + upiUrl +
	               ", merchantVpa=" + merchantVpa + "]";
	    }

}
