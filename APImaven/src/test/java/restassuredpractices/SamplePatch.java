package restassuredpractices;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SamplePatch {
	@Test
	 public void samplePatch() {
		JSONObject jobj=new JSONObject();
		jobj.put("salary", "45000");
		

RestAssured.given().body(jobj.toString()).contentType(ContentType.JSON).when().patch("http://localhost:3000/posts/3").then().log().all();
		
		
	}

}
