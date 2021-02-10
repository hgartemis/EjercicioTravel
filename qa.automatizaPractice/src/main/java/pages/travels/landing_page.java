package pages.travels;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//a[contains(text(),'Homepage - Front-End')]")
    WebElement botonTravel;

    public landing_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void IrTravel() {

        //Driver.customWait_clickable(botonTravel);
        botonTravel.click();

    }


}
