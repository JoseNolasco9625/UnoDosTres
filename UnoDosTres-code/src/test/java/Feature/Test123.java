package Feature;

import Common.BaseTest_123;
import Common.Config;
import Elements.Element_Home;
import Elements.Element_Payment;
import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test123 extends BaseTest_123
{
    Utils utils = new Utils();
    Element_Home element_home = new Element_Home();
    Element_Payment element_payment = new Element_Payment();

    @Test
    public void testHome ()
    {

        //Se ingresa el numero
        utils.InputFill(element_home.mobileNumber(driver), Config.numTel);

        //Seleccionar operador
        element_home.Mobileoperador(driver).click();
        element_home.Operador(driver).click();

        //Se ingresa el monto
        element_home.montoRecarga(driver).click();
        element_home.tipoRecarga(driver).click();
        element_home.Recarga10(driver).click();


        //Se selecciona boton Siguiente
        element_home.Siguiente(driver).click();

        //Se valida que paso a la siguiente pantalla (pantalla de pago)
        Assert.assertTrue(element_payment.resumenCompra(driver).isDisplayed());

    }

    @Test
    public void testPayment () throws InterruptedException
    {
        //Se selecciona Tarjeta
        WebDriverWait wait = new WebDriverWait(driver , 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(element_payment.byresumenCompra));
        element_payment.Tarjeta(driver).click();

        //Se Selecciona Nueva Tarjeta
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(element_payment.bynuevaTarjeta)).click();

        //Se ingresa el numero de la tarjeta
        utils.InputFill(element_payment.noTarjeta(driver), Config.Tarjeta);

        //Se ingresa el mes
        utils.InputFill(element_payment.mesExp(driver), Config.mesExp);

        //Se ingresa el año
        utils.InputFill(element_payment.Anio(driver), Config.Anio);

        //Se ingresa el CVV
        utils.InputFill(element_payment.CVV(driver), Config.CVV);

        //Se ingresa el correo
        utils.InputFill(element_payment.Correo(driver), Config.emailID);

        //Se da clic en el botón Pagar con Tarjeta
        element_payment.bottonPagar(driver).click();

        //Se ingresa el correo
        utils.InputFill(element_payment.correoTelefono(driver), Config.user);

        //Se introduce la contraseña
        utils.InputFill(element_payment.Pwd(driver), Config.pass);
        //Se selecciona el captcha
        new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.rc-anchor-content"))).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        //Se realiza scroll para visualizar el botón Acceso
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,550)");
        //Se Da clic en botón acceso
        element_payment.Acceso(driver).click();
        Thread.sleep(31000);

    }
}

