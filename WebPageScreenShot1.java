package getthescreenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenShot1 {
	public static void main(String[] args) throws Throwable{
		
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		//System.out.println(tempFile.getAbsolutePath());
		File destFile = new File("./errorshots/faceBookLoginPage"+timeStamp+".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();
	}
}
