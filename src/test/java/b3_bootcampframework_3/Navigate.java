package b3_bootcampframework_3;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Navigate 
{
	
public WebDriver driver;
public ChromeOptions opt;
public SoftAssert soft;



@BeforeMethod
public void Setup()
{
	
	opt= new ChromeOptions();
	opt.addArguments("incognito");
	opt.addArguments("start-maximized");
	opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation", "disable-infobars"));
	driver=new ChromeDriver(opt);
	driver.get("https://www.automationexercise.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
}

@Test
public void NavigatetoLogoutPage() 
{
	//LoginPage
	
	driver.findElement(By.xpath("//section[@id='slider']/preceding::a[5]")).click();
	driver.findElement(By.xpath("//div[@class='login-form']/descendant::form/input[2]")).sendKeys("nikhee851997@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8May1997");
	driver.findElement(By.xpath("//div[@class='signup-form']/preceding::button")).click();
	//navigateToProductsPage

	driver.findElement(By.xpath("//header[@id='header']/descendant::div[7]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//div[@id='cartModal']/following::a[1]")).click();
	driver.findElement(By.xpath("//div[@id='cartModal']/following::a[2]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
	
    //navigateToCartPage
    
    driver.findElement(By.cssSelector("a.btn.btn-default.check_out")).click();
    
   // webelement display on CartPage
    
    soft=new SoftAssert();
    soft.assertTrue(driver.findElement(By.xpath("//textarea[@name='message']")).isDisplayed());
    driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("please send rite colour");
    driver.findElement(By.xpath("//a[text()='Place Order']")).click();
    //navigateToCheckoutPage
    
    driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Nikhil");
    driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("123456789");
    driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("085");
    driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("10");
    driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2025");
    driver.findElement(By.cssSelector("button#submit"));
    driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
    soft.assertAll();
}

@AfterMethod
public void close()
{
	driver.quit();
}


}
