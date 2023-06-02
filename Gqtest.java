package ICL;

import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gqtest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("./src/testdata/commondata2.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.xpath("/html/body/header/div[2]/div[1]/nav//li[2]/a[1]")).click();
		//Thread.sleep(4000);
		driver.findElement(By.id("Email1")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.id("Password1")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.id("signin")).click();
		
		driver.findElement(By.linkText("International")).click();
		driver.findElement(By.linkText("Get Quote")).click();
		driver.findElement(By.xpath("//li[@class='treeview menu-open']//ul[@class='treeview-menu']//li//span[@id='test']")).click();
		
		WebElement carrier = driver.findElement(By.id("CarrierID")); //(carrier Dropdown)
		Actions actions = new Actions(driver);
		actions.moveToElement(carrier).click().build().perform();
		carrier.sendKeys((pobj.getProperty("carrier")));
		//driver.findElement(By.xpath("//span[@id='select2-CarrierID-container']")).click();
		
		WebElement Service =driver.findElement(By.id("ServiceID")); //(Service Dropdown)
		actions.moveToElement(Service).click().build().perform(); 
		Service.sendKeys((pobj.getProperty("service")));
		
		WebElement customer = driver.findElement(By.id("CustomerId"));  //(Customer Dropdown)
		actions.moveToElement(customer).click().build().perform();
		customer.sendKeys((pobj.getProperty("customer")));
		
		WebElement Destcountry =driver.findElement(By.id("CountryId")); //(Destination country Dropdown)
		actions.moveToElement(Destcountry).click().build().perform();
		Destcountry.sendKeys((pobj.getProperty("Destcountry")));
		
		WebElement ismedicine=driver.findElement(By.id("Ismedcine"));
		actions.moveToElement(ismedicine).click().build().perform();
		
		WebElement Chargableweight = driver.findElement(By.id("Weight"));
		Chargableweight.clear();
		Chargableweight.sendKeys(pobj.getProperty("Chargableweight"));
		
		WebElement Constype =driver.findElement(By.id("ConsType"));
		actions.moveToElement(Constype).click().build().perform();
		Constype.sendKeys((pobj.getProperty("Constype")));
		
		Calendar calendar=Calendar.getInstance();
		String Targetdate="18-FEB-2023";
		SimpleDateFormat targetdateformat= new SimpleDateFormat("dd-MMM-yyyy");
		Date formatedtargetdate;
		try {
			targetdateformat.setLenient(false);
			formatedtargetdate=targetdateformat.parse(Targetdate);
			calendar.setTime(formatedtargetdate);
			int targetdate=calendar.get(Calendar.DAY_OF_MONTH);
			int targetmonth=calendar.get(Calendar.MONTH);
			int targetyear=calendar.get(Calendar.YEAR);
			driver.findElement(By.xpath("//button[@aria-label='select']")).click();
			driver.findElement(By.xpath("//a[text()="+targetdate+"]"));
		}
		catch(ParseException e)
		{
			throw new Exception("Invalid Date is Provided please check input date");
		}
		driver.findElement(By.cssSelector("button[onclick='DisplayrateList();']")).click();
		actions.moveToElement(ismedicine).click().build().perform();
		driver.findElement(By.cssSelector("button[onclick='DisplayrateList();']")).click();
		
		String Subtotal = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[5]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]")).getText();
		String Totaltaxes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[5]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]")).getText();
		String Grandtotal = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[5]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[12]")).getText();
		System.out.println("Carrier= "+pobj.getProperty("carrier")+" and "+" Service= "+(pobj.getProperty("service")+" and")+" Customer= "+pobj.getProperty("customer")+" and"+" Destcountry= "+pobj.getProperty("Destcountry")+"");
		System.out.println("Subtotal: "+Subtotal+"");
		System.out.println("Totaltaxes: "+Totaltaxes+"");
		System.out.println("Grandtotal: "+Grandtotal+"");
		Thread.sleep(2000);
	
	    driver.quit();
	
	}
}	
