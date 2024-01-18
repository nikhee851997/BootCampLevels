package b3_bootcampframework_3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest 
{

public WebDriver driver;
public ChromeOptions opt;
public SoftAssert soft;


	
	
	
@BeforeMethod()
public void setup()
{
	opt=new ChromeOptions();
	opt.addArguments("incognito");
	opt.addArguments("start-maximized");
	opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
    driver= new ChromeDriver(opt);
    driver.get("https://www.bbc.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
}

@Test
public void VerifyLoginWithValidCredentials()
{
	driver.findElement(By.xpath("//div[@id=\"__next\"]/main/header/div/div/div/button[2]")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nikhil851997@gmail.com");
	driver.findElement(By.xpath("//button[@id='submit-button']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Restartnew@8");
	driver.findElement(By.xpath("//button[@id='submit-button']")).click();
	System.out.println("The open page Tittle is : " +driver.getTitle());
	
	// All links
	
	List<WebElement>links = driver.findElements(By.tagName("a"));
	int length= links.size();
	System.out.println("Total number of links in the website are :" +length);
	
	// link 
	
	WebElement Special= links.get(99);
	System.out.println("The 99th link that opens on website is :" +Special.getText());
	Special.click();
	driver.navigate().back();
	
	// HomePage
	
	links= driver.findElements(By.tagName("a"));
	System.out.println("The open page Tittle is : " +driver.getTitle());
	
}

@AfterMethod()
public void close()
{
	driver.close();
}



}
