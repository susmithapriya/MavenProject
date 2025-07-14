package selenium;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Seleniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		1.Launch the browser window (Browser=chrome)
		WebDriver driver = new ChromeDriver();
		
		
		//2. enter the URL and launch the application
		driver.get("https://www.google.com/");
		
		
		//3. minimize the window
		driver.manage().window().maximize();
		
		
		//4.  Maximize to specific resolution(800X400)
		driver.manage().window().setSize(new Dimension(430,932));

		
		//5. maximize the window
		driver.manage().window().minimize();
		
		
		//6. Delete all browser cookies
		//driver.manage().deleteAllCookies();
		
		
		//7. Verify the application title
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		Assert.assertEquals(actualTitle, expectedTitle , "Application is not launched properly");
		
		
		//8.Navigate to different  (https://www.selenium.dev/)
		driver.navigate().to("https://www.selenium.dev/");
		
		//9.go back to previous application
		driver.navigate().back();
		
		
		//10.Move forward to next application
		driver.navigate().forward();
		
		
		
		//11. Refresh the application
		driver.navigate().refresh();
		
		
		
		//12.collect the main window id
		String mainwindowid=driver.getWindowHandle();
		System.out.println(mainwindowid);
		
		
		//13.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)   
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");
		
		
		//14.get all windowids
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		//windowIds.remove(mainWindowId);
		
		
		//15.switch back to mainwindow
		driver.switchTo().window(mainwindowid);
		
		
		//16.Print the browser window URL 
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		
		//17. Get the Size of window
		int height= driver.manage().window().getSize().getHeight();
		int width=driver.manage().window().getSize().getWidth();
		System.out.println("The size of window is"+height +width);
	
		
//		15.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm) 
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
		//18.close the currentwindow
		driver.close();
		
		//19.close all remaining windows
		driver.quit();
		
		
		
	}

}
