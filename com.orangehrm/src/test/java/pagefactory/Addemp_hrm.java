package pagefactory;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Addemp_hrm {


	WebDriver driver;

	@FindBy(xpath="//*[@id='btnAdd']")
	WebElement addemployee;

	@FindBy(name="firstName")
	WebElement firstname ;

	@FindBy(name="lastName")
	WebElement lastname;

	@FindBy(xpath="//*[@id='chkLogin']")
	WebElement createlogindetails;

	@FindBy(name="user_name")
	WebElement username;

	@FindBy(name="user_password")
	WebElement password;

	@FindBy(name="re_password")
	WebElement confirmpassword;

	@FindBy(xpath="//*[@id='btnSave']")
	WebElement save;

	@FindBy(xpath="//*[@id='btnSave']")
	WebElement edit;


	@FindBy(name="personal[txtLicenNo]")
	WebElement licencenum;

	@FindBy(name="personal[txtNICNo]")
	WebElement ssnnum;

	@FindBy(name="personal[txtEmpNickName]")
	WebElement nickname;


	@FindBy(name="personal[txtMilitarySer]")
	WebElement militaryservice;


	@FindBy(name="personal[txtOtherID]")
	WebElement otherid;

	@FindBy(name="personal[txtSINNo]")
	WebElement sinnum;

	public Addemp_hrm(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	//click add
	public void clickAdd(){
		addemployee.click();
	}


	//Set first name
	public void setFirstName(String strFirstName){
		firstname.sendKeys(strFirstName);
	}

	//Set last name
	public void setLastName(String strLastName){
		lastname.sendKeys(strLastName);
	}

	//createlogin
	public void setCreateLoginDetails(String strCreateLoginDetails){
		createlogindetails.click();
	}

	//username
	public void setUserName(String strUserName){
		username.sendKeys(strUserName);
	}
	//password
	public void setPassword(String strPassword){
		password.sendKeys(strPassword);
	}
	//confirm password
	public void setConfirmPassword(String strConfirmPassword){
		confirmpassword.sendKeys(strConfirmPassword);
	}

	//Click on save button
	public void clickSave(){
		save.click();
	}

	//Click on edit button
	public void clickEdit(){
		edit.click();
	}

	//licencenum
	public void setLicenceNum(String strLicenceNum){
		licencenum.sendKeys(strLicenceNum);
	}
	//ssnnum
	public void setSsnNum (String strSsnNum ){
		ssnnum.sendKeys(strSsnNum);
	}
	//nickname
	public void setNickName(String strNickName){
		nickname.sendKeys(strNickName);
	}

	//militaryservice
	public void setMilitaryService(String strMilitaryService){
		militaryservice.sendKeys(strMilitaryService);
	}
	//otherid
	public void setOtherId(String strOtherId){
		otherid.sendKeys(strOtherId);
	}
	//sinnum
	public void setSINnum(String strSINnum){
		sinnum.sendKeys(strSINnum);
	}

	public void AddEmployeeOrangehrm(String strFirstName,String strLastName,String strUserName,String strPassword,String strConfirmPassword,String strLicenceNum,String strSsnNum,String strNickName,String strMilitaryService,String strOtherId,String strSINnum) throws Exception{

		this.clickAdd();
		this.setFirstName(strFirstName);
		this.setLastName(strLastName);
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.setConfirmPassword(strConfirmPassword);
		Thread.sleep(2000);
		this.clickSave();
		Thread.sleep(2000);
		this.clickEdit();
		this.setLicenceNum(strLicenceNum);
		this.setSsnNum(strSsnNum);
		this.setNickName(strNickName);
		this.setMilitaryService(strMilitaryService);
		this.setOtherId(strOtherId);
		this.setSINnum(strSINnum);
		this.clickSave();
	}
}



