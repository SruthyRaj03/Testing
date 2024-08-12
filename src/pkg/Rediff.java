package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void test()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("pwr");
driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abcd");
driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();


}
}
