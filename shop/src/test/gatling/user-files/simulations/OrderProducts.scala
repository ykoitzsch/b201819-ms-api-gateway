
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class OrderProducts extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:9000")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png""", """.*/api/account""", """.*ratings*"""), WhiteList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7")
		.authorizationHeader("Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU0OTk5MDExM30.7BofIYY_ie82OIFu2_vXmHvehrRC6nHLy0l008Sc_B41tv-z6IGUY316cgWV_0uI_-fusicDADaqCxz0hzAMbA")
		.contentTypeHeader("application/json")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

	val headers_0 = Map("Origin" -> "http://localhost:9000")

    val uri1 = "http://localhost:9000/orders/api/complete-orders"

	val scn = scenario("OrderProducts")
		.exec(http("OrderProducts")
			.post("/orders/api/complete-orders")
			.headers(headers_0)
			.body(RawFileBody("OrderProducts_0000_request.txt")))

	setUp(scn.inject(atOnceUsers(400))).protocols(httpProtocol)
}