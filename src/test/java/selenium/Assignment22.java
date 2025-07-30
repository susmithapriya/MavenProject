package selenium;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment22 {
	// 1. Launch browser window(Chrome)
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application
		// (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");

		// 5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@src='/images/Toolsqa.jpg']"), 0));

		// 6. Enter First name and Last name
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Susmitha");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("s");// 7. Enter Email

		// 7. Enter Email
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("susmitha.s@gmail.com");

		// 8. Select Gender (Female)
		// selectgender("Female");
		// WebElement genderradio=driver.findElement(By.xpath("//input[@value='Female']"));
		WebElement genderradio=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		genderradio.click();

		// 9. Enter mobile number
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobilenumber.sendKeys("9908000615");

		// 10.Select DOB (1-Feb-1991)
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.clear();
		dob.sendKeys("13-May-1994");

		// 11.Search and Select Computer Science
		WebElement subjects=driver.findElement(By.xpath("//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label']"));
		subjects.sendKeys("Computer Science");

		// 12.Select Hobbies as Sports and Reading
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='1']"));
		if (!checkbox.isSelected())
			checkbox.click();
		
		// 13.Upload photo
		String filePath = System.getProperty("user.dir")+"\\img\\"+"Bee.jpg";
		
		WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPhoto.sendKeys(filePath);

		// 14. Wait till file upload
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//input[@id='uploadPicture']"),0));
		
		// 15.Submit Details
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
		
		// 16. Close browser window
		driver.quit();
	}

	public static void selectgender(String gender) {
		WebElement genderradio = driver.findElement(By.xpath("//input[@value='" + gender + "']"));
		genderradio.click();
	}

}
