package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
//parent&child
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void test()
{
	driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
}
}
