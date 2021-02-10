package pages.practice;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingAddress_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='center_column']/form/p/button/span")
    WebElement btnNext;

    public shoppingAddress_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void btnNext() {

        btnNext.click();

    }

}
