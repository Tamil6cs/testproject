package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_hrm {
	WebDriver driver;
//	By username = By.name("txtUsername");
//	By password = By.id("txtPassword");
//	By login = By.name("Submit");

	public Login_hrm(WebDriver driver){
		this.driver = driver;
	}
	//Set username
	public void setUserName(String strUserName){
		driver.findElement(username).sendKeys(strUserName);
	}

	//Set password
	public void setPassword(String strPassword){
		driver.findElement(password).sendKeys(strPassword);
	}

	//Click on login button
	public void clickLogin(){
		driver.findElement(login).click();
	}


	public void loginToOrangehrm(String strUserName,String strPasword) throws Exception{
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin();


	}
}




