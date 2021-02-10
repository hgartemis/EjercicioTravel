package pages.practice;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class perfil_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "search_query_top")
    WebElement search;

    @FindBy(id = "submit_search")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[1]/a/i")
    WebElement btnHistory;

    @FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a/b")
    WebElement btnCart;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    WebElement btnPerfilUser;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    WebElement btnSignOut;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement btnImagen;

    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span")
    WebElement btnSelect;

    @FindBy(id = "quantity_wanted")
    WebElement idCantidad;

    @FindBy(xpath = "//*[@id='quantity_wanted_p']/a[2]/span")
    WebElement btnCantidad;

    @FindBy(id = "group_1")
    WebElement cboSize;

    @FindBy(xpath = "//*[@id='add_to_cart']/button/span")
    WebElement btnAddCart;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")
    WebElement btnContinueShopp;

    @FindBy(xpath = "//*[@id='columns']/div[1]/a[1]")
    WebElement btnHome;

    public perfil_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setSearch(String idSearch){

        Driver.implicitwait();
        search.sendKeys(idSearch);
    }

    public void btnSearch() {

        search.sendKeys(Keys.ENTER);
        //btnSearch.click();

    }

    public void btnHistory(){

        Driver.implicitwait();
        btnHistory.click();

    }

    public void btnCart(){

        Driver.implicitwait();
        btnCart.click();

    }

    public void btnPerfilUser(){
        btnPerfilUser.click();
    }

    public void btnSignOut(){
        btnSignOut.click();
    }

    public void btnSelect() throws InterruptedException {

        Driver.scroll(600);
        Actions action = new Actions(Driver.returnDriver());
        action.moveToElement(btnImagen).build().perform();

        Thread.sleep(4000);
        btnSelect.click();

    }

    public void setCantidad(String cant)
    {
        idCantidad.clear();
        idCantidad.sendKeys(cant);
    }

    public void setSize(String size)
    {
        cboSize.sendKeys(size);
    }

    public void btnAddCart()
    {
        Driver.implicitwait();
        btnAddCart.click();
    }

    public void btnContinueShopp()
    {
        Driver.implicitwait();
        btnContinueShopp.click();
    }

    public void btnHome()
    {
        Driver.implicitwait();
        btnHome.click();
    }


}
