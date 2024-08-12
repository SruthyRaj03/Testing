package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonrelative {

ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
     driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
     driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sruthy@gmail.com");
      driver.findElement(By.xpath("//input[@id='continue']")).click();
      driver.navigate().back();
      driver.navigate().back();
     driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]")) .click();
      

driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
}
}


