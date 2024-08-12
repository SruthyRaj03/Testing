package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitdemo {

@Before
public void  setup()
{
	System.out.println("browser open");
}
@Test
public void test1()
{
	System.out.println("testing activity");
}
@After
public void browserclose()
{
	System.out.println("browser close");

}
}
