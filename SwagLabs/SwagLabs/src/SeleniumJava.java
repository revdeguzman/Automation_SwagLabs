import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SeleniumJava {
	
	WebDriver driver;
	
	public void launchBrowser() {
		
		//Locate chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Automation_SwagLabs\\SwagLabs\\Other Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Action: Chrome Browser Launched.");
		
	}
	
	public void maxWindow() {
		
		//Maximize the window
		driver.manage().window().maximize();
		System.out.println("Action: Window Maximized.");
		
	}
	
	public void navigateURL() {
		//Navigate to URL
		driver.get("https://www.saucedemo.com/");
		System.out.println("Action: Navigated to" + " " + driver.getCurrentUrl());
		
	}

	public void userLogin() throws InterruptedException, IOException {
		
		//Input Username and Password
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		//Call Screenshot
		screenShot();
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("Action: User Logged in.");
		
	}
	
	public void homePage() throws InterruptedException, IOException {
		
		//Home Page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Call Screenshot
		screenShot();
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).isDisplayed();
		System.out.println("Action: Home Page is Displayed.");
		
	}
	
	public void addItems() throws InterruptedException, IOException {
		
		//Add Item to Cart
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		System.out.println("Action: Items added to your Cart, please check.");
		
		//Call Screenshot
		screenShot();
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
	}
	
	public void checkOut() throws InterruptedException, IOException {
		
		//Add to Cart
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Current Page is " + "'" + driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText() + "'");
		
		//Call Screenshot
		screenShot();
		
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

	}
	
	public void inputInfo() throws InterruptedException, IOException {
		
		//Checkout Items
		System.out.println("Navigated to Checkout Information");
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
		
		//Call Screenshot
		screenShot();
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		System.out.println("Action: Continue is clicked.");
		
	}
	
	public void checkOutOverview() throws InterruptedException, IOException {

		//Checkout Overview
		System.out.println("Action: Navigated to Checkout Overview");

		//Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scroll(0,1000)");
		System.out.println("Action: Scroll Down the Page");
		
		//Call Screenshot
		screenShot();
		
		//Click Finish
		driver.findElement(By.cssSelector("button[id='finish']")).click();

	}
	
	public void CheckOutComplete() throws InterruptedException, IOException {
		
		//Checkout Completed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Checkout is Completed");
		
		//Call Screenshot
		screenShot();

	}

	public void closeBrowser() throws InterruptedException {
		
		//Closing Browser
		driver.quit();
		System.out.println("Action: Browser Closed");

	}
	
	public void dropDown() throws InterruptedException, IOException {
		
		//Select Value in Dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"))); 
		dropdown.selectByVisibleText("Price (high to low)");
		
		//Print Selected Value
		Select selectedValue = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		String curTxt = selectedValue.getFirstSelectedOption().getText();
		System.out.println("Action: Selected" + " '" + curTxt + "' " + "in Dropdown List.");
		
		//Call Screenshot
		screenShot();

	}
	
	public void sideMenu() throws InterruptedException, IOException {
		
		//Menu is Clicked.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		
		//Call Screenshot
		screenShot();
		
	}
	
	public void menuAllItems() throws InterruptedException {
		
		//Menu - Items
		driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
		System.out.println("Action: Navigated to All Items.");

	}
	
	public void menuAbout() throws InterruptedException {
		
		//Menu - About
		driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();
		System.out.println("Action: Navigated to About.");

	}
	
	public void menuLogout() throws InterruptedException {

		//Menu - Logout
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		System.out.println("Action: User logged out.");

	}
	
	public void screenShot() throws InterruptedException, IOException {

		//Take Screenshot
	    LocalDateTime myDateObj = LocalDateTime.now();  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh.mm.ss a");  
	    String formattedDate = myDateObj.format(myFormatObj);  

		Screenshot FullPage = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		ImageIO.write(FullPage.getImage(), "PNG", new File("G:\\Selenium\\Automation_SwagLabs\\SwagLabs\\Other Files\\Screenshot\\" + formattedDate + ".png"));

	}

}