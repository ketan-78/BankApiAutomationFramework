package api.test.account;

import org.testng.annotations.Test;

import api.base.AccountService;
import api.base.UtilityService;
import api.models.request.ModifyAccountRequest;
import api.models.response.ModifyAccountResponse;
import io.restassured.response.Response;

public class ModifyAccountAPItest {

	@Test
	public void modifyAccount() {
		String token=UtilityService.getToken();
		
		AccountService accountService=new AccountService();
		ModifyAccountRequest modifyAccountRequest=new ModifyAccountRequest("Saving", "Dwarka");
		Response response=accountService.modifyAccount(modifyAccountRequest, token);
//		ModifyAccountResponse modifyAccountResponse=response.as(ModifyAccountResponse.class);
		System.out.println(response.asPrettyString());
		//System.out.println(modifyAccountResponse.getOwnerName());
	}
}
