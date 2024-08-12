package testNGPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {


WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.janasya.com");
}
@Test
public void test1() 
{
	driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a")).click();//new arrivals
}
public void test2()
{
	
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16349892411562__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img"));
	
	
	
    if (logo.isDisplayed()) {
        System.out.println("Logo is present");
    } 
    else 
    {
        System.out.println("Logo is not present");
    }
}
}
