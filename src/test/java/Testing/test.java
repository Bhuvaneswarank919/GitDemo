package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers_Selenium_JunkFood\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		//System.exit(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhuvi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Bhuvaneswaran919@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9952956178");
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String gettext=driver.findElement(By.xpath("//h2[text()='Forgot password']/following::p[1]")).getText();
		System.out.println(gettext);
		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Forgot password']/following::p[1]")).getText(), "Please use temporary password 'rahulshettyacademy' to Login.");
//		test o = new test();
//		o.password(driver);
		String pass=password(driver);
		System.out.println(pass);
	
		driver.findElement(By.xpath("//*[text()='Go to Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Bhuvi");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(pass);
		
		driver.quit();
	}
	
	public static String password(WebDriver driver) {
		
		String Passwordoflogin=driver.findElement(By.xpath("//h2[text()='Forgot password']/following::p[1]")).getText();
//		Please use temporary password 'rahulshettyacademy' to Login.
		String Pass[]=Passwordoflogin.split("'");
//		0th index-- Please use temporary password '
//		1st index-- rahulshettyacademy' to Login.
		String Password1[]= Pass[1].split("'");
		String Password=Password1[0];
		return Password; 
		
		
	}

}
