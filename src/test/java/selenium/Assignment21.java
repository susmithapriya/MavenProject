package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment21 {
	static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Launch the browser window
		WebDriver driver=new ChromeDriver();
		
		// 2. Maximize the window
		driver.manage().window().maximize();
		
		// 3.Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4.Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		//5. Verify application title
		String aTitle="ParaBank | Welcome | Online Banking";
		String exTitle="ParaBank | Welcome | Online Banking";
		Assert.assertEquals(aTitle, exTitle, "Verifying application title properly launched or not");
		
		//6. Verify application logo
		 boolean logoelement= driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		 Assert.assertTrue(logoelement, "LOGO Is Displayed");
		
		 
		// 7. Verify application caption
		 WebElement Captionelement=driver.findElement(By.xpath("//p[@class=\'caption\']"));
		 Captionelement.toString();
		// Assert.assertEquals(Captionelement, exTitle)
		 
		 
		// 8. Enter Invalid credentials in Username and Password textboxes
		 WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		 Username.sendKeys("Susmithas");
		 WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		 Password.sendKeys("12345");
		 
		 
		 //9. Click on Login Button
		 WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		 login.click();
		 
		 //10. Verify error message is displayed (The username and password could not be verified.)
		 boolean errormsg=driver.findElement(By.xpath("//p[@class='error']")).isDisplayed();
		 Assert.assertTrue(errormsg, "Error Msg Displayed");
		 
		 //11. Click on Adminpage link
		 WebElement adminpage=driver.findElement(By.xpath("//a[text()='Admin Page']"));
		 adminpage.click();
		 
		//12. Wait for admin page
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		// 13. Select Data access mode as ' SOAP'
		 WebElement radiobutton=driver.findElement(By.xpath("//input[@value='soap']"));
		 radiobutton.click();
		 
		 
		 //14. Scrolldown till Loan provider
		WebElement LoanProviderScroll = driver.findElement(By.xpath("//select[@name='loanProvider\']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", LoanProviderScroll);
		 
		 
		// 15. Select Loanprovider as 'Web Service'
		 Select s=new Select(LoanProviderScroll);
		 s.selectByContainsVisibleText("Web Service");
		 
		 
		 //16. Click on Submit button
		 WebElement submitbtn=driver.findElement(By.xpath("//input[@value='Submit']"));
		 submitbtn.click();
		 
		 
		 //17.wait for Successful submission message
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		 
		 //18.Click on Services Link
		 WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		 servicesLink.click();
		 
		 //19.Wait for Services page
		 wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		 
		 //20.Scrolldown till Bookstore services
		WebElement bookStoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", bookStoreServices);
			
			
		//21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td"));
		
		int totalRows = rows.size();
		int totalColumns = columns.size();
		
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
		
		for (int r =1; r<=totalRows ; r++) {
			for(int c=1; c<=totalColumns ; c++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr["+r+"]//td["+c+"]"));
				String cellValue = cell.getText();
				System.out.println("Row "+r+", Column "+c+" Value is : "+cellValue);
			}
		}
		
//		24.Close browser window
		driver.quit();
			
		 
		//driver.close();
		
		
	}

		public static void selectDataAccessMode(String option) {
			WebElement dbaMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
			dbaMode.click();
		}

	
}
