package pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Searchemp_hrm {
	public WebDriver driver;

	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim;

	@FindBy(name="empsearch[employee_name][empName]")
	WebElement employeename;

	@FindBy(id="empsearch[id]")
	WebElement employeeid;


	@FindBy(name="_search")
	WebElement search;


	

	public Searchemp_hrm(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	public void search_excel(String strEmployeeName,String strEmployeeId) throws Exception{
        //click PIM
		pim.click();
		Thread.sleep(2000);
		//Employee name
		employeename.sendKeys(strEmployeeName);
		//Employee id
		employeeid.sendKeys(strEmployeeId);
		Thread.sleep(2000);
		//click search
		search.click();
		Thread.sleep(2000);

	}


}

