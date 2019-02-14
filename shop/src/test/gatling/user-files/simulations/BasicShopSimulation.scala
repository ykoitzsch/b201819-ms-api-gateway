
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BasicShopSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:9000")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png""", """.*/api/account"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7",
		"Authorization" -> "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU0OTk5MDExM30.7BofIYY_ie82OIFu2_vXmHvehrRC6nHLy0l008Sc_B41tv-z6IGUY316cgWV_0uI_-fusicDADaqCxz0hzAMbA")

	val headers_7 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7",
		"Authorization" -> "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU0OTk5MDExM30.7BofIYY_ie82OIFu2_vXmHvehrRC6nHLy0l008Sc_B41tv-z6IGUY316cgWV_0uI_-fusicDADaqCxz0hzAMbA",
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:9000")

	val scn = scenario("BasicShopSimulation")
		.exec(http("allProducts")
			.get("/inventory/api/products")
			.headers(headers_0))
		.pause(2)
		.exec(http("productDetail")
			.get("/inventory/api/products/15")
			.headers(headers_0)
			.resources(http("productRating")
			.get("/ratings/api/ratings?productId=15")
			.headers(headers_0)))
		.pause(4)
		.exec(http("allProducts")
			.get("/inventory/api/products")
			.headers(headers_0))
		.pause(1)
		.exec(http("productDetail")
			.get("/inventory/api/products/14")
			.headers(headers_0)
			.resources(http("productRating")
			.get("/ratings/api/ratings?productId=14")
			.headers(headers_0)))
		.pause(4)
		.exec(http("myBasket")
			.get("/orders/api/baskets/3")
			.headers(headers_0)
			.resources(http("allBaskets")
			.put("/orders/api/baskets")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0007_request.txt"))))
		.pause(3)
		.exec(http("myBasket")
			.get("/orders/api/baskets/3")
			.headers(headers_0)
			.resources(http("productDetail")
			.get("/inventory/api/products/14")
			.headers(headers_0)))
		.pause(2)
		.exec(http("allBaskets")
			.put("/orders/api/baskets")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0010_request.txt")))
		.pause(1)
		.exec(http("allProducts")
			.get("/inventory/api/products")
			.headers(headers_0)
			.resources(http("productDetail")
			.get("/inventory/api/products/13")
			.headers(headers_0),
            http("productRating")
			.get("/ratings/api/ratings?productId=13")
			.headers(headers_0)))
		.pause(4)
		.exec(http("myBasket")
			.get("/orders/api/baskets/3")
			.headers(headers_0)
			.resources(http("allBaskets")
			.put("/orders/api/baskets")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0015_request.txt"))))
		.pause(2)
		.exec(http("myBasket")
			.get("/orders/api/baskets/3")
			.headers(headers_0)
			.resources(http("productDetail")
			.get("/inventory/api/products/13")
			.headers(headers_0)))
		.pause(3)
		.exec(http("payOrder")
			.post("/orders/api/complete-orders")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0018_request.txt")))
		.pause(2)
		.exec(http("allProducts")
			.get("/inventory/api/products")
			.headers(headers_0)
			.resources(http("myOrders")
			.get("/orders/api/my-orders?customerId=3&login=admin")
			.headers(headers_0)))
		.pause(5)
		.exec(http("allInvoices")
			.post("/invoices/api/invoices")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0024_request.txt"))
			.resources(http("editCompleteOrder")
			.put("/orders/api/complete-orders")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0025_request.txt"))))
		.pause(2)
		.exec(http("InvoiceDetail")
			.get("/invoices/api/invoices/609")
			.headers(headers_0))
		.pause(5)
		.exec(http("allProducts")
			.get("/inventory/api/products")
			.headers(headers_0)
			.resources(http("productDetail")
			.get("/inventory/api/products/13")
			.headers(headers_0),
            http("productRating")
			.get("/ratings/api/ratings?productId=13")
			.headers(headers_0)))
		.pause(6)
		.exec(http("allRatings")
			.post("/ratings/api/ratings")
			.headers(headers_7)
			.body(RawFileBody("BasicShopSimulation_0030_request.txt")))

	setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
}