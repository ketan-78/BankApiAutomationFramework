package api.test.upi;

import org.testng.annotations.Test;

import api.base.UpiService;
import api.base.UtilityService;
import api.models.request.UpiInitiateRequest;
import api.models.response.UpiInitiateResponse;
import io.restassured.response.Response;

public class UpiInitiateAPItest {

	@Test
	public void paymentInitiate() {
		String token=UtilityService.getToken();
		
		UpiService upiService=new UpiService();
		UpiInitiateRequest upireInitiateRequest=new UpiInitiateRequest("fromUPI@abc", "toUPI@acb", 10000
				, "Payment");
		Response response=upiService.initiate(token, upireInitiateRequest);
		UpiInitiateResponse upiInitiateResponse=response.as(UpiInitiateResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(upiInitiateResponse.getStatus());
		System.out.println(upiInitiateResponse.getMessage());
	}
}
