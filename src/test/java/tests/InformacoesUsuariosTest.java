package tests;

import Pages.LoginPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jfree.data.time.Second;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Web;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class InformacoesUsuariosTest {

    private WebDriver navegador;
    WebElement interacao, verificao;

    @Before
    public void setUp (){
        navegador = Web.createChrome();
    }

    @Test
    public void Interacao (){
        String  msgCadastro = new LoginPage(navegador)
                          .clickSignIn()
                          .typeLogin("julio0001")
                          .typePassword("123456")
                          .clickSignIn()
                          .ClickMe()
                          .clickMoreData()
                          .clickBTNMore()
                          .EscolherTipo("Phone")
                          .InsertContact("+551155944847")
                          .ClickSave()
                          .CapturarTextoToast();

        assertEquals("Your contact has been added!",msgCadastro);
    }

    @After
    public void tearDown (){
     navegador.quit();
    }

}
