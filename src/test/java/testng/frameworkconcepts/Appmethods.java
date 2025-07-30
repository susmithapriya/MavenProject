package testng.frameworkconcepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Appmethods extends Webmethods {

	@DataProvider(name = "testData")
	public Object[][] testData() {
		return new Object[][] { { 1000.0, 5.0 }, { 2000.0, 7.5 }, { 1500.0, 6.0 } };
	}

	public void loginfuntionality(String Uname, String pwd) {
		System.out.println("Login with username: " + Uname);
		System.out.println("Entering the pwd: " + pwd);
	}

	public void logoutfuntionality() {
		System.out.println("Logged out successfully");
	}

	public void closeApplication() {
		System.out.println("Application  closed successfully");
	}

	public void VerifyHomepage() {
		System.out.println("Application homepage is verified successfully");
	}

	public void VerifyLogo() {
		System.out.println("Appilication logo verified successfully");
	}

	@BeforeMethod(dependsOnMethods = { "launchbrowserandapplication" })
	@Parameters({ "USERNAME", "PASSWORD" })
	public void loginfuntionality1(String username, String password) {
		loginfuntionality(username, password);
		VerifyHomepage();
		VerifyLogo();
	}

	@AfterMethod
	public void logoutFromApp() {
		logoutfuntionality();
		closeApplication();
	}

	@Test
	public void testcase1() {
		Assert.fail("testcase1 failed for somereason");
		System.out.println("Executing test case1");
	}

	@Test
	public void testcase2() {
		System.out.println("Executing testcase2");
	}

	@Test(dataProvider = "testData")
	public void testcase3(double principle, double interest) {
		System.out.println("test case3 is executing with string data" + principle + "and" + interest);
		System.out.println("test case 3 executed successfully");
	}
}