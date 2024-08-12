package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitgoogle {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
}
@Test
public void test1()
{
	String actualtitle=driver.getTitle();
     String expec="Google";
	if (actualtitle.equals(expec))
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
	if(actualcontent.contains("Gmail"))
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
