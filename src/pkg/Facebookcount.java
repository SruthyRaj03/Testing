package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookcount {

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
	WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	Select day=new Select(dayelement);
	day.selectByValue("13");
	List<WebElement> li = day.getOptions();
	System.out.println(li.size());
	WebElement Monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select M=new Select(Monthelement);
	M.selectByIndex(12);
	List<WebElement> li2 = M.getOptions();
	System.out.println(li2.size());
	WebElement Year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	Select y=new Select(Year);
y.selectByVisibleText("1996");
List<WebElement> li3 = y.getOptions();
System.out.println(li3.size());
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
