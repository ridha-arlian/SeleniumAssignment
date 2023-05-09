import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Melakukan setup pada Browser Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Input text pada field Username
		driver.get("http://the-internet.herokuapp.com/login");
		WebElement username=driver.findElement(By.cssSelector("[id='username']"));
		username.sendKeys("TommmmSmith");
		
		//Memilih semua kata sebelumnya dan menghapusnya
		Thread.sleep(2500);
		Actions actions = new Actions (driver);
		actions.click(driver.findElement(By.cssSelector("[id='username']")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build()
		.perform();
		
		//Melakukan kembali input data username pada field
		WebElement username2=driver.findElement(By.cssSelector("[id='username']"));
		username2.sendKeys("tomsmith");
		
		//Meng-input password pada field
		WebElement password=driver.findElement(By.cssSelector("[id='password']"));
		password.sendKeys("SuperSecretPassword!");
		
		//Melakukan Enter agar submit login dilakukan
		WebElement login=driver.findElement(By.cssSelector("[type='submit']"));
		login.sendKeys(Keys.ENTER);
		
		//Melakukan proses logout dengan meng-click
		WebElement logout=driver.findElement(By.cssSelector("[href='/logout']"));
		logout.click();
	}

}
