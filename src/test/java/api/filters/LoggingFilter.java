package api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter{ //filters are set up in the base service

	private static final Logger logger=LogManager.getLogger(LoggingFilter.class);
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec); // to intercept the request to get get required data from request.
		Response response=ctx.next(requestSpec, responseSpec); // to continue the request after the intercept.
		logResponse(response);// to intercept the response
		return response; // test for assertion.
	}

	public void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI : "+requestSpec.getBaseUri());
		logger.info("Request Header : "+requestSpec.getHeaders());
		logger.info("Request Payload : "+requestSpec.getBody());	
	}
	public void logResponse(Response response) {
		logger.info("Response Header : "+response.headers());
		logger.info("Response Status code : "+response.getStatusCode());
		logger.info("Response Payload : "+response.getBody().prettyPrint());	
	}
}
