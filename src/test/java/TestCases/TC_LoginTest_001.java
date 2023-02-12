package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_LoginTest_001 extends Base {

	@Test
	public void LoginTest()
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("URL is opened");
		
		lp.SetUserName(username);
		logger.info("Enter username");
		
		lp.SetPassword(password);
		logger.info("Enter password");
		
		lp.ClickSubmit();
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}else {
			Assert.assertTrue(false);
			logger.info("Login ");
		}
		
	}
}
