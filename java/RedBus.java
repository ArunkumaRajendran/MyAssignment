package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class RedBus {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("Coimbatore");
		
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.xpath("//td[text()='13']")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
		String numberofBus = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		
		System.out.println("1.total No.of buses Found-->"+numberofBus);
		
		driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[6]")).click();
		
		String nameoftheBus = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		
		System.out.println("2.2nd listed bus name is-->"+nameoftheBus);
		
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		
		String availableSeats = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])[2]")).getText();
		
		System.out.println("3.No of Seats Left is-->"+availableSeats);
		
	}

}
