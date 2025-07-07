package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextandGetattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		String str = driver.findElement(By.tagName("h1")).getText();
		System.out.println(str);

//		String att = driver.findElement(By.id("join").getAttribute("value");
		String att = driver.findElement(By.id("join")).getAttribute("value");
		System.out.println(att);
	}

}
