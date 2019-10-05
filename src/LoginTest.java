import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	WebDriver driver = SeleniumUtil.connect();
	private static WebElement email, password;

	
	
	public void passLogin(){

		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/nav/div/div/header[2]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[1]/tbody/tr[5]/td[2]/input[1]")).sendKeys("shreeramk.1998@gmail.com");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("shreeram1998");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[2]/tbody/tr[4]/td/div[1]/span[2]/span/input")).click();
		driver.close();
		System.out.println("login succesful!!!");
		
	}
	
	public void failLogin(){

		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/nav/div/div/header[2]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[1]/tbody/tr[5]/td[2]/input[1]")).sendKeys("shreeramk.8@gmail.com");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("shreeram18");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[2]/tbody/tr[4]/td/div[1]/span[2]/span/input")).click();
		driver.close();
		System.out.println("login unsuccessful!!!");
		
	}
	
	
	public static void main(String[] args) {
		LoginTest lt = new LoginTest();
		lt.passLogin();
	}

}
