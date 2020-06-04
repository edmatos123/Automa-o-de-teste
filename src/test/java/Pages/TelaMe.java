package Pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaMe extends BasePage {

    public TelaMe(WebDriver navegador) {
        super(navegador);
    }

    public TelaMe clickMoreData(){
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
        return this;
    }

    public TelaMore clickBTNMore(){

        navegador.findElement(By.xpath("//*[@id=\"moredata\"]/div[2]/button")).click();
        return new TelaMore(navegador);
    }


}
