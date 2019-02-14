
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PayOrder extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:9000")
		.inferHtmlResources()
		.acceptHeader("application/json, text/plain, */*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7")
		.authorizationHeader("Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU0OTk5MDExM30.7BofIYY_ie82OIFu2_vXmHvehrRC6nHLy0l008Sc_B41tv-z6IGUY316cgWV_0uI_-fusicDADaqCxz0hzAMbA")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

	val headers_0 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:9000")



	val scn = scenario("PayOrder")
		.exec(http("getInvoices")
			.post("/invoices/api/invoices")
			.headers(headers_0)
			.body(RawFileBody("PayOrder_0000_request.txt"))
			.resources(http("PayOrder")
			.put("/orders/api/complete-orders")
			.headers(headers_0)
			.body(RawFileBody("PayOrder_0001_request.txt"))))
		.pause(2)
		.exec(http("getInvoiceDetail")
			.get("/invoices/api/invoices/97"))

	setUp(scn.inject(atOnceUsers(400))).protocols(httpProtocol)
}