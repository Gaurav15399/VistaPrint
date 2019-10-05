import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchTest {

	WebDriver driver = SeleniumUtil.connect();
	public void passSearch() {
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/nav/div/div/header[2]/div[2]/a[2]/div/div/input")).sendKeys("Visting Cards"+Keys.ENTER);
		System.out.println("Search Test Passed");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	public void failSearch() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/nav/div/div/header[2]/div[2]/a[2]/div/div/input")).sendKeys("abfkjfb"+Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	public static void main(String[] args) {
		SearchTest st = new SearchTest();
		st.passSearch();
		st.failSearch();
	}

}
