package AppUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static  Properties prop;
	public static WebDriver driver;
	public Base()
	{
		try {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Kranthi\\SeleniumWork\\HybridFrameWorkDemo\\src\\main\\java\\AppUtils\\data.properties");
		prop.load(fis);
		}catch(Exception e)
		{
			System.out.println();
		}
		}
	
	
	public static void initializeBrowser()
	{
		String browser=prop.getProperty("browser");
		if(browser.contentEquals("chrome"))
		{
			System.setProperty("webdrive.chrome.driver", "E:\\Kranthi\\SeleniumWork\\HybridFrameWorkDemo\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.contentEquals("firefox"))
		{
			System.setProperty("webdrive.gecko.driver", "E:\\Kranthi\\SeleniumWork\\HybridFrameWorkDemo\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ApplicatinData.impWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ApplicatinData.pageLoad, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public  void getScreenShot(String result) 
	{
		try {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\"+result+"screenshot.png"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
