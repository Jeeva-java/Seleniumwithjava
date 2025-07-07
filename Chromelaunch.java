package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
/*Chrome-Launch sample code*/
public class Chromelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./WebDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	}

}
