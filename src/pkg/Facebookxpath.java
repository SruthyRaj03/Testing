package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

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
	//absolute xpath
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("pqr");

}
}