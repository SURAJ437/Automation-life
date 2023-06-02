package ICL;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchicl {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 FileInputStream fis = new FileInputStream("./src/testdata/commondata1.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.id("Wuc_pskin1_ctl00_ctl01_txtUid")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.id("Wuc_pskin1_ctl00_ctl01_txtpwd")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("Wuc_pskin1_ctl00_ctl01_imglogin")).click();
		driver.findElement(By.id("txtpincode")).sendKeys(pobj.getProperty("destinationpincode"));
		
		//Customer dropdown
		//WebElement customerdropdown = driver.findElement(By.id("ddlcustcod"));
		//Select customerselect = new Select(customerdropdown);
		//List<WebElement> Allcustomers = customerselect.getOptions();
		driver.findElement(By.id("ddlcustcod")).sendKeys(pobj.getProperty("customer"));
		//customerselect.selectByVisibleText("Softpal1234");
		
		//Produt or carrier dropdown
		//WebElement productdropdown = driver.findElement(By.id("ddlCarriertype"));
		//Select carrierselect = new Select(productdropdown);
		//List<WebElement> allcarriers = carrierselect.getOptions();
		//carrierselect.selectByVisibleText("DHL");
		driver.findElement(By.id("ddlCarriertype")).sendKeys(pobj.getProperty("Carrier"));
		
		//Mode
		driver.findElement(By.id("ddlMode")).sendKeys(pobj.getProperty("Mode"));
		
		//packagetype
		driver.findElement(By.id("ddlboxtyp")).sendKeys(pobj.getProperty("Packagetype"));
		
		//Producttype
		driver.findElement(By.id("ddlproduct")).sendKeys(pobj.getProperty("Producttype"));
		//Commodity
		driver.findElement(By.id("ddlcommodity")).sendKeys(pobj.getProperty("Commodity"));
		//Commodityinvoicevalue
		driver.findElement(By.id("txtcominv")).sendKeys(pobj.getProperty("Commodityinvoicevalue"));
		//Description
		driver.findElement(By.id("txtDescription")).sendKeys(pobj.getProperty("Description"));
		Actions a = new Actions(driver);
		//Eway bill number
		WebElement Ewaybillnumber = driver.findElement(By.id("txtE-WAYdet"));
		//Ewaybillnumber.clear();
		a.moveToElement(Ewaybillnumber).doubleClick().click().sendKeys(Keys.BACK_SPACE);
		Thread.sleep(10000);	
		Ewaybillnumber.sendKeys(pobj.getProperty("Ewaybillnumber"));
		
		//Eway bill  part-B number
		WebElement EwaybillnumberpartB = driver.findElement(By.id("txtE-WAYPartBdet"));
		EwaybillnumberpartB.clear();
		a.moveToElement(EwaybillnumberpartB).doubleClick().click().sendKeys(Keys.BACK_SPACE);
		Thread.sleep(10000);
		EwaybillnumberpartB.sendKeys(pobj.getProperty("EwaybillnumberpartB"));
		
		//Numberof pieces  
		WebElement Numberofpieces = driver.findElement(By.id("txtnofpieces"));
		Numberofpieces.clear();
		a.moveToElement(Numberofpieces).doubleClick().click().sendKeys(Keys.BACK_SPACE);
		Thread.sleep(10000);
		Numberofpieces.sendKeys(pobj.getProperty("Numberofpieces"));
		//checkbox
		driver.findElement(By.id("chkvolumetric")).click();
		//Lookup  imgTripImage
		driver.findElement(By.id("imgTripImage")).click();
		
		Thread.sleep(5000);	
		
		driver.quit();
		
	}
}
