package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesForce {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Testleaf$321");
		
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//driver.findElement(By.className("slds-icon slds-icon-text-default slds-icon_xx-small")).click();
		
		WebElement oppurtunity = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]"));
		
		driver.executeScript("arguments[0].click();", oppurtunity);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Salesforce Automation by Arun");
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("1/13/2023");
		
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control'])[3]")).click();
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	}

}
