import org.openqa.selenium.WebDriver;

public class NavigationTest {

	WebDriver driver = SeleniumUtil.connect();

	private void navigate() throws InterruptedException {

		driver.navigate().to("https://www.vistaprint.in/cart.aspx");

		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
	}

	public static void main(String[] args) {

		NavigationTest nt = new NavigationTest();
		try {
			nt.navigate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
