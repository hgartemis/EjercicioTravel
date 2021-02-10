package logic.practice;

import driver.driver;
import pages.practice.perfilHistory_page;

import java.util.ArrayList;

public class perfilHistory_logic {

    driver Driver = null;
    perfilHistory_page pp = null;

    ArrayList<String> ordenes = null;

    public perfilHistory_logic(driver driver) {

        this.Driver = driver;
        pp = new perfilHistory_page(Driver);

    }

    public ArrayList<String> listaOrdenes(){
     return pp.listaOrdenes();
    }

    public void validarOrden(String orden)
    {
        ordenes = pp.listaOrdenes();
        if (ordenes.contains(orden))
            System.out.println("Orden " + orden + " esta en on backover");
        else
            System.out.println("Orden NO EXISTE");
    }

}
