package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redifsite {

ChromeDriver driver;
@Before
public void set()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
WebElement dayelement	=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select day= new Select(dayelement);
day.selectByValue("03");
List<WebElement> li = day.getOptions();
System.out.println(li.size());

WebElement Monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select M=new Select(Monthelement);
M.selectByIndex(2);
List<WebElement> li1 = M.getOptions();
System.out.println(li1.size());

WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
Select y=new Select (Year);
y.selectByVisibleText("1997");
List<WebElement> li2 = y.getOptions();
System.out.println(li2.size());
}
}
