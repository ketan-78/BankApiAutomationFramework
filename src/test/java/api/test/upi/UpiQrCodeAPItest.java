package api.test.upi;

import org.testng.annotations.Test;

import api.base.UpiService;
import api.base.UtilityService;
import api.models.request.UpiQrCodeRequest;
import api.models.response.UpiQrCodeResponse;
import io.restassured.response.Response;

public class UpiQrCodeAPItest {
	
	@Test
	public void qrCode() {
		
		String token=UtilityService.getToken();
		
		UpiQrCodeRequest qrCodeRequest=new UpiQrCodeRequest("Zudio@abc", "Zudio", 1000, "Payment");
		UpiService upiService=new UpiService();
		Response response=upiService.qrCode(token, qrCodeRequest);
		UpiQrCodeResponse qrCodeResponse=response.as(UpiQrCodeResponse.class);
		//System.out.println(response.asPrettyString());
		System.out.println(qrCodeResponse.getUpiUrl());
	}

}
