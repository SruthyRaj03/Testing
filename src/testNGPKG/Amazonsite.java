package testNGPKG;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Amazonsite {

WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.amazon.in/");
}
@Test
public void test1()
{
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
}
@Test
public void test2() throws IOException {


	String Exp="https://www.amazon.in/s?k=mobile+phones&crid=1WZP0AZBG830Z&sprefix=mobile+phones%2Caps%2C1493&ref=nb_sb_noss_1";

	String actual="https://www.amazon.in/s?k=mobile+phones&crid=1WZP0AZBG830Z&sprefix=mobile+phones%2Caps%2C1493&ref=nb_sb_noss_1";
	AssertJUnit.assertEquals (Exp, actual);//Title verification Hard Assertion
}
	
	@Test
	public void test3()
	{
	
	
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span/text()"));	
				
		   mobile.click();

		          
						String currentwindow=driver.getWindowHandle();

						driver.switchTo().window(currentwindow);

						WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	                 	addtocart.click();
						driver.navigate().refresh();

						WebElement gotocart=driver.findElement(By.id("nav-cart"));
						gotocart.click();
			}
		}


