package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		} 
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		return driver;
	}
	
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void implicitWait(long secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));

	}
	
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	
	public static void click(WebElement e) {
		
		e.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	public static void jsScrollDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	
	public static void jsScrollUp(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static String excelRead(String filename,String sheetname,int row,int cell) throws IOException {
		
		File f=new File("C:\\Users\\kchristopher\\eclipse-workspace\\NewYorkTimesProject\\src\\test\\resources\\Excel\\"+filename+".xlsx");
		FileInputStream fs=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fs);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		String value=null;
		if(type==1) {
			value = c.getStringCellValue();
		} else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
				value = sf.format(date);
			}
			else {
				double db = c.getNumericCellValue();
				long num=(long) db;
				value = String.valueOf(num);
			}
			
			
		}
		
		return value;
		
	}
	

	
	
	
	
	
	
	
	
}
