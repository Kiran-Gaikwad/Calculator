package calculator;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addition {
	
static WebDriver driver;
	
	@BeforeTest
	public void applicationOpen()
	{
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
	}
	
	@Test
	public void multiplication()
	{
	driver.findElement(By.xpath("//span[text()='–' and @class='sciop']")).click();
	driver.findElement(By.xpath("//span[text()='2' and @class='scinm']")).click();	
	driver.findElement(By.xpath("//span[text()='3' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='4' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='2' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='3' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='4' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='+' and @class='sciop']")).click();
	driver.findElement(By.xpath("//span[text()='3' and @class='scinm']")).click();	
	driver.findElement(By.xpath("//span[text()='4' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='5' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='3' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='4' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='5' and @class='scinm']")).click();
	driver.findElement(By.xpath("//span[text()='=' and @class='scieq']")).click();
	WebElement result=driver.findElement(By.id("sciOutPut"));
	String actualResult=result.getText();
	String expectedResult=" 111111";
	AssertJUnit.assertTrue(actualResult.equals(expectedResult));
	}

}
