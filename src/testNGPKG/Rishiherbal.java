package testNGPKG;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Rishiherbal {

WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://rishiherbalindia.linker.store/");//1
}
@Test
public void test1() 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sruthy13@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sruthy@123");
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
}


	
	public void test2()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();//login
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("sruthy13@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sruthy@123");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
}
	@Test
	public void test3()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");//4
	
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();//6
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a")).click();
	 
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();//all
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();//health
	
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();//safety
	}
	
	@Test
	public void test4()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();	
		
	}
	
	@Test
	public void scrnsht() throws Exception
	{
		
	WebElement privacy=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
File src2=privacy.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src2, new File("./Screenshot//Elementscreenshot1.png"));
}
@Test
	public void linkcount() throws IOException
	{
		URL ob=new URL("https://rishiherbalindia.linker.store/");
		
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid");
		
		}
		else
		{
			System.out.println("invalid");
		}
		
		
		
		
		
		
		
		
		
		
		
	
}
}