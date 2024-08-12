package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsite {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
public void test1()
{
	String actualtitle=driver.getTitle();
    String expec="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More Amazon.in";
if(actualtitle.equals(expec))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
	
}
}
@Test
public void test2()
{
	String actualcontent=driver.getPageSource();
	if(actualcontent.contains("update location"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
	
}
@After
public void closeBrowser()
{
	driver.close();
}
}
	
	
