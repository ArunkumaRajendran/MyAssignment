import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arunkumar");
	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select drop=new Select(tool);
		
		drop.selectByVisibleText("Employee");
		
		WebElement campMarket = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select campObj=new Select(campMarket);
		
		campObj.selectByVisibleText("Pay Per Click Advertising");
		
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select ownershipObj=new Select(ownership);
		
		ownershipObj.selectByIndex(5);
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
		Select countryObj=new Select(country);
		
		countryObj.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
	}
}
