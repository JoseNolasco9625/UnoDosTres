package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element_Home
{
    //Se identifica campo de operador
    public By bymobileOperador = By.cssSelector("input[suggest='mobile-operator']");
    public WebElement Mobileoperador (WebDriver driver)
    {
        WebElement mobileoperator = driver.findElement(bymobileOperador);
        return mobileoperator;
    }
    //Se identifica el operador
    public By byOperador = By.cssSelector("li[data-name='telcel']");
    public WebElement Operador (WebDriver driver)
    {
        WebElement operador = driver.findElement(byOperador);
        return operador;
    }

    //Se identifica campo para ingresar numero telefonico
    public By bymobileNumber = By.cssSelector("input[suggestmobile='mobile-numbers']");
    public WebElement mobileNumber (WebDriver driver)
    {
        WebElement mobilenumber = driver.findElement(bymobileNumber);
        return mobilenumber;
    }

    //Se identifica campo Monto de recarga
    public By bymontoRecarga = By.cssSelector("input[suggest='mobile-operator_amount']");
    public WebElement montoRecarga (WebDriver driver)
    {
        WebElement montorecarga = driver.findElement(bymontoRecarga);
        return montorecarga;
    }

    //Se identifica tipo de recarga Recarga Saldo
    public By bytipoRecarga = By.cssSelector("div[for='cat1']");
    public WebElement tipoRecarga (WebDriver driver)
    {
        WebElement tiporecarga = driver.findElement(bytipoRecarga);
        return tiporecarga;
    }

    //Se identifica monto de recarga
    public By byRecarga10 = By.cssSelector("li[data-show='$10 (Recarga Saldo)']");
    public WebElement Recarga10 (WebDriver driver)
    {
        WebElement recarga = driver.findElement(byRecarga10);
        return  recarga;
    }

    //Se identifica boton siguiente
    public By byBottonSiguiente = By.cssSelector("button[data-qa='celular-pay']");
    public WebElement Siguiente (WebDriver driver)
    {
        WebElement siguiente = driver.findElement(byBottonSiguiente);
        return  siguiente;
    }


}
