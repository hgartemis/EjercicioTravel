package logic.practice;

import driver.driver;
import pages.practice.perfil_page;

public class perfil_logic {

    driver Driver = null;
    perfil_page pp = null;

    public perfil_logic(driver driver) {

        this.Driver = driver;
        pp = new perfil_page(Driver);

    }

    public void ComprarTShirt(String idSearch, String cantidad, String size) throws InterruptedException {

        pp.setSearch(idSearch);
        pp.btnSearch();
        pp.btnSelect();
        pp.setCantidad(cantidad);
        pp.setSize(size);
        pp.btnAddCart();
        pp.btnContinueShopp();
        pp.btnHome();
        pp.btnCart();

    }

    public void confirmarOrden()
    {
        pp.btnPerfilUser();
        pp.btnHistory();

    }

    public void IrHistory()
    {
        pp.btnHistory();
    }

    public  void IrCart()
    {
        pp.btnCart();
    }

    public  void IrPerfilUser()
    {
        pp.btnPerfilUser();
    }

    public  void IrSignOut()
    {
        pp.btnSignOut();
    }

}
