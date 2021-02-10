package pages.practice;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signIn;

    public landing_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void SignIn() {

        Driver.customWait_clickable(signIn);
        signIn.sendKeys(Keys.ENTER);

    }


}
