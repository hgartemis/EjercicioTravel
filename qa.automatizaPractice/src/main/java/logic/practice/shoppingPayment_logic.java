package logic.practice;

import driver.driver;
import pages.practice.shoppingPayment_page;

public class shoppingPayment_logic {

    driver Driver = null;
    shoppingPayment_page sp = null;
    String ordenPedido = "";

    public void SetOrden(String orden){

        this.ordenPedido = orden.substring(216);
        this.ordenPedido = this.ordenPedido.substring(0, 9);
        System.out.println("Numero orden: " + this.ordenPedido);
    }
    public String GetOrden(){ return this.ordenPedido;  }

    public shoppingPayment_logic(driver driver) {

        this.Driver = driver;
        sp = new shoppingPayment_page(Driver);

    }

    public void PagarConTarjeta() {
        sp.btnPayBank();
        sp.btnConfirm();
        SetOrden(sp.obtenerReferencia());


    }

    public String obtenerReferencia()
    {
        return sp.obtenerReferencia();
    }
}
