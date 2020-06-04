package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TelaMore extends BasePage{
    public TelaMore(WebDriver navegador) {
        super(navegador);
    }

    public TelaMore EscolherTipo(String tipo){
        WebElement campoType = navegador.findElement(By.id("addmoredata")).findElement(By.name("type"));
        new Select(campoType).selectByVisibleText(tipo);
        return this;
    }

    public TelaMore InsertContact(String contato){
        navegador.findElement(By.xpath("//*[@id=\"addmoredata\"]/div[1]/div[3]/div/input")).sendKeys(contato);
        return this;
    }

    public TelaMe ClickSave(){
        navegador.findElement(By.xpath("//*[@id=\"addmoredata\"]/div[2]/a")).click();
        return new TelaMe(navegador);
    }




}
