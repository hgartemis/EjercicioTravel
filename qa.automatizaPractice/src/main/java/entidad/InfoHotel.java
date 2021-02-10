package entidad;

import org.openqa.selenium.WebElement;

public class InfoHotel {

    private String nombre;
    private float precio;
    private WebElement link;

    public void  InfoHotel(){}

    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setPrecio(float precio){ this.precio = precio;}
    public void setLink(WebElement link){ this.link = link;}

    public String getNombre() {return nombre;}
    public float getPrecio() {return precio;}
    public WebElement getlink() {return link;}
}
