package frameworkconepts;

import org.testng.Assert;

public class Appmethods {

		
		public void loginfuntionality(String Uname,String pwd) {
			System.out.println("Login with username: " +Uname);
			System.out.println("Entering the pwd: " +pwd);
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
		
		public void testcase1()
		{
			Assert.fail("testcase1 failed for somereason");
			System.out.println("Executing test case1");
		}
		
		public void testcase2() {
			System.out.println("Executing testcase2");
		}
		
		public void testcase3(String data) {
			System.out.println("test case3 is executing with string data"+data);
			System.out.println("test case 3 executed successfully");
		}
}
