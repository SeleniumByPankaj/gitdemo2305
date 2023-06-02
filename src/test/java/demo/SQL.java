package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SQL {

	@Test
	public void openSQLCourse()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/");
		String title = driver.getTitle();
		
		if (title.contains("SQL"))
		{
			System.out.println("Correct website is launched");
		}
		else
		{
			System.out.println("Incorrect website is launched");
		}
	}
}
