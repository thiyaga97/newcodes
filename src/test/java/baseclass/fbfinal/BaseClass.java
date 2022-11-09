package baseclass.fbfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commons.utility.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	public static ConfigReader configReader;

	public WebDriver browserLaunch() {
		configReader = new ConfigReader();
		try {
			switch(configReader.getBrowser().toLowerCase())
			{
			case "chrome":  
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				driver.manage().window().maximize();
				break;
				
			default:
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				break;
				}
			}
		catch(Exception e) {
					e.printStackTrace();
				}
		return driver;
		}
	
	
	public void urlLaunch(String url) {
		driver.get(url);
		
	}
	
	
}
