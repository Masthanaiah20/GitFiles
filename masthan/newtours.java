package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("masthanaiah");
		driver.findElement(By.name("lastName")).sendKeys("kandukuru");
		driver.findElement(By.name("phone")).sendKeys("9493912379");
		driver.findElement(By.id("userName")).sendKeys("k.masthanaiah@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("BHEL");
		driver.findElement(By.name("address2")).sendKeys("RC PURAM");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("TS");
		driver.findElement(By.name("postalCode")).sendKeys("502032");
		Select dropdwn= new Select(driver.findElement(By.name("country")));
		dropdwn.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("k.masthanaiah@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mast@2020");
		driver.findElement(By.name("confirmPassword")).sendKeys("Mast@2020");
		driver.findElement(By.name("register")).submit();
		
			}

		}



