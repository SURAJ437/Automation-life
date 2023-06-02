package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YearDropDownSelection {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/signup");
	
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select daySelect = new Select(dayDropDown);
	List<WebElement> allDayOptions = daySelect.getOptions();
	for (WebElement day : allDayOptions) {
		String visibleDayText = day.getText();
		daySelect.selectByVisibleText(visibleDayText);
		if (day.isSelected()) {
			System.out.println("Pass: " + visibleDayText + "is Selected.");
		}else {
			System.out.println("Fail: " + visibleDayText + " is not Selected");}
	}
	
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropDown);
	List<WebElement> allMonthOptions = monthSelect.getOptions();
	for (WebElement month : allMonthOptions) {
		String visibleMonthText = month.getText();
		monthSelect.selectByVisibleText(visibleMonthText);
		if (month.isSelected()) {
			System.out.println("Pass: " + visibleMonthText + "is Selected");
		}else {
			System.out.println("Fail: " +visibleMonthText+ " is not selected");
		}
	}
	
	WebElement yearDropdown = driver.findElement(By.id("year"));
	Select yearSelect = new Select(yearDropdown);
	 List<WebElement> allYearOptions = yearSelect.getOptions();
	 for (WebElement year : allYearOptions) {
		String visibleYearText = year.getText();
		yearSelect.selectByVisibleText(visibleYearText);
		if (year.isSelected()) {
			System.out.println("Pass: "+visibleYearText+"  is selected");
		}else {
			System.out.println("Fail: " +visibleYearText+"  is not Selected" );
		}
	}
	 driver.quit();
}
}
