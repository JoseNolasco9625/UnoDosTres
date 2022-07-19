package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element_Payment
{
    //Se identifica un elemento para validar que se llego a pantalla de Pago
    public By byresumenCompra = By.cssSelector("div[class='summary-message-top']");
    public WebElement resumenCompra (WebDriver driver)
    {
        WebElement resumencompra = driver.findElement(byresumenCompra);
        return resumencompra;
    }

    //Se identifica el elemento de Tarjeta
    public By byTarjeta = By.cssSelector("p[data-qa='tarjeta-tab']");
    public WebElement Tarjeta (WebDriver driver)
    {
        WebElement tarjeta = driver.findElement(byTarjeta);
        return tarjeta;
    }

    //Se identifica RadioBoton Usar nueva tarjeta
    public By bynuevaTarjeta = By.xpath("//tr[@id='radio-n']");
    public WebElement NuevaTarjeta (WebDriver driver)
    {
        WebElement nuevatarjeta = driver.findElement(bynuevaTarjeta);
        return nuevatarjeta;
    }

    //Se identifica campo para ingresar nuemro de tarjeta
    public By bynoTarjeta = By.xpath("//input[@id='cardnumberunique']");
    public WebElement noTarjeta (WebDriver driver)
    {
        WebElement notarjeta = driver.findElement(bynoTarjeta);
        return notarjeta;
    }

    //Se identifica el campo para ingresar el mes de expiracion
    public By bymesExp = By.xpath("//input[@data-qa='mes-input']");
    public WebElement mesExp (WebDriver driver)
    {
        WebElement mesExp = driver.findElement(bymesExp);
        return mesExp;
    }

    //Se identifica el campo para ingresar el año de expiracion
    public By byAnio = By.xpath("//input[@data-qa='expyear-input']");
    public WebElement Anio (WebDriver driver)
    {
        WebElement anio = driver.findElement(byAnio);
        return anio;
    }

    //Se indentifica el campo para ingresar CVV
    public By byCvv = By.xpath("//input[@data-qa='cvv-input']");
    public WebElement CVV (WebDriver driver)
    {
        WebElement cvv = driver.findElement(byCvv);
        return cvv;
    }

    //Se identifica el campo del correo
    public By byCorreo = By.xpath("//input[@class='form-control email preventChromeAutofill']");
    public WebElement Correo (WebDriver driver)
    {
        WebElement correo = driver.findElement(byCorreo);
        return correo;
    }

    //Se identifica Boton Pagar con Tarjeta
    public By byBottonPagar = By.xpath("//button[@class='buttonPayment pay4 limit PulsiIndicator']");
    public WebElement bottonPagar (WebDriver driver)
    {
        WebElement bottonpagar = driver.findElement(byBottonPagar);
        return bottonpagar;
    }

    //Se identifica campo correo electronico/telefono movil
    public By bycorreoTelefono = By.id("usrname");
    public WebElement correoTelefono (WebDriver driver)
    {
        WebElement correotelefono = driver.findElement(bycorreoTelefono);
        return  correotelefono;
    }

    //Se indetifica campo contraseña para validar recarga
    public By bypwd = By.xpath("//input[@class='form-control' and @id='psw']");
    public WebElement Pwd (WebDriver driver)
    {
        WebElement pwd = driver.findElement(bypwd);
        return pwd;
    }

    //Se identifica el captcha
    public By byCaptcha = By.xpath("//html/body/div[2]/div[3]/div[1]/div/div/span/div[1]");
    public WebElement Captcha (WebDriver driver)
    {
        WebElement captcha = driver.findElement(byCaptcha);
        return captcha;
    }

    //Se identifica el boton Acceso
    public By byAcceso = By.id("loginBtn");
    public WebElement Acceso (WebDriver driver)
    {
        WebElement acceso = driver.findElement(byAcceso);
        return acceso;
    }
}

