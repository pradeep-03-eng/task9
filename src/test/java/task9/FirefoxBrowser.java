package task9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Launch the browser
		WebDriver driver = new FirefoxDriver();
		
		// Step 2: Maximize the browser
		driver.manage().window().maximize();
		
		//Step 3: Loading the URL
		driver.get("http://google.com");
		
		// Step 4: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Step 5: Get the current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " +currentUrl);
		
		// Step 6: Refresh the browser page
		driver.navigate().refresh();
		
		// Step 7: Close the browser
		driver.close();
		
		

	}

}
