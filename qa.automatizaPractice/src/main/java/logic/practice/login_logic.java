package logic.practice;

import driver.driver;
import pages.practice.login_page;

public class login_logic {

    driver Driver = null;
    login_page lp = null;

    public login_logic(driver driver) {

        this.Driver = driver;
        lp = new login_page(Driver);

    }

    public void Autenticarse(String idEmail, String idPasswd) {

        lp.setEmail(idEmail);
        lp.setPassword(idPasswd);
        lp.btnSignIn();

    }

}
