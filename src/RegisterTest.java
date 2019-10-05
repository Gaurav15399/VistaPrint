import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
		
	WebDriver driver = SeleniumUtil.connect();
		
	public void passRegister(){
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/nav/div/div/header[2]/div[2]/div[2]")).click();
		
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[1]/tbody/tr[5]/td[2]/input[1]")).sendKeys("sa@gmail.com");

		driver.findElement(By.id("rblPasswordQuestion_0")).click();
		Select dropdown = new Select(driver.findElement(By.id("SalutationDropDown")));
		dropdown.selectByVisibleText("Mr.");  
		driver.findElement(By.id("txtEmailAgain")).sendKeys("sa@gmail.com");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[3]/tbody/tr[4]/td[2]/input")).sendKeys("s");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/table[3]/tbody/tr[6]/td[2]/input")).sendKeys("a");
		
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[2]/input")).sendKeys("pass");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/div/table/tbody/tr[4]/td[2]/input")).sendKeys("pass");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[4]/div/div/div[2]/div/div/div/div[3]/span/input")).click();
		System.out.println("Registered !");
		//driver.close();
		
		
	}
	
	
	public static void main(String[] args) {
		RegisterTest rt = new RegisterTest();
		rt.passRegister();

	}

}
