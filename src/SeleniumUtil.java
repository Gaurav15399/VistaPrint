import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtil {

	public static WebDriver connect() {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumWork\\VistaPrint\\extLibs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vistaprint.in/");
		return driver;

	}
}
