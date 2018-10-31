package jobSityGustavo;


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderCartCheckOut {

	WebDriver chromedriver; 

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padres\\eclipse-workspace\\Auto1\\chromedriver.exe");
		chromedriver = new ChromeDriver();
		chromedriver.get(" http://automationpractice.com/");
		methods.waitForLoadChrome(chromedriver);
	
	}

	@After
	public void tearDown() throws Exception {
		//chromedriver.close();
	}

	@Test
	public void test() {
		
		chromedriver.findElement(By.cssSelector("#block_top_menu > ul:nth-child(2) > li:nth-of-type(1) > .sf-with-ul:nth-of-type(1)")).click();
		methods.waitForLoadChrome(chromedriver);
		
		chromedriver.findElement(By.xpath("/html//div[@id='center_column']/ul/li[1]//a[@title='Add to cart']/span[.='Add to cart']")).click();
		methods.waitForLoadChrome(chromedriver);

		chromedriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);				
		
		chromedriver.findElement(By.xpath("/html//div[@id='layer_cart']//span[@title='Close window']")).click();
		methods.waitForLoadChrome(chromedriver);
		
		methods.hoverOverCart (chromedriver);
		
		chromedriver.findElement(By.cssSelector("[title='Check out'] span")).click();
		
	}
}
