package API;

public class api {

	public static void main(String[] args) {
		
//  Status codes		
//	   Success errors-200(ok),201(created),202(Accepted),204(No content)		
//	   Client errors-400(Bad rqst), 401(Unauthorized),403(Forbidden),404(Not Found),408(Rqst timeout)
//	   Server errors-500(Internal Server Error), 502(Bad Gateway), 503(Service unavailable), 504(Gateway Timeout)
		
//	Basic validation
//		given()
//		.when()
//		.get("https://demo/users/1");
//		.then()
//		.statusCode(200)
//		.log().all();

//	Delete
//		RestAssured.baseURI = "https://demo";
//		RestAssured.basePath = "/users/1";
//		given()
//		.when()
//		.delete()
//		.then()
//		.statusCode(204)
//		.statusLine("HTTP/1.1 204 No content")
//		.log().all()
//		.extract().response();
//		String jsonString = response.asString();
//		Assert.assertEquals(jsonString.contains("Successfully deleted user"),true);

//	GET Single
//		given()
//		.content("application/json")
//		.when()
//		.get("https://demo/users")
//		.then()
//		.statusCode(200)
//		.statusLine("HTTP/1.1 200 OK")
//		.body("data.id", equalTo(2))
//		.log().all();

//	GET mulitple
//		given()
//		.content("application/json")
//		.when()
//		.get("https://demo/users?page=2")
//		.then()
//		.statusCode(200)
//		.statusLine("HTTP/1.1 200 OK")
//		.body("data.id", hasItems(2,3,4))
//		.log().all();

//	POST
//		public static HashMap map = new HashMap();
//		String userName = RestAssuredUtils.getUserName();
//		String userJob = RestAssuredUtils.getUserJob();
//
//		public void postUserData(){
//		map.put("name", userName);
//		map.put("job", userJob);
//
//		RestAssured.baseURI = "https://demo";
//		RestAssured.basePath = "/users";
//		}
//
//		public void postNewUser(){
//		given()
//		.contentType("application/json")
//		.body(map)
//		.when()
//		.post()
//		.then()
//		.statusCode(201)
//		.body("name", equalTo(userName))
//		.body("job", equalTo(userJob));
//		.log.all();
//		}

//	PUT
//		public static HashMap map = new HashMap();
//
//		String userName = RestAssured.getUserName();
//		String userJob = RestAssured.getUserJob();
//		int userId = 2;
//
//		public void userData(){
//		map.put("name", userName);
//		map.put("job", userJob);
//
//		RestAssured.baseURI = "https://demo";
//		RestAssured.basePath = "/users/"+userId;
//		given()
//		.contentType("application/json")
//		.when()
//		.get()
//		.then()
//		.statusCode(200)
//		.log().all();	
//		}

//		public void putUserData(){
//		given()
//		.contentType("application/json")
//		.body(map)
//		.when()
//		.put()
//		.then()
//		.statusCode(200)
//		.log().all();	


	}

}
