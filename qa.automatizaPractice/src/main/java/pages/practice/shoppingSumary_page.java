package pages.practice;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingSumary_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
    WebElement btnNext;

    public shoppingSumary_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void btnNext() {

        btnNext.click();

    }

}
