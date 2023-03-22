package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermanagerfile {
	public static WebDriver driver;

	public static void browsermanager(String browser) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System setProperty method");
		if (browser.toLowerCase().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//test//resources//driverExe//chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("no parameter matched");
		}
		driver.get("https://www.automationexercise.com");
        Thread.sleep(3000);
     	driver.manage().window().maximize();
		System.out.println("Execution complete");
	}


}
