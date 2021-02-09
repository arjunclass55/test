package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class common {

public static WebDriver driver;

	public static void OpenBrowser (String browserName)
	{
		try {
			if (browserName.equalsIgnoreCase("Firefox"))
		{
	System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
	driver = new FirefoxDriver();
			}
			
			else if (browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
				driver = new ChromeDriver();
		}
			
			
			else if (browserName.equalsIgnoreCase("Safari"))
			{
				System.setProperty("webdriver.chrome.driver","/usr/local/bin/Safaridriver");
				driver = new SafariDriver();
		}
			
			
		}
		catch (WebDriverException e){
			System.out.println(e.getMessage());
		}
}
}
