package Stepdefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
public class Hooks {
public static WebDriver driver;
	@Before
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@After
	public void teardown() {
		driver.close();
	}
		
}
