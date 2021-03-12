package ApplicationPagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppUtils.Base;
import ApplicationPages.HomePage;

public class HomePageTest extends Base {
	
	HomePage hp;
	public HomePageTest()
	{
		super();
		
		
	}
	@BeforeMethod
	public void invoke()
	{
		initializeBrowser();
		hp=new HomePage();
	}
	@Test
	public void login()
	{
		hp.vrfyFromBox().sendKeys("hyderabad");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
