package frameworkconepts;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appmethods ap=new Appmethods();
		Webmethods wm=new Webmethods();
		
		wm.startreporting();
		
		
		wm.launchbrowserandapplication("Chrome", "https://google.com");
		ap.loginfuntionality("Username", "Password");
		ap.VerifyHomepage();
		ap.VerifyLogo();
		ap.testcase1();
		ap.logoutfuntionality();
		ap.closeApplication();
		wm.closebroser();
		System.out.println("*******************************");
		
		
		
		
		wm.launchbrowserandapplication("Chrome", "https://google.com");
		ap.loginfuntionality("Username", "Password");
		ap.VerifyHomepage();
		ap.VerifyLogo();
		ap.testcase2();
		ap.logoutfuntionality();
		ap.closeApplication();
		wm.closebroser();
		System.out.println("*******************************");
		
		
		
		
		
		wm.launchbrowserandapplication("Chrome", "https://google.com");
		ap.loginfuntionality("Username", "Password");
		ap.VerifyHomepage();
		ap.VerifyLogo();
		ap.testcase3("data");
		ap.logoutfuntionality();
		ap.closeApplication();
		wm.closebroser();
		System.out.println("*******************************");
		
		
		
		
		wm.launchbrowserandapplication("Chrome", "https://google.com");
		ap.loginfuntionality("Username", "Password");
		ap.VerifyHomepage();
		ap.VerifyLogo();
		ap.testcase3("data2");		
		ap.logoutfuntionality();
		ap.closeApplication();
		wm.closebroser();
		System.out.println("*******************************");
		
		
		
		wm.stopreporting();

	}

}
