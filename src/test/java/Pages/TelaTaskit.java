package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaTaskit extends BasePage{

    public TelaTaskit(WebDriver navegador){
        super(navegador);
    }

   public TelaMe ClickMe(){

        navegador.findElement(By.linkText("Hi, Julio")).click();
        return new TelaMe(navegador);
    }



}
