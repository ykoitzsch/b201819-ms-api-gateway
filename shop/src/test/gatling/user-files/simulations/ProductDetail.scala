
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ProductDetail extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:9000")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png""", """http://localhost:9000/api/account"""), WhiteList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7")
		.authorizationHeader("Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU0OTgwMDY0M30.yivU5hyL2VABo8DP_obW9XPAP7ahPqV5cOi3CQYmhes5nNGjgq3OX1zyc3ki5grgZ3ZhbYPIEitrKEguqQqBLg")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")





	val scn = scenario("ProductDetail")
		.exec(http("productDetail")
			.get("/inventory/api/products/13")
			.resources(http("ratingForProduct")
			.get("/ratings/api/ratings?productId=13")))
		.pause(7)
		.exec(http("listAllProducts")
			.get("/inventory/api/products")
			.resources(http("productDetail")
			.get("/inventory/api/products/14"),
            http("ratingForProduct")
			.get("/ratings/api/ratings?productId=14")))
		.pause(3)
		.exec(http("listAllProducts")
			.get("/inventory/api/products"))
		.pause(1)
		.exec(http("productDetail")
			.get("/inventory/api/products/15")
			.resources(http("ratingForProduct")
			.get("/ratings/api/ratings?productId=15")))
		.pause(6)
		.exec(http("listAllProducts")
			.get("/inventory/api/products"))
		.pause(1)
		.exec(http("productDetail")
			.get("/inventory/api/products/14")
			.resources(http("ratingForProduct")
			.get("/ratings/api/ratings?productId=14")))
		.pause(1)
		.exec(http("listAllProducts")
			.get("/inventory/api/products"))

	setUp(scn.inject(atOnceUsers(400))).protocols(httpProtocol)
}