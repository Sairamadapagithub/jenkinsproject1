package Stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class test {
WebDriver driver;
public test() {
	this.driver=Hooks.driver;
}
@Given ("Open chrome and launch url{string}")
	public void Openchromeandlaunchurl(String URL) {
	driver.get(URL);
	System.out.println("--------------------");
	System.out.println(driver.getCurrentUrl());
}
@And("failscenario")
public void failscenario() {
	
		Assert.assertEquals(driver.getCurrentUrl(), "rahulshetty");
	
}
@And ("validatepassscenarios")
public void validatepassscenarios() {
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/seleniumPractise/#/");
}
}

