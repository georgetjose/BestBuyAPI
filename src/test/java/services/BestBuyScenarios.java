package services;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BestBuyScenarios extends BaseRequest
{
	@Test(enabled=true)
	public void getAllFlatScreenTvSortBySalePrice(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "sku,name,salePrice")
				.queryParam("sort", "salePrice")
				.queryParam("pageSize", "100")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("products(categoryPath.name=\"All%20Flat-Screen%20TVs\")");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void getAllManufacturersOfFlatScreenTv(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "manufacturer")
				.queryParam("sort", "salePrice")
				.queryParam("facet", "manufacturer,50")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("products(categoryPath.name=\"All%20Flat-Screen%20TVs\")");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void getAlltheProducts(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "name,regularPrice,salePrice,offers.startDate,offers.endDate")
				.queryParam("pageSize", "100")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("products");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void GetshippingCostLowTohigh(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "name,shippingCost")
				.queryParam("sort", "shippingCost")
				.queryParam("pageSize", "100")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("products");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void GetCategoryId(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "path")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("categories");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void GetProductFromElectronics(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "name,salePrice")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("products(search=electronics&salePrice<100)");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void GetAllServices(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "services")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("stores(name=ATTLEBORO MA&postalCode=02760)");
		
		response.prettyPrint();
	}
	
	@Test(enabled=true)
	public void GetSundayTimingss(){
		response = RestAssured
				.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("show", "hours")
				.queryParam("apiKey", "qUh3qMK14GdwAs9bO59QRSCJ")
				.get("stores(name=ATTLEBORO MA&postalCode=02760)");
		
		response.prettyPrint();
	}
}
