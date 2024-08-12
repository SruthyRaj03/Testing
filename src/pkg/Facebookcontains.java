package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcontains {

ChromeDriver driver;
@Before
public void setup()
{
	
driver=new ChromeDriver();
}
@Test
public void test()
{
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]"));
}
}
