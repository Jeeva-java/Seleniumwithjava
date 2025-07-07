package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/button");
		File screen = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./pics/imp.png");
		FileHandler.copy(screen, des);
		
		WebElement home = driver.findElement(By.id("home"));
		File scree = home.getScreenshotAs(OutputType.FILE);
		File dest = new File("./pics/imp1.png");
		FileHandler.copy(scree, dest);
		
		driver.quit();
		

	}

}
