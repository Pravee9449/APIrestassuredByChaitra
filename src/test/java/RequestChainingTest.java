import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

import static io.restassured.RestAssured.*;

public class RequestChainingTest {
	
	@Test
	public void requestChainingTest()
	{
		//step1: create a prerequisites
		baseURI= "https://reqres.in";
		//step2:send the request
		Response resp = when()
		.get("/api/users");
		//step3:capture the response using json path
		
		 int id = resp.jsonPath().get("data[1].id");
		 System.out.println(id);
		
		
		//step4:provide the response variable to another request
		 
		 when()
		 .delete("/api/users"+id)
		 .then()
		 .assertThat().statusCode(204)
		 .log().all();
		 
	}

}
