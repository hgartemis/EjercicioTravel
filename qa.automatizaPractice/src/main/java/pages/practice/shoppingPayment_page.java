package pages.practice;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingPayment_page {

    public driver Driver = null;
    public WebDriver driver = null;

    public String strReferencia = "";

    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    WebElement btnPayBank;

    @FindBy(xpath = "//*[@id='cart_navigation']/button/span")
    WebElement btnConfirm;

    @FindBy(xpath = "//*[@id='center_column']/div")
    WebElement referencia;

    public shoppingPayment_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void btnPayBank() {
        btnPayBank.click();
    }

    public void btnConfirm() {
        btnConfirm.click();
    }

    public String obtenerReferencia()
    {
        strReferencia = referencia.getText();
        //System.out.println("referencia: " + strReferencia);
        return strReferencia;
    }

}
