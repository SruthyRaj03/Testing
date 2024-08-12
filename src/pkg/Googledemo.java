package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googledemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
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


driver.get("https://www.google.com/");
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
}

