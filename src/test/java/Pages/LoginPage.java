package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador){
        super(navegador);
    }

    public LoginInformPage clickSignIn (){
        //Abrir a tela de Login
        navegador.findElement(By.linkText("Sign in")).click();

        return new LoginInformPage(navegador);
    }


}
