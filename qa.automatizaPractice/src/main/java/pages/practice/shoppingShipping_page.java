package pages.practice;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingShipping_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "cgv")
    WebElement chkTerms;

    @FindBy(xpath = "//*[@id='form']/p/button/span")
    WebElement btnNext;

    public shoppingShipping_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void chkTerm() {

        chkTerms.click();

    }

    public void btnNext() {

        btnNext.click();

    }

}
