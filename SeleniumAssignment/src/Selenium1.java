import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Mendapatkan halaman website dan menjalankannya
		driver.get("https://stackoverflow.com/users/login");
		
		//Menerima penggunaan cookie
		Thread.sleep(10000);
		WebElement cookies=driver.findElement(By.className("js-accept-cookies"));
		cookies.click();
		
		//Melakukan inout pada field Email
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("yanwarholll@gmail.com");
		
		//Memilih semua kata sebelumnya dan menghapusnya
		Thread.sleep(1000);
		Actions actions = new Actions (driver);
		actions.click(driver.findElement(By.id("email")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build()
		.perform();
		
		//Melakukan input email kembali pada field
		Thread.sleep(500);
		WebElement email1=driver.findElement(By.id("email"));
		email1.sendKeys("yanwarholl@gmail.com");
				
		//Melakukan input password pada field
		Thread.sleep(500);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("qwerty1234");
		
		//Melakukan Enter agar submit login dilakukan
		Thread.sleep(500);
		WebElement login=driver.findElement(By.id("submit-button"));
		login.click();
		
		//Menekan tombol icon burger pada halaman
		Thread.sleep(500);
		WebElement burger=driver.findElement(By.className("iconStackExchange"));
		burger.click();
		
		//Melakukan proses logout dengan menekan tombol logout
		Thread.sleep(500);
		WebElement logout=driver.findElement(By.xpath("//a[@class='js-gps-track'][normalize-space()='log out']"));
		logout.click();
		
		//Melakukan proses logout dengan menekan tombol logout
		Thread.sleep(500);
		WebElement moreLogout=driver.findElement(By.xpath("//button[@class='flex--item s-btn s-btn__primary']"));
		moreLogout.click();
	}

}
