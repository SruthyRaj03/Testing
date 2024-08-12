package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javasciptalert {

ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	
	Alert a	= driver.switchTo().alert();
	String actual	=a.getText();
	String exp="I am a JS Alert";
	if(actual.equals (exp))
		
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
		
	a.accept();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
	driver.switchTo().alert().sendKeys("pqrs");
	driver.switchTo().alert().accept();
}
}



