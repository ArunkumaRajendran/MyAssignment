package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonEdge {

	public static void main(String[] args) {
		
	EdgeDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys",Keys.ENTER);
	
	WebElement bagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[3]"));
	
	String bagInfo = bagName.getText();
	
	System.out.println("1.3rd Bag Name Is-->"+bagInfo);
	
	WebElement results = driver.findElement(By.xpath("//span[contains(text(), 'results for')]"));
	
	String resultsInfo = results.getText();
	
	System.out.println("2.Total Number of Bags-->"+resultsInfo);
	
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();

	driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
	
	driver.findElement(By.xpath("//a[contains (text(), 'Newest Arrivals')]")).click();
	
	WebElement newArrivalBag = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
	
	String newArrivalBagInfo = newArrivalBag.getText();
	
	System.out.println("3.New Arrival First Bag Name is-->"+newArrivalBagInfo);
	
	WebElement resultsNewArrival = driver.findElement(By.xpath("//span[contains (text(), '47 results for')]"));
	
	String resultsNewArrivalInfo = resultsNewArrival.getText();
	
	System.out.println("4.NewArrival Results-->"+resultsNewArrivalInfo);
	
	WebElement discount = driver.findElement(By.xpath("//span[contains (text(), '62%')]"));
	
	String discountInfo = discount.getText();
	
	System.out.println("5.Discount Percentage of the bag is -->"+discountInfo);
	
	}
}
