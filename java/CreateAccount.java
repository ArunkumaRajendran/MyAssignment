import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.name("groupNameLocal")).sendKeys("Arun");
		
		driver.findElement(By.name("officeSiteName")).sendKeys("Chennai");
		
		driver.findElement(By.name("annualRevenue")).sendKeys("1cr");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
	
		Select industryObj = new Select(industry);
		
		industryObj.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		
		Select ownershipObj = new Select(ownership);
		
		ownershipObj.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		
		Select sourceObj = new Select(source);
		
		sourceObj.selectByVisibleText("Employee");
		
		WebElement marketcampaign = driver.findElement(By.id("marketingCampaignId"));
		
		Select marketcampaignObj = new Select(marketcampaign);
		
		marketcampaignObj.selectByIndex(5);

		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select stateObj = new Select(state);
		
		stateObj.selectByVisibleText("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();

	}

}
