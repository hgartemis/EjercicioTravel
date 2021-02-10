package pages.practice;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class perfilHistory_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "order-list")
    WebElement listOrdenes;

   public perfilHistory_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public ArrayList<String> listaOrdenes()
    {
        List<WebElement> TableRows = listOrdenes.findElements(By.tagName("tr"));
        ArrayList<String> ordenes = new ArrayList<String>();
        String fila = "";

        for (int i = 1; i<TableRows.size(); ++i)
        {
            fila = TableRows.get(i).getText().substring(0,9);
            //System.out.println("filas : " + fila);
            ordenes.add(fila);
        }

        return ordenes;
    }

}
