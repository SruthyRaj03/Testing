package pkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {

ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void scrnsht() throws Exception
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//folder screenshot
	FileHandler.copy(src,new File("D://error7.png"));
	
	
	
}

	
}