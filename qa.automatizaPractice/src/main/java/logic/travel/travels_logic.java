package logic.travel;

import driver.driver;
import pages.practice.landing_page;
import pages.travels.travels_page;

public class travels_logic {

    driver Driver = null;
    travels_page paginaTravels = null;

    public travels_logic(driver driver) {

        this.Driver = driver;
        paginaTravels = new travels_page(Driver);

    }

    public void BusquedaDestino(String destino, String fechaInicio, String fechaFinal, Integer adultos, Integer ninos) throws InterruptedException {

        Driver.scroll(500);

        paginaTravels.setDestino();
        paginaTravels.setDestino1(destino);

        paginaTravels.setCheckIn(fechaInicio);
        paginaTravels.setCheckOut(fechaFinal);
        paginaTravels.setCantidadAdulto(adultos);
        paginaTravels.botonBusqueda();

    }

}
