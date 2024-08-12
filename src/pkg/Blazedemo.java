package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://blazedemo.com/register");
}
@Test
public void test()
{
	driver.findElement(By.id("name")).sendKeys("sruthy");
	driver.findElement(By.name("company")).sendKeys("xyz");
	driver.findElement(By.id("email")).sendKeys("sruthy201");
	driver.findElement(By.name("password")).sendKeys("abc1345");
	driver.findElement(By.id("password-confirm")).sendKeys("abc1345");
}
}
