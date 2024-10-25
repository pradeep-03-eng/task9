package task9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Demoblaze {


	private static final String Store = null;

	public static <actual> void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Launch the browser
				WebDriver driver = new ChromeDriver();
				
				// Step 2: Maximize the browser
				driver.manage().window().maximize();
				
				//Step 3: Loading the URL
				driver.get("https://www.demoblaze.com");
				
				// Step 4: Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				String title = driver.getTitle();
				System.out.println(title);
			    System.out.println("Page landed on correct website");
				  

				// Step 6: Refresh the browser page
				driver.navigate().refresh();
				
				// Step 7: Close the browser
				driver.close();
				
				
	
		
	}
	}


	

	


