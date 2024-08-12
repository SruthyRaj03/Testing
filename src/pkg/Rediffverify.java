package pkg;
//Rediff create my account test verification
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffverify {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
	
WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
String button=actualtext.getAttribute("value");
System.out.println(button);
if(button.equals("create my account>>"))
{
	System.out.println("pass");
	
}
else
{
	System.out.println("fail");
}
}
}
