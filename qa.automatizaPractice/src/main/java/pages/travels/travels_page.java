package pages.travels;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class travels_page {

    public driver Driver = null;
    public WebDriver driver = null;

    // //*[@id='s2id_autogen16']
    //@FindBy(xpath = "//*[@id='s2id_autogen16']/a/span[1]")
    @FindBy(xpath = "//*[@id='s2id_autogen16']")
    WebElement inputDestino;

    @FindBy(xpath = "//*[@id='select2-drop']/div/input")
    WebElement inputDestino1;

    @FindBy(id = "checkin")
    WebElement fechaCheckIn;

    @FindBy(id = "checkout")
    WebElement fechaCheckOut;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]")
    WebElement btnAsignaAdult;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[2]")
    WebElement btnRestaAdult;

    @FindBy(name = "adults")
    WebElement totalAdult;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]")
    WebElement btnAsignaNinos;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[4]/button")
    WebElement btnBusqueda;

    @FindBy(xpath = "//*[@id='select2-drop']/ul/li[1]/ul/li[2]/div")
    WebElement selTrial;

    public travels_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setDestino() throws InterruptedException {

        //System.out.println("Selecciono la caja");
        Driver.explicitWait(inputDestino);
        Actions action = new Actions(Driver.returnDriver());
        action.moveToElement(inputDestino).click().build().perform();
    }

    public void setDestino1(String buscar) throws InterruptedException {

        Driver.implicitWaitEspecial();
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(selTrial).click().build().perform();

        //builder.moveToElement(inputDestino1).sendKeys(buscar).build().perform();
        //inputDestino1.clear();
        //inputDestino1.sendKeys(buscar);
        //builder.moveToElement(inputDestino1).sendKeys(Keys.ENTER);

    }

    public void setCheckIn(String fechaIn) throws InterruptedException {

        Driver.explicitWait(fechaCheckIn);
        Actions action = new Actions(Driver.returnDriver());
        action.moveToElement(fechaCheckIn).click().perform();

        Driver.implicitWaitEspecial();
        fechaCheckIn.clear();
        fechaCheckIn.sendKeys(fechaIn);
    }

    public void setCheckOut(String fechaOut) throws InterruptedException {

        Driver.explicitWait(fechaCheckOut);
        Actions action = new Actions(Driver.returnDriver());
        action.moveToElement(fechaCheckOut).click().perform();

        Driver.implicitWaitEspecial();
        fechaCheckOut.clear();
        fechaCheckOut.sendKeys(fechaOut);
    }

    public void setCantidadAdulto(Integer cantidad)
    {

        btnRestaAdult.click();
        btnRestaAdult.click();

        for (int i=0; i<cantidad; i++)
        {
            //btnAsignaAdult.click();
        }
    }

    public void setCantidadNino(Integer cantidad)
    {
        for (int i = 1; i<cantidad; i++)
        {
            btnAsignaNinos.click();
        }
    }

    public void botonBusqueda()
    {
        btnBusqueda.click();
    }

}
