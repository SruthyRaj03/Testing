package testNGPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Moongodesscouture {

WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.moongoddesscouture.com/");
}
@Test
public void test1()
{
	driver.findElement(By.xpath(""))
}
