package pages.practice;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement passwd;

    @FindBy(id = "SubmitLogin")
    WebElement btnSignIn;

    public login_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setEmail(String idEmail){

        Driver.implicitwait();
        email.sendKeys(idEmail);
    }

    public void setPassword(String idPasswd){

        Driver.implicitwait();
        passwd.sendKeys(idPasswd);

    }

    public void btnSignIn() {
        btnSignIn.click();
    }


}
