package UserRegistration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	
public WebDriver  initializeDriver() throws IOException
{
	
Properties prop = new  Properties();
FileInputStream fis = new  FileInputStream("C:\\Users\\1000075145\\eclipse-workspace\\AutomateProcess\\src\\main\\java\\UserRegistration\\data.properties");

prop.load(fis);
String browserName = prop.getProperty("browser");
System.out.println(browserName);

if (browserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075145\\chromedriver.exe");
		 driver = new ChromeDriver();
}
else if (browserName.equals("firefox")) {
	driver = new FirefoxDriver();
}

return driver;
}
}
