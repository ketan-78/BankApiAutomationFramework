package api.models.response;

public class KycStatusResponse {
	
	private String overallStatus;
    private Object documentStatus;  // Using Map for empty/dynamic object
    private int totalDocuments;
    private int pendingDocuments;

    public KycStatusResponse() {
		// TODO Auto-generated constructor stub
	}
    
    // Parameterized constructor
    public KycStatusResponse(String overallStatus, Object documentStatus, int totalDocuments, 
    		int pendingDocuments) {
        this.overallStatus = overallStatus;
        this.documentStatus = documentStatus;
        this.totalDocuments = totalDocuments;
        this.pendingDocuments = pendingDocuments;
    }

    // Getters and Setters
    
    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public Object getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(Object documentStatus) {
        this.documentStatus = documentStatus;
    }

    public int getTotalDocuments() {
        return totalDocuments;
    }

    public void setTotalDocuments(int totalDocuments) {
        this.totalDocuments = totalDocuments;
    }

    public int getPendingDocuments() {
        return pendingDocuments;
    }

    public void setPendingDocuments(int pendingDocuments) {
        this.pendingDocuments = pendingDocuments;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "DocumentStatusInfo [overallStatus=" + overallStatus +
                ", documentStatus=" + documentStatus +
                ", totalDocuments=" + totalDocuments +
                ", pendingDocuments=" + pendingDocuments + "]";
    }

}
