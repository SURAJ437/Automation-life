package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckForTheFunctionalityOfAllTheOptions {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		//Identify the dropDown as webelement associated with <Select>
		WebElement monthDropDown = driver.findElement(By.id("month"));
		//Select class parameterized constructor 
		Select select = new Select(monthDropDown);
		// Store all the visible text
		List<WebElement> allMonthOptions = select.getOptions();
		for (WebElement option : allMonthOptions) {
			String visibleText = option.getText();
			Thread.sleep(1000);
			select.selectByVisibleText(visibleText);
				if (option.isSelected()) {
					System.out.println("Pass: " + visibleText + " is Selected from the month drop down");
				}
			}
			driver.quit();
	}
	}