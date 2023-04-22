package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class accessDropDown {
 public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver_win32 (4)\\chromedriver.exe");
	  //  String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    String baseURL = "String baseURL = \"https://demo.guru99.com/test/newtours/register.php\";";
	    ChromeOptions options = new ChromeOptions();
	    options.setAndroidPackage("true");
	    WebDriver driver = new ChromeDriver(options);
		driver.get(baseURL);

		/*Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		driver.close();*/
 }
}