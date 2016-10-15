package SeleniumPraveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumFirst
{
	public static void main(String args[])
	{
		//System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.edureka.co");
		String actStrng=driver.getTitle();
		
		System.out.println("welcome to selenium with:"+ actStrng);
		
		driver.close();
		
		System.out.println("testing");
	}

}
