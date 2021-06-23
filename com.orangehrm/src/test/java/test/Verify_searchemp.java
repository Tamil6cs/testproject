package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Login_hrm;
import page.Search_hrm;



public class Verify_searchemp {
	WebDriver driver;

	FileInputStream FRead;

	FileOutputStream FWrite;

	XSSFWorkbook wb;

	XSSFSheet sh;

	String d1,d2;
	String username, password;

	String empname, empid,searchempname,searchempid;

	int rowval, rowcount;

	@BeforeTest
	public void beforeTest() throws Exception, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		/*File*/

		FRead=new FileInputStream("C:\\selenium_testing\\com.orangehrm\\EXCEL_ORANGEHRM\\orangehrm_.xlsx");
		wb=new XSSFWorkbook(FRead);
		/*XSSFSheet*/ sh= wb.getSheetAt(1);

		/*String*/ d1=sh.getRow(0).getCell(0).getStringCellValue();

		/*String*/ d2=sh.getRow(0).getCell(1).getStringCellValue();
		rowcount=sh.getPhysicalNumberOfRows();

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(rowcount);

	}



	@Test(priority=1)
	public void searchhrm_excel() throws InterruptedException, Exception {
		Login_hrm loginclick=new Login_hrm( driver);
		Search_hrm search=new Search_hrm(driver);


		sh= wb.getSheetAt(1);
		for(rowval=1;rowval<rowcount;rowval++)
		{

            //Search Employee
			empname=sh.getRow(rowval).getCell(0).getStringCellValue();
			empid=sh.getRow(rowval).getCell(1).getStringCellValue();
			loginclick.loginToOrangehrm(empname,empid);
//			searchempname=sh.getRow(rowval).getCell(2).getStringCellValue();
//			searchempid=sh.getRow(rowval).getCell(3).getStringCellValue();
//			search.SearchEmployeeOrangehrm(searchempname,searchempid);
		}
	}
}







