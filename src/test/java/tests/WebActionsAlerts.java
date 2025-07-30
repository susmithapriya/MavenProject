package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActionsAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// 1.Launch the web browser
		WebDriver driver= new ChromeDriver();
		
		// 2. Maximize the window
		driver.manage().window().maximize();
		
		//3. delete all cookies
		driver.manage().deleteAllCookies();
		
		//4.Enter URL and Launch the application
		driver.get("https://demoqa.com/automation-practice-form");
				
		//5.Locate Alert buttons
		
		
	}

}
