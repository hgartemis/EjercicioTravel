package logic.practice;

import driver.driver;
import pages.practice.shoppingSumary_page;

public class shoppingSumary_logic {

    driver Driver = null;
    shoppingSumary_page ss = null;

    public shoppingSumary_logic(driver driver) {

        this.Driver = driver;
        ss = new shoppingSumary_page(Driver);

    }

    public  void HacerClickEnCheckout()
    {
        ss.btnNext();

    }

}
