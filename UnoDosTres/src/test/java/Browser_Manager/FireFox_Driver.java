package Browser_Manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Driver extends DriverManager
{
    @Override
    public void createDriver ()
    {
        System.setProperty("webdriver.gecko.driver" , "src/main/resources/Drivers/geckodriver.exe");

        driver = new FirefoxDriver();
    }

}
