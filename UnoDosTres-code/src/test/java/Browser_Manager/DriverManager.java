package Browser_Manager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager
{
    protected WebDriver driver;

    protected abstract void createDriver();

    public void quitDriver ()
    {
        if (driver != null)
        {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver()
    {
        if (driver == null)
        {
            createDriver();
        }
        return driver;
    }
}
