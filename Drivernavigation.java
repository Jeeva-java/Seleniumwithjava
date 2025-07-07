package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivernavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/button");
		
		String url = driver.getCurrentUrl();
		System.out.println("page url "+ url);
		Thread.sleep(3000);
		
		driver.findElement(By.id("home")).click();
		String url1 = driver.getCurrentUrl();
		//time.sleep
		Thread.sleep(3000);
		System.out.println("home page url "+ url1);
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("back to page url "+ driver.getCurrentUrl());
//		String url2 = driver.getCurrentUrl();
//		System.out.println("back to page url "+ url2);
		
		driver.quit();

	}

}
