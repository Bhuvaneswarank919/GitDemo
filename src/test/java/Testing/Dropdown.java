package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers_Selenium_JunkFood\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement drop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		drop.click();
		Thread.sleep(2000);
		Select dropdown = new Select(drop);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Build Success");
		
		
	}

}
