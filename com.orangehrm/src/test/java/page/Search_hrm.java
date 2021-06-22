package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_hrm {

	WebDriver driver;

	By pim = By.id("menu_pim_viewPimModule");
	By employeename = By.name("empsearch[employee_name][empName]");
	By employeeid = By.name("empsearch[id]");
	By search = By.name("_search");

	public Search_hrm(WebDriver driver){
		this.driver = driver;
	}

	//click pim
	public void clickPim(){
		driver.findElement(pim).click();
	}


	//Set employee name
	public void setEmployeeName(String strEmployeeName){
		driver.findElement(employeename).sendKeys(strEmployeeName);;
	}

	//Set id
	public void setEmployeeId(String strEmployeeId){
		driver.findElement(employeeid).sendKeys(strEmployeeId);
	}

	//Click on search button
	public void clickSearch(){
		driver.findElement(search).click();
	}


	public void SearchEmployeeOrangehrm(String strEmployeeName,String strEmployeeId){
		//pim
		this.clickPim();
		//Fill employeename
		this.setEmployeeName(strEmployeeName);
		//Fill id
		this.setEmployeeId(strEmployeeId);
		//Click search button
		this.clickSearch();

	}
}

