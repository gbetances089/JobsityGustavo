package jobSityGustavo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactFormTCs {

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
	chromedriver.close();
	}

	@Test
	public void testcase03() {
		
		chromedriver.findElement(By.cssSelector("[title='Contact Us']")).click();
		methods.waitForLoadChrome(chromedriver);
		
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);

		
		chromedriver.findElement(By.id("email")).sendKeys("test");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
		
		chromedriver.findElement(By.id("email")).sendKeys("test@net.com");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
	}
	
	@Test
	public void testcase04() {
		
		chromedriver.findElement(By.cssSelector("[title='Contact Us']")).click();
		methods.waitForLoadChrome(chromedriver);
		
		chromedriver.findElement(By.id("email")).sendKeys("test@net.com");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
		
		chromedriver.findElement(By.name("message")).sendKeys("This is a test");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);

	}
	
	@Test
	public void testcase05() {
		
		chromedriver.findElement(By.cssSelector("[title='Contact Us']")).click();
		methods.waitForLoadChrome(chromedriver);
		
		chromedriver.findElement(By.id("email")).sendKeys("test@net.com");
		chromedriver.findElement(By.name("message")).sendKeys("This is a test");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
		
		chromedriver.findElement(By.id("id_contact")).sendKeys("C");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
	}
	
	@Test
	public void testcase06() {
		
		chromedriver.findElement(By.cssSelector("[title='Contact Us']")).click();
		methods.waitForLoadChrome(chromedriver);
		
		chromedriver.findElement(By.id("email")).sendKeys("test@net.com");
		chromedriver.findElement(By.name("message")).sendKeys("This is a test");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
		
		chromedriver.findElement(By.id("id_contact")).sendKeys("W");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
	}
	
	@Test
	public void testcase07() {

		chromedriver.findElement(By.cssSelector("[title='Contact Us']")).click();
		methods.waitForLoadChrome(chromedriver);
		
		chromedriver.findElement(By.id("email")).sendKeys("test@net.com");
		chromedriver.findElement(By.name("message")).sendKeys("This is a test");
		chromedriver.findElement(By.id("id_contact")).sendKeys("C");
		chromedriver.findElement(By.id("submitMessage")).click();
		methods.waitForLoadChrome(chromedriver);
		methods.validateAlertMessage(chromedriver);
	}

}