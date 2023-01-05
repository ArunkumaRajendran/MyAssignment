import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {
	
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Operations");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have 5 years of exp in Operations");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arun@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String createLead_title = driver.getTitle();
		
		System.out.println(createLead_title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTap");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
		
		String duplicateLead_title = driver.getTitle();
		
		System.out.println(duplicateLead_title);
	}

}
