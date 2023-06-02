package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverPractice {
	public static void main(String[] args) throws Throwable {
		// Step:01 Launch the ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 02:  pass the main URL of the Amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		// Step 03: Get The amazon Title and verify
		String actualAmazonTitle = driver.getTitle();

		//System.out.println("Amazon web page Title is : "+actualAmazonTitle);
		String expectedAmazonTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("expectedAmazonTitle: "+expectedAmazonTitle);
		System.out.println("actualAmazonTitle: "+actualAmazonTitle);
		if(expectedAmazonTitle.equals(actualAmazonTitle)) {
			System.out.println("Pass: The Amazon webpage title is verified and correct");
		}
		else
		{
			System.out.println("Fail: The Amazon webpage tile is verified and not correct");
		}
		//Step 04: pass the url of the flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		// Step 05: Get the title and verify the Current url
		System.out.println("The flipkart webpage title is: "+driver.getTitle());
		String actualFlipkartUrl =driver.getCurrentUrl();
		String exepectedFlipkartUrl = "https://www.flipkart.com/";
		System.out.println("exepectedFlipkartUrl: "+exepectedFlipkartUrl);
		System.out.println("actualFlipkartUrl: "+actualFlipkartUrl);
		if(exepectedFlipkartUrl.equals(actualFlipkartUrl)) {
			System.out.println("Pass: The flipkart URL page is verified and found correct");
		}
		else
		{
			System.out.println("Fail: The flipkart URL page is verified and found Incorrect");
		}

		// Step 06 To Launch the Firefox browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		Thread.sleep(5000);

		//Step 07: Pass DRDO URL and get the Title
		firefoxDriver.get("https://www.drdo.gov.in/");
		System.out.println("DRDO Webpage Title is: "+firefoxDriver.getTitle());
		Thread.sleep(5000);

		//Step 08: Pass the MyGovt URL print the Title and CurrentURL
		firefoxDriver.get("https://www.mygov.in/");
		Thread.sleep(5000);
		System.out.println("The Title of the MyGOvt web page is: "+firefoxDriver.getTitle());
		System.out.println("The CurrentURL of the MyGOvt webpage is: "+firefoxDriver.getCurrentUrl());

		//Step 09: Pass MakeInIndia URL and Print The Title
		Thread.sleep(5000);
		firefoxDriver.get("https://www.makeinindia.com/");
		System.out.println("The title of the MakeInIndia webpage: "+firefoxDriver.getTitle());

		//Step 10: Pass SkillIndia URL and print the title and verify the URL
		firefoxDriver.get("https://www.skillindia.gov.in/");
		System.out.println("Title of the skill india webpage: "+firefoxDriver.getTitle());
		String expectedSkillIndiaURL = "https://www.skillindia.gov.in/";
		String actualSkillIndiaURL = firefoxDriver.getCurrentUrl();
		System.out.println("expectedSkillIndiaURL: "+expectedSkillIndiaURL);
		System.out.println("actualSkillIndiaURL: "+actualSkillIndiaURL);
		if(expectedSkillIndiaURL.equals(actualSkillIndiaURL)) {
			System.out.println("Pass: The SkiiIndia URL webpage is verified and found Correct");
		}
		else {
			System.out.println("Fail: The SkiiIndia URL webpage is verified and found InCorrect");
		}
		Thread.sleep(5000);

		//step 11: driver.quit();
		driver.quit();
	}
}
