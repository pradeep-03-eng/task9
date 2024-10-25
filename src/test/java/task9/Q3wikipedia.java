package task9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3wikipedia {


	private static char[] sectiontitle;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Step 2: Maximize the browser
		driver.manage().window().maximize();
		
		//Step 3: Loading the URL
		driver.get("https://www.wikipedia.org");
		
		// Step 4: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Find elements
		driver.findElement(By.name ("search")).sendKeys("Artificial Intelligence",Keys.ENTER);
		
		// Click on history
		driver.findElement(By.linkText("History")).sendKeys("History of artificial intelligence",Keys.ENTER);
		driver.findElement(By.linkText("History")).click();
		
		//Print the page title
		String sectiontitle = driver.getTitle();
		System.out.println(sectiontitle);
		
		//Close the browser
		driver.close();
		

	}

	
		
	}


