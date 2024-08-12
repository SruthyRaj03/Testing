package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayalert {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/Design.html");
}


@Test
public void test()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	//driver.switchTo().alert().accept();
Alert a	= driver.switchTo().alert();
String actual	=a.getText();
String exp="hello I am an alert box";
if(actual.equals (exp))
	
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	
		a.accept();
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Sruthy");
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("raj");
}
}
