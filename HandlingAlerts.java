package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//simple alert
		driver.findElement(By.id("accept")).click();
		Alert aler = driver.switchTo().alert();
		String str = aler.getText();
		System.out.println("simple alert text "+ str);
		aler.accept();
		
		//confirm alert
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		String st = al.getText();
		System.out.println("confirm alert text "+ st);
		aler.dismiss();
		
		//prompt alert
		driver.findElement(By.id("prompt")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("jeeva");
		System.out.println(a.getText());
		a.accept(); 
		
		String s1 = driver.findElement(By.id("myName")).getText();
		System.out.println(s1);
	}

}
