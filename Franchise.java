package ICL;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Franchise {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("./src/testdata/commondata3.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		Actions actions = new Actions(driver);
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.xpath("/html/body/header/div[2]/div[1]/nav//li[2]/a[1]")).click();
		driver.findElement(By.id("Email1")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.id("Password1")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.id("signin")).click();
		
		driver.findElement(By.xpath("//span[@class='main-menu-name'][normalize-space()='Accounts']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Franchisee Deposit']")).click();
		driver.findElement(By.xpath("(//span[@id='test'])[26]")).click();
		
		WebElement Frdropdown = driver.findElement(By.id("CustomerId"));  //Franchise Dropdown
		Select Franchisedropdown = new Select(Frdropdown);
		Franchisedropdown.selectByVisibleText((pobj.getProperty("Franchise")));
		
        WebElement DepositType = driver.findElement(By.id("DepositType"));  //Deposit type Dropdown
		Select DepsitTypedropdown = new Select(DepositType);
		DepsitTypedropdown.selectByVisibleText((pobj.getProperty("DepositTyp")));
		
		
		driver.findElement(By.id("date_range")).click();  //Calender
		driver.findElement(By.cssSelector("button[class='applyBtn btn btn-sm btn-primary']")).click();
		
		
        WebElement PaymentType = driver.findElement(By.id("DepositType"));  //Payment type Dropdown
		Select PaymentTypedropdown = new Select(PaymentType);
		DepsitTypedropdown.selectByVisibleText((pobj.getProperty("PaymentTyp")));
		
		driver.findElement(By.id("DepositDiv")).click();
		
		driver.findElement(By.id("createlbl")).click();
		

		
		WebElement Frdropdown1 = driver.findElement(By.id("CustomerId"));  //Franchise Dropdown
		Select Franchisedropdown1 = new Select(Frdropdown1);
		Franchisedropdown1.selectByVisibleText((pobj.getProperty("Franchise1")));
		
		
		WebElement DepositType1 = driver.findElement(By.id("DepositType"));  //Deposit type Dropdown
		Select DepsitTypedropdown1 = new Select(DepositType1);
		DepsitTypedropdown1.selectByVisibleText((pobj.getProperty("DepositTyp1")));
		
		
		
		WebElement PaymentType1 = driver.findElement(By.id("PaymentTypeId"));  //Payment type Dropdown
		Select PaymentTypedropdown1 = new Select(PaymentType1);
		Thread.sleep(2000);
		//actions.moveToElement(PaymentType1).click().build().perform();
		//actions.sendKeys((pobj.getProperty("PaymentTyp1")));
		PaymentTypedropdown1.selectByVisibleText((pobj.getProperty("PaymentTyp1")));
		
		
		WebElement Recivedamounttextfield = driver.findElement(By.id("PaymentAmt")); // Recived amount text field
		Recivedamounttextfield.sendKeys((pobj.getProperty("Reciveamount")));
		
		WebElement Refrencenumber = driver.findElement(By.id("txtCheque")); 
		Refrencenumber.sendKeys((pobj.getProperty("Refnumber")));
		
		WebElement Receiptdate = driver.findElement(By.id("DepositDate"));
		actions.moveToElement(Receiptdate).click();
		//Receiptdate.click();
		
		WebElement createbutton = driver.findElement(By.cssSelector("button[onclick='InsertDepositTranScope();']"));
		actions.moveToElement(createbutton).click();
	    //createbutton.click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
