package logic.practice;

import driver.driver;
import pages.practice.shoppingAddress_page;

public class shoppingAddress_logic {

    driver Driver = null;
    shoppingAddress_page sa = null;

    public shoppingAddress_logic(driver driver) {

        this.Driver = driver;
        sa = new shoppingAddress_page(Driver);

    }

    public void HacerClickEnCheckout()
    {
        sa.btnNext();

    }

}
