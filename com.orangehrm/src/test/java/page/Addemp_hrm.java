package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Addemp_hrm {

	WebDriver driver;

	By addemployee = By.xpath("//*[@id='btnAdd']");
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By createlogindetails = By.xpath("//*[@id='chkLogin']");
	By username = By.name("user_name");
	By password = By.name("user_password");
	By confirmpassword = By.name("re_password");
	By save = By.xpath("//*[@id='btnSave']");
	By edit = By.xpath("//*[@id='btnSave']");
	By licencenum = By.name("personal[txtLicenNo]");
	By ssnnum = By.name("personal[txtNICNo]");
	By nickname = By.name("personal[txtEmpNickName]");
	By militaryservice = By.name("personal[txtMilitarySer]");
	By otherid= By.name("personal[txtOtherID]");
	By sinnum=By.name("personal[txtSINNo]");

	public Addemp_hrm(WebDriver driver){
		this.driver = driver;
	}

	//click add
	public void clickAdd(){
		driver.findElement(addemployee).click();
	}


	//Set first name
	public void setFirstName(String strFirstName){
		driver.findElement(firstname).sendKeys(strFirstName);;
	}

	//Set last name
	public void setLastName(String strLastName){
		driver.findElement(lastname).sendKeys(strLastName);;
	}
	//createlogindetails
	public void clickCreateLoginDetails() throws Exception{
		Thread.sleep(2000);
		driver.findElement(createlogindetails).click();
	}

	//username
	public void setUserName(String strUserName){
		driver.findElement(username).sendKeys(strUserName);
	}
	//password
	public void setPassword(String strPassword){
		driver.findElement(password).sendKeys(strPassword);
	}
	//confirm password
	public void setConfirmPassword(String strConfirmPassword){
		driver.findElement(confirmpassword).sendKeys(strConfirmPassword);
	}

	//Click on save button
	public void clickSave(){
		driver.findElement(save).click();
	}

	//Click on edit button
	public void clickEdit(){
		driver.findElement(edit).click();
	}

	//licencenum
	public void setLicenceNum(String strLicenceNum){
		driver.findElement(licencenum).sendKeys(strLicenceNum);
	}
	//ssnnum
	public void setSsnNum (String strSsnNum ){
		driver.findElement(ssnnum ).sendKeys(strSsnNum);
	}
	//nickname
	public void setNickName(String strNickName){
		driver.findElement(nickname).sendKeys(strNickName);
	}
	//militaryservice
	public void setMilitaryService(String strMilitaryService){
		driver.findElement(militaryservice).sendKeys(strMilitaryService);
	}
	//otherid
	public void setOtherId(String strOtherId){
		driver.findElement(otherid).sendKeys(strOtherId);
	}
	//sinnum
	public void setSINnum(String strSINnum){
		driver.findElement(sinnum).sendKeys(strSINnum);
	}

	public void AddEmployeeOrangehrm(String strFirstName,String strLastName,String strUserName,String strPassword,String strConfirmPassword,String strLicenceNum,String strSsnNum,String strNickName,String strMilitaryService,String strOtherId,String strSINnum) throws Exception{

		this.clickAdd();
		this.setFirstName(strFirstName);
		this.setLastName(strLastName);
		this.clickCreateLoginDetails();
		Thread.sleep(2000);
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.setConfirmPassword(strConfirmPassword);
		Thread.sleep(2000);
		this.clickSave();
		Thread.sleep(2000);
		this.clickEdit();
		Thread.sleep(2000);
		this.setLicenceNum(strLicenceNum);
		this.setSsnNum(strSsnNum);
		this.setNickName(strNickName);
		this.setMilitaryService(strMilitaryService);
		this.setOtherId(strOtherId);
		this.setSINnum(strSINnum);
		this.clickSave();
	}
}