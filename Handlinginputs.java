package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinginputs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		Thread.sleep(3000);
		//enter the full name
		driver.findElement(By.id("fullName")).sendKeys("Jeeva");
		//append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" Person", Keys.TAB);
		//what is inside the text box
		String getme = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(getme);
		//clear text
		driver.findElement(By.id("clearMe")).clear();
		//confirm edit field is disabled
		boolean edit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(edit);
		//confirm text is readonly
		String att = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(att);
		//quit browser
		driver.quit();
	}

}
