package pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_hrm {

	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	WebDriver driver;
	@FindBy(name="txtUsername")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;


	@FindBy(name="Submit")
	WebElement login;

	public Login_hrm(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	public void login(String user_name,String pass_word) throws Exception{
		username.clear();
		password.clear();
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);

	}
	public void login_excelvalid(String user_name,String pass_word) throws Exception{
		username.clear();
		password.clear();
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);

	}
	public void login_excelinvalid(String user_name,String pass_word) throws Exception{
		username.clear();
		password.clear();
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);

	}

}