package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookdemo {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@Test
public void test()
{
	driver.findElement(By.id("email")).sendKeys("pqr123");
	driver.findElement(By.id("pass")).sendKeys("abc234");
	driver.findElement(By.name("login")).click();
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
