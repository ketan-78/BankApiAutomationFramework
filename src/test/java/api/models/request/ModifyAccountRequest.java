package api.models.request;

public class ModifyAccountRequest {
	
	private String accountType;
    private String branch;

    // Parameterized constructor
    public ModifyAccountRequest(String accountType, String branch) {
        this.accountType = accountType;
        this.branch = branch;
    }

    // Getters and Setters
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    // toString method
    @Override
    public String toString() {
        return "AccountInfo [accountType=" + accountType +
               ", branch=" + branch + "]";
    }

}
