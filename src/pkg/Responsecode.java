package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {

ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void linkcount()throws IOException
{
	 URL ob = new URL(baseurl);
HttpURLConnection con	=(HttpURLConnection)ob.openConnection();
int responsecode	=con.getResponseCode();
	System.out.println(responsecode);
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