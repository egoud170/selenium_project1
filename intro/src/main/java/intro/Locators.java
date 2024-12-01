package intro;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Locators{
      public static void main(String[] args) {
	
	

	//implicit wait - 2 seconds time out


	System.setProperty("webdriver.chrome.driver","E://drivers//chromedriver-win64//chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

    //driver.findElement(By.id("inputUsername")).sendKeys("rahul");

   // driver.findElement(By.name("inputPassword")).sendKeys("hello123");
}
}