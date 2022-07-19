package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Utils
{
    WebDriver driver;
    //Para ingresar texto
    public void InputFill (WebElement input, String data)

    {
        input.sendKeys(data);
    }

    //Para realizar scroll a la pantalla
    public void scroll ()
    {

    }

}
