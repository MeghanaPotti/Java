package Selenium;

public class Selenium {

	public static void main(String[] args) {
		
		// driver initialization	
//		Chrome - WebDriver driver = new ChromeDriver();
//		FireFox - WebDriver driver = new FireFoxDriver();
//		Edge - WebDriver driver = new EdgeDriver();
		
		// Locating Elements
//		By Id - driver.findElement(By.id(<elementId>));
//		By Name - driver.findElement(By.name(<elementName>));
//		By Class Name - driver.findElement(By.className(<elementClassName>));
//		By Tag Name - driver.findElement(By.tagName(<elementTagName>));
//		By CSS - driver.findElement(By.cssSelector(<tag value>));
//		By Xpath - driver.findElement(By.xpath(<xpath>));
		
		// TestNG
//		BeforeSuite - Executes before entire suite - setting up system properties
//		BeforeTest - Executes before all test methods - Launching browser
//		BeforeClass - Executes before first method of current class - Navigating to website
//		BeforeMethod - Executes before each method - LOgin
//		Test - Test case logic - order (selection and checkout)
//		AfterMethod - Executes after each method - Logout
//		AfterClass - Executes after first method of current class - closing session
//		AfterTest - Executes after all test methods - closing browser
//		AfterSuite - Executes after entire suite - generate report
		
		//waits
//		implicit wait - - wait time for webdriver before throwing an exception if element is not found on webpage
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.Seconds); 
//		explicit wait - wait time for specific condition to occur before proceeding to the next step
//		WebDriver driver = new WebDriver();
//	    WebElement element = new WebDriverWait(driver, DurationOfSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id(<elementID>)));
//	    fluent wait - handling ignored exceptions
//	    WebDriver driver = new WebDriver();
//	    driver.get("https://www.google.com");
//	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
//	    		.withTimeout(Duration.ofSeconds(20));
//	    		.pollingEvery(Duration.ofSeconds(2));
//	    		.ignoring(NoSuchElementException.class);
//	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(<elementId>)));
//	    element.click();
	    
	    //window handles
//		driver.manage().window().maximize();
//		String mainWindow = driver.getWindowHandle();
//		Set<String> allWindows = driver.getWindowHandles();
//		driver.switchTo().window(windowHandle);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.manage().window().setPosition(new Point(0, 0)); - set window position
//		driver.navigate().refresh();
//		driver.navigate().forward();
//		driver.navigate().back();
		
		//frames
//		driver.switchTo().frame("buttonframe"); - by id or name
//		driver.switchTo().frame(1); - by index
		
		//Alerts
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("text");
//		String text = alert.getText();
		
		//Assets
//		SoftAsset.assetEquals(5,5); - SoftAsset 
//		Asset.assetEquals(5,5) - HardAsset
		
		//Screenshot
//		File srcFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//data from excel
//		FileInputStream inputStream = new FileInputStream(file);
//		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
//		HSSFSheet sheet=wb.getSheet(“STUDENT_DATA”);
//		HSSFRow row2=sheet.getRow(1);
//		HSSFCell cell=row2.getCell(5);
//		String address= cell.getStringCellValue();
		
		//file upload
//		driver.findElement(By.id("file-upload")).sendKeys(“path/to/your/file.txt”);
//		driver.findElement(By.id("file-submit")).submit();
		
		//Drag and drop
//		Actions actions = new Actions(driver);
//		WebElement source = driver.findElement(sourceLocator);
//		WebElement target = driver.findElement(destinationLocator);
//		actions.dragAndDrop(source, target).perform();
		
		
		

	}

}
