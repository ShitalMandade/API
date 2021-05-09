package restassuredpractices;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SamplePut {
	
		@Test
		 public void samplePut() {
			JSONObject jobj=new JSONObject();
			jobj.put("salary", "4.2L");
			jobj.put("name", "ShitalMandade");
			jobj.put("address", "Wardha");
			

	RestAssured.given().body(jobj.toString()).contentType(ContentType.JSON).when().put("http://localhost:3000/posts/3").then().log().all();
			
			
		}

}
