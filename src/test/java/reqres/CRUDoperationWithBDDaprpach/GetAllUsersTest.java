package reqres.CRUDoperationWithBDDaprpach;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetAllUsersTest {
	
	@Test
	public void getAllUsers()
	{
		baseURI="https://reqres.in";
		
		when()
		
		.get("/api/users")
		.then()
		.log().all();
	}

}
