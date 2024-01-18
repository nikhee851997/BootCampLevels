package b3_bootcampframework_3;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Title 
{
	
 public WebDriver driver;
 public ChromeOptions opt;
 public SoftAssert soft;
 
 
	
	
@BeforeMethod
public void setup()
{
	
opt= new ChromeOptions();
opt.addArguments("incognito");
opt.addArguments("start-maximized");
opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
driver = new ChromeDriver(opt); 
driver.get("https://tutorialsninja.com/demo");

}

@Test
public void getTittle()
{
	String actualtittle = driver.getTitle();
	
	String actualurl    = driver.getCurrentUrl();
	
	System.out.println("Tittle of webapplication is :" +actualtittle);
	
	System.out.println("Url of application is: " +actualurl);
	
	String expectedtittle = "Your Store";
	
	String expectedurl ="https://tutorialsninja.com/demo/";
	
	
	soft = new SoftAssert();
	
	soft.assertEquals(actualurl, expectedurl);
	
	soft.assertEquals(actualtittle, expectedtittle);
	
	soft.assertAll();;
			
	
	
}

@AfterMethod
public void close()
{
       driver.quit();
       
}




}
