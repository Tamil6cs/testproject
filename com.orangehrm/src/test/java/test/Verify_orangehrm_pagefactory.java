package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactory.Addemp_hrm;
import pagefactory.Login_hrm;
import pagefactory.Searchemp_hrm;


public class Verify_orangehrm_pagefactory {



	WebDriver driver;

	FileInputStream FRead;

	FileOutputStream FWrite;

	XSSFWorkbook wb;

	XSSFSheet sh;

	String d1,d2;
	String username, password;
	String firstname,lastname,usernameemp,passwordemp,confirmpassword,licencenum,ssnnum,nickname,militaryservice,otherid,sinnum;
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
		Searchemp_hrm search=new Searchemp_hrm(driver);
		Addemp_hrm add=new Addemp_hrm(driver);

		sh= wb.getSheetAt(1);
		for(rowval=1;rowval<rowcount;rowval++)
		{

            //Login and Search Employee
			empname=sh.getRow(rowval).getCell(0).getStringCellValue();
			empid=sh.getRow(rowval).getCell(1).getStringCellValue();
			loginclick.login_excelvalid(empname,empid);


			searchempname=sh.getRow(rowval).getCell(2).getStringCellValue();
			searchempid=sh.getRow(rowval).getCell(3).getStringCellValue();
			search.search_excel(searchempname,searchempid);

            //Add Employee
			firstname=sh.getRow(rowval).getCell(4).getStringCellValue();
			lastname=sh.getRow(rowval).getCell(5).getStringCellValue();
			usernameemp=sh.getRow(rowval).getCell(6).getStringCellValue();
			passwordemp=sh.getRow(rowval).getCell(7).getStringCellValue();
			confirmpassword=sh.getRow(rowval).getCell(8).getStringCellValue();

			licencenum=sh.getRow(rowval).getCell(9).getStringCellValue();
			ssnnum=sh.getRow(rowval).getCell(10).getStringCellValue();
			nickname=sh.getRow(rowval).getCell(11).getStringCellValue();
			militaryservice=sh.getRow(rowval).getCell(12).getStringCellValue();
			otherid=sh.getRow(rowval).getCell(13).getStringCellValue();
			sinnum=sh.getRow(rowval).getCell(14).getStringCellValue();
			add.AddEmployeeOrangehrm(firstname,lastname,usernameemp,passwordemp,confirmpassword,licencenum,ssnnum,nickname,militaryservice,otherid,sinnum);
			
			//logout
			Thread.sleep(2000);
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}
	}
	//closing the browser
	@AfterTest
	public void afterTest() throws Exception {
		driver.close();
		wb.close();
	}
}
























