package testng.frameworkconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Webmethods {

	@BeforeSuite
	public void startreporting() {
		System.out.println("reporting started");
	}

	@AfterSuite
	public void stopreporting() {
		System.out.println("Reporting stopped!!");
	}

	@BeforeMethod
	@Parameters({ "BROWSER", "URL" })
	public void launchbrowserandapplication(String browser, String url) {
		System.out.println(browser + "Browser is launched");
		System.out.println(url + "App is launched successfully");
	}

	@AfterMethod
	public void closebrowser() {
		System.out.println("Browser closed succeffully");
	}
}
