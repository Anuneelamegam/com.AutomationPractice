package pageModule;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Basefile;
import core.Drivermanagerfile;

import webElement.Loginxpath;


public class Loginpage extends Drivermanagerfile {
	public static Basefile fun = new Basefile ();
	
	public void LoginMenu(ExtentTest test) throws InterruptedException, IOException {
		Loginxpath loginxp = new Loginxpath(driver);

		Thread.sleep(2000);

		fun.fluentWait(loginxp.login, driver);
	
		fun.CLICK(loginxp.login, driver);
		System.out.println("login is click");
		test.log(LogStatus.INFO, "login is click", test.addScreenCapture(fun.capture(driver)));
		

	}
	
	public void LoginForm( String pw ,ExtentTest test) throws InterruptedException, IOException {
		Loginxpath loginxp = new Loginxpath(driver);


		Thread.sleep(2000);

		fun.fluentWait(loginxp.Emailaddress, driver);
	

		fun.SENDKEYS(loginxp.Emailaddress, driver, "anusuyaneelamegam28@gmail.com");
		fun.fluentWait(loginxp.Password, driver);
		fun.SENDKEYS(loginxp.Password, driver, pw);
		fun.fluentWait(loginxp.Login, driver);

		fun.CLICK(loginxp.Login, driver);
		
		Thread.sleep(4000);
		fun.fluentWait(loginxp.logout, driver);

		if (loginxp.logout.isDisplayed()) {
			System.out.println("login successfully");
			test.log(LogStatus.PASS, "login successfully", test.addScreenCapture(fun.capture(driver)));

		} else {
			System.out.println("login faild");
			test.log(LogStatus.FAIL, "login faild ", test.addScreenCapture(fun.capture(driver)));

		}
	}



}
