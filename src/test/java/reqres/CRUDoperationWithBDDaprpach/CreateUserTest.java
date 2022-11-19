package reqres.CRUDoperationWithBDDaprpach;

import  static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUserTest {

	@Test
	public void createuserTest()
	{
		//these are the 3 ways to create object
		//step1:create prerequisite
//		JSONObject obj=new JSONObject();
//		obj.put("name","morpheus");
//		obj.put("job", "leader");
	
		HashMap obj=new HashMap();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
//		File obj=new File("./src/test/resources/Data.json");
		
		given()
		  .body(obj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("https://reqres.in/api/users")
		.then()
		  .assertThat().statusCode(201)
		  .log().all();
		
		
	}
}
