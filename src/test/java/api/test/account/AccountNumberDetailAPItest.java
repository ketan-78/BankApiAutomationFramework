package api.test.account;

import org.testng.annotations.Test;

import api.base.AccountService;
import api.base.UtilityService;
import api.models.response.AccountNumberDetailResponse;
import io.restassured.response.Response;

public class AccountNumberDetailAPItest {
	
	@Test
	public void accountDetail() { 
		
		String token=UtilityService.getToken();
		
		AccountService accountService=new AccountService();
		Response response=accountService.AccountNumberDetail("7499053499", token);
		AccountNumberDetailResponse accountDetailResponse= response.as(AccountNumberDetailResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(accountDetailResponse.getBranch());
	}
}
