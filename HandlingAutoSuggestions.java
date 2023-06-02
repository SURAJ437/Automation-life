package methodfindelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//FindElements - List<WebElements>
//Handling Auto Suggestions
public class HandlingAutoSuggestions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Selenium");
		List<WebElement> seleniumAutoSuggestions = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		//get the count Of the elements in  the auto Suggestions returned by findElements()
		System.out.println("seleniumAutoSuggestions in total = " + seleniumAutoSuggestions.size());
		// The for each loop - Iteratively 10 Iterations
		for (WebElement auto1 : seleniumAutoSuggestions) {
			System.out.println(auto1.getText());
			//It has to click on 6th Auto-Suggestion
			if (auto1.getText().equals("selenium testing")) {
				// SUpply the wait for the condition as expected by the user
				//wait.until(ExpectedConditions.textToBePresentInElement(auto1, "selenium testing"));
				//perform the action on the element which is under current iteration
				//since the condition has already been validated in the if block
				auto1.click();
				//under 6th Iteration of the for each loop the condition 
				//Satisfied and clicked on the element
				//for the next iteration of for each their is no actual element In the webpage
				//therefore StaleElementReferenceException
				break;
			}	
		}
		driver.quit();
	}
}
