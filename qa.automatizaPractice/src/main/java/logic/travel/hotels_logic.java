package logic.travel;

import driver.driver;
import entidad.InfoHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.travels.hotels_page;

import javax.sound.sampled.Line;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class hotels_logic {

    driver Driver = null;
    hotels_page paginaHotels = null;
    InfoHotel entidad = null;

    public hotels_logic(driver driver) {
        this.Driver = driver;
        paginaHotels = new hotels_page(Driver);
    }



    public void ElegirHabitacionBarata()
    {

        Driver.scroll(1800);
        List<WebElement> lista = paginaHotels.habitaciones();
        ArrayList<String> precio = new ArrayList<String>();

        for (int i = 0; i < lista.size(); i++) {
            WebElement item = lista.get(i).findElement(By.cssSelector("span[class='number text-secondary']"));
            precio.add(item.getText().substring(1));
            //System.out.println(precio);
        }

        Collections.sort(precio);
        String preciobajo = precio.get(0);
        //System.out.println(preciobajo);

        for (int i = 0; i < lista.size(); i++) {
            WebElement item = lista.get(i).findElement(By.cssSelector("span[class='number text-secondary']"));
            if (preciobajo.equals(item.getText().substring(1)))
            {
                WebElement check1 = lista.get(i).findElement(By.tagName("label"));
                check1.click();
                //System.out.println("data2" + check1.getText());

            }
        }

        Driver.scroll(4300);
        paginaHotels.btnComentario();
        paginaHotels.setFullName("Humberto");
        paginaHotels.setEnail("hgartemis@hotmail.com");
        paginaHotels.setComentario("La limpieza es buenaza.!");
        paginaHotels.setClean("6");
        paginaHotels.setFacilities("8");

        paginaHotels.btnComentario();

    }

}

