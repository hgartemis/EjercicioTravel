package logic.travel;

import driver.driver;
import pages.travels.landing_page;

public class Landing_logic {

    driver Driver = null;
    landing_page paginaInicial = null;

    public Landing_logic(driver driver) {

        this.Driver = driver;
        paginaInicial = new landing_page(Driver);

    }

    public void IrTravel() {

        paginaInicial.IrTravel();

    }

}
