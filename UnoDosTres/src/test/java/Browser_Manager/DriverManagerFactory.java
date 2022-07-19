package Browser_Manager;

public class DriverManagerFactory
{
    public static DriverManager getManager (DriverType type)
    {
        DriverManager driverManager = null;
        switch (type)
        {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            case MOZILLA:
                driverManager = new FireFox_Driver();
                break;

            default:
                System.out.println("Invalid Browser Select");
                break;
        }
        return driverManager;
    }
}
