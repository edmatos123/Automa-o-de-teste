package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInformPage extends BasePage{

    public LoginInformPage(WebDriver navegador){
        super(navegador);
    }

    public LoginInformPage typeLogin(String login){
        //Preencher os campos (julio0001) Senha (123456)
        navegador.findElement(By.xpath("//*[@id='signinbox']/div[1]/form/div[2]/div[1]/input")).sendKeys(login);
        return this;
    }

    public LoginInformPage typePassword(String senha){
        navegador.findElement(By.xpath("//*[@id='signinbox']/div[1]/form/div[2]/div[2]/input")).sendKeys(senha);
        return this;
    }

    public TelaTaskit clickSignIn(){
        navegador.findElement(By.xpath("//*[@id='signinbox']/div[2]/a")).click();
        return new TelaTaskit(navegador);
    }


}
