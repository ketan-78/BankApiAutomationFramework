package api.test.upi;

import org.testng.annotations.Test;

import api.base.UpiService;
import api.base.UtilityService;
import api.models.response.UpiStatusResponse;
//import api.models.response.UpiStatusResponse;
import io.restassured.response.Response;

public class UpiStatusAPItest {

	@Test
	public void upiStatus() {
		System.out.println("**********************LogIn**********************");
		String token=UtilityService.getToken();
		System.out.println("**********************Upi Initiation**********************");
		String ref=UtilityService.getTransactionReference(token);
		System.out.println("**********************Upi Status**********************");
		UpiService upiService=new UpiService();
		Response response=upiService.status(token,ref);
		UpiStatusResponse upiStatusResponse=response.as(UpiStatusResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(upiStatusResponse.getStatus());
	}
}
