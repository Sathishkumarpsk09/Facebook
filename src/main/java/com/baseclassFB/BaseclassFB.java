package com.baseclassFB;
    
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseclassFB {

	public static WebDriver driver = null;

	public static void input(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void clearContent(WebElement element) {

		element.clear();

	}

	public static void printText(WebElement element) {

		String text = element.getText();
		System.out.println("The Text is : " + text);

	}

	public static void printattributevalue(WebElement element, String value) {
		
		String attribute = element.getAttribute(value);
		System.out.println("The Element attribute is: "+attribute);
	}
	
	public static void isEnabled(WebElement element) {

		boolean check = element.isEnabled();
		System.out.println("The check whether element is enabled: " + check);

	}

	public static void isSelected(WebElement element) {

		boolean checkSelected = element.isSelected();
		System.out.println("The check whether element is selected: " + checkSelected);

	}

	public static void isDisplayed(WebElement element) {

		boolean checkDisplayed = element.isDisplayed();
		System.out.println("The check whether element is selected: " + checkDisplayed);
	}

	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void implicitlywait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void explicitlyWait(WebElement element, String value) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (value.equalsIgnoreCase("visible")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}else if (value.equalsIgnoreCase("click")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}else {
			System.out.println("Wrong wait input");
		}		
	}
	
	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sathish Kumar\\eclipse-workspace\\Facebook\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("gecko")) {

			driver = new FirefoxDriver();

		} else {

			System.out.println("Invalid Browser");
		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void launchURL(String URL) {

		driver.get(URL);

	}

	public static void printTitle() {

		String title = driver.getTitle();

		System.out.println("The Page Title is : " + title);

	}

	public static void printUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("The page Url is :" + currentUrl);

	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}
	
//	public static void minimizeDimension(int x, int y) {
//		
//		Dimension dim = new Dimension(x, y);
//		driver.manage().window().setSize(dim);
//	}

//	public static void minimizePosition(int x, int y) {
//		Point p = new Point(x, y);
//		driver.manage().window().setPosition(p);
//	}

	public static void alertAccept(String alert) {

		Alert a = driver.switchTo().alert();
		if (alert.equalsIgnoreCase("Ok")) {

			a.accept();
		} else if (alert.equalsIgnoreCase("cancel")) {

			a.dismiss();

		}
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertInput(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	public static void alertPrinttext(String alert) {
		driver.switchTo().alert().getText();
	}

	public static void promptAlert(String promAlert, String value) {
		Alert a = driver.switchTo().alert();
		if (promAlert.equalsIgnoreCase("ok")) {
			String text = a.getText();
			System.out.println("The prompt alet text is:"+text);
			a.sendKeys(value);
			a.accept();
			
		}else if(promAlert.equalsIgnoreCase("Cancel")) {
			String text = a.getText();
			System.out.println("The Prompt alert Text is: "+text);
			a.sendKeys(value);
			a.dismiss();
		}
	}
	
	public static void takesScreenShot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Sathish Kumar\\eclipse-workspace\\Facebook\\Screenshot\\fb1.png");
		FileUtils.copyFile(source, destination);

	}
	
	public static void jsScroll(int h, int v) { // camel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(" + h + "," + v + ")");
	}

	public static void jsScrollBy(int h, int v) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + h + "," + v + ")");
	}

	public static void jsScrollInToView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void jsSendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "';", element);
	}


	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	
	
	public static void Selectoption(WebElement element, String options, String value) {

		Select s = new Select(element);
		
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("Index")) {
			int n = Integer.parseInt(value);
			s.selectByIndex(n);	
		}else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}else {
			System.out.println("Invalid select input");
		}

	}
	
	public static void deSelectMethods(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (options.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		} else if (options.equalsIgnoreCase("index")) {
			int n = Integer.parseInt(value);
			s.deselectByIndex(n);
		} else {
			System.out.println("Invalid Select");
		}
	
	}
	
	public static void selectIsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean m = s.isMultiple();
		System.out.println("Is Multiple" + m);
	}

	public static void selectdeSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public static void selectfirstSelected(WebElement element) {
		Select s = new Select(element);
		WebElement first = s.getFirstSelectedOption();
		System.out.println("The First Selected Option is : " + first);
	}

	public static void selectgetOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement oneOption : options) {
			System.out.println("The Options in DropDown is : "+oneOption);
		}
		
	}

	public static void selectgetallSelcted(WebElement element, String value) {
		Select s = new Select(element);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement oneSelectedOption : allSelectedOptions) {
			
			System.out.println("The all selected options in DropDown is : "+oneSelectedOption);
			}
	
	}

	public static void actiondragAndDrop(WebElement element1, WebElement element2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element1, element1).perform();
	}

	public static void actionMethod(WebElement element, String value) {
		Actions a = new Actions(driver);
		if (value.equalsIgnoreCase("DC")) {
			a.doubleClick(element).perform();
		} else if (value.equalsIgnoreCase("CC")) {
			a.contextClick(element).perform();
		} else if (value.equalsIgnoreCase("CAH")) {
			a.clickAndHold(element).perform();
		} else if (value.equalsIgnoreCase("C")) {
			a.click(element).perform();
		} else if (value.equalsIgnoreCase("MTE")) {
			a.moveToElement(element).perform();
		} else if (value.equalsIgnoreCase("R")) {
			a.release(element).perform();
		} else {
			System.out.println("Wrong Action");
		}
	
	}
	
	public static void framesElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static void getWindowHandle() {
		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
	}

	public static void getWindowTitle() {
		Set<String> windows = driver.getWindowHandles();
		for (String id : windows) {
			System.out.println(driver.switchTo().window(id).getTitle());
		}
	}

	public static void getWindowSwitch(String s) {
		Set<String> windows = driver.getWindowHandles();
		for (String id : windows) {
			if (driver.switchTo().window(id).getTitle().equalsIgnoreCase(s)) {
				break;
			}
		}
	}

	public static void robotClass(int n) throws AWTException {
		Robot r = new Robot();
		for (int i = 1; i <= n; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	
	
	
	
	
	

}
