package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Resource\\Driver\\chromedriver.exe");
        WebDriver Navegador = new ChromeDriver();
        Navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Navegador.get("http://www.juliodelima.com.br/taskit");


        return Navegador;
    }

}
