package pages.travels;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class hotels_page {

    public driver Driver = null;

    @FindBy(className = "text-secondary")
    WebElement precios;

    @FindBy(className = "product-grid-item")
    WebElement hoteles;

    @FindBy(css = "div[class='room-item']")
    WebElement room;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div[5]/div[2]/button")
    WebElement btnReview;

    @FindBy(name = "fullname")
    WebElement inputFullName;

    @FindBy(name = "email")
    WebElement inputEmail;

    @FindBy(name = "reviews_comments")
    WebElement inputComentario;

    @FindBy(id = "29")
    WebElement btnSubmit;

    @FindBy(name = "reviews_clean")
    WebElement cboClean;

    @FindBy(name = "reviews_facilities")
    WebElement cboFacilities;

    public hotels_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public List<WebElement> hoteles() {

        //List<WebElement> hotel = Driver.returnDriver().findElements(By.className("product-grid-item"));
        List<WebElement> hotel = Driver.returnDriver().findElements(By.className("room-item"));
        //
        return hotel;
        //Driver.customWait_clickable(botonTravel);
        //botonTravel.click();

    }

    public List<WebElement> habitaciones() {

        List<WebElement> habitaciones = Driver.returnDriver().findElements(By.cssSelector("div[class='room-item']"));

        return habitaciones;

    }

    public void btnComentario(){
        Driver.implicitwait();
        btnReview.click();
    }

    public void setFullName(String nombre) {
        inputFullName.sendKeys(nombre);
    }

    public void setEnail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setComentario(String comentario) {
        inputComentario.sendKeys(comentario);
    }

    public void setClean(String clean) {

        Select cl = new Select(cboClean);
        cl.selectByValue(clean);

    }

    public void setFacilities(String facilities) {
        Select fac = new Select(cboFacilities);
        fac.selectByValue(facilities);
    }

    public void btnSubmit(){
        btnSubmit.click();
    }
}
