package jobSityGustavo;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class methods {
	
	static int cont = 0;	
	public static void waitForLoadChrome(WebDriver Chomedriver) {
		//To wait that the page is loaded//
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver Chromedriver) {
                        return ((JavascriptExecutor)Chromedriver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(Chomedriver, 30);
        wait.until(pageLoadCondition);
    }

	public static void validateAlertMessage(WebDriver chromedriver) {
		//Validate the alert message on the message page.
		Boolean ElementisPresent = chromedriver.findElements(By.cssSelector(".alert-danger p")).size()!= 0 ;
		if (ElementisPresent == true)
			return;		
					else {
			
			fail("The alert message is not there.");
		}
	}

	public static void validateDelete(WebDriver chromedriver) {
		//Validate that the cart is deleted after item is deleted
		chromedriver.findElement(By.cssSelector("[title='View my shopping cart']")).click();
		Boolean Visible = chromedriver.findElement(By.cssSelector(".alert-warning")).isDisplayed();
		if (Visible = true) {
			return;
		}else {
			
			fail("The item was not deleted from the cart.");

		}		
	}

	public static void cartQuantity(WebDriver chromedriver) {
		//Validate that items are been added to the cart
		String quant = chromedriver.findElement(By.className("ajax_cart_quantity")).getText();
		int quantity = Integer.parseInt(quant); 
		cont ++;	
		if (quantity == cont)
			return;
		else {
			fail("The quantity on the cart don't match with the elements added to it.");

			
			}
		
	}

	public static void hoverOverCart(WebDriver chromedriver) {
		//To hover ober the cart in the header		
		Actions action  = new Actions(chromedriver); 
		WebElement CartHeader = chromedriver.findElement(By.cssSelector("[title='View my shopping cart']"));
		action.moveToElement(CartHeader).build().perform();
	}

	public static void checkOutPage(WebDriver chromedriver) {
		//Validate that item is in the cart.
		Boolean isPresent = chromedriver.findElements(By.className("cart_product")).size() > 0;
		if(isPresent = true) {
			return;}
			else {
			fail("The item was not added to the cart.");
			}
	}		
}
		