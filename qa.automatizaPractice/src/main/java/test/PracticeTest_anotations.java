package test;

import driver.driver;
import logic.practice.Landing_logic;
import logic.practice.login_logic;
import logic.practice.perfil_logic;
import logic.practice.shoppingSumary_logic;
import logic.practice.shoppingAddress_logic;
import logic.practice.shoppingShipping_logic;
import logic.practice.shoppingPayment_logic;
import logic.practice.perfilHistory_logic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeTest_anotations {

    driver Driver = null;
    Landing_logic paginaPrincipall = null;
    login_logic paginaSignIn = null;
    perfil_logic paginaPerfil = null;

    shoppingSumary_logic paginaSummary = null;
    shoppingAddress_logic paginaAddress = null;
    shoppingShipping_logic paginaShipping = null;
    shoppingPayment_logic paginaPayment = null;
    perfilHistory_logic paginaHistory = null;

    @BeforeClass
    public void  setupEnv() {

        Driver = new driver();
        paginaPrincipall = new Landing_logic(Driver);
        paginaSignIn = new login_logic(Driver);
        paginaPerfil = new perfil_logic(Driver);
        paginaSummary = new shoppingSumary_logic(Driver);
        paginaAddress = new shoppingAddress_logic(Driver);
        paginaPayment = new shoppingPayment_logic(Driver);
        paginaShipping = new shoppingShipping_logic(Driver);
        paginaHistory = new perfilHistory_logic(Driver);

    }

    @Test(priority = 1, testName = "Escenario1")
    public void testEscenario1() throws InterruptedException {


        Driver.goto_url("http://automationpractice.com");

        paginaPrincipall.IrSignIn();
        paginaSignIn.Autenticarse("a240971@a.com", "a12345");
        paginaPerfil.ComprarTShirt("Faded Short Sleeve T-shirts", "3", "M");

        paginaSummary.HacerClickEnCheckout();
        paginaAddress.HacerClickEnCheckout();
        paginaShipping.HacerClickEnShipping();
        paginaPayment.PagarConTarjeta();
        paginaPerfil.confirmarOrden();
        paginaHistory.validarOrden(paginaPayment.GetOrden());

    }

    @AfterClass
    public void teardown() {
        Driver.teardown();
    }
}
