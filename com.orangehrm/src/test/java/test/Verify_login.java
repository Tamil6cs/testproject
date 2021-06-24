package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Login_hrm;


public class Verify_login {

	WebDriver driver;

	FileInputStream FRead;

	FileOutputStream FWrite;

	XSSFWorkbook wb;

	XSSFSheet sh;
	XSSFSheet sht;
	String d1,d2;

	String username, password;
	String empid,empname;
	int rowval, rowcount;

	@BeforeTest
	public void beforeTest() throws Exception, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		/*File*/

		FRead=new FileInputStream("C:\\selenium_testing\\com.orangehrm\\EXCEL_ORANGEHRM\\orangehrm_.xlsx");
		//FRead=new FileInputStream("C:\\Users\\mathivanan\\Desktop\\orangehrm_.xlsx");‪

		/*XSSFWorkbook*/ wb=new XSSFWorkbook(FRead);

		/*XSSFSheet*/ sh= wb.getSheetAt(0);

		/*String*/ d1=sh.getRow(0).getCell(0).getStringCellValue();

		/*String*/ d2=sh.getRow(0).getCell(1).getStringCellValue();
		rowcount=sh.getPhysicalNumberOfRows();

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(rowcount);
	}

	@Test
	public void orangehrm_excel() throws InterruptedException, Exception {
		Login_hrm checklogin=new Login_hrm(driver);
		for(rowval=1;rowval<rowcount;rowval++)
		{
			//Login with valid and invalid data
			username=sh.getRow(rowval).getCell(0).getStringCellValue();
			password=sh.getRow(rowval).getCell(1).getStringCellValue();
			checklogin.loginToOrangehrm(username,password);
			Thread.sleep(2000);
		}
	}
	@AfterTest
	public void close_browser() {
		driver.close();
	}
	}
	



