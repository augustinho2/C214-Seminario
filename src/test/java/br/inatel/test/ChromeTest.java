package br.inatel.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        //fecha as abas do browser e finaliza as instancias
        driver.quit();
    }

    @Test
    public void testPesquisaGoogle() {

        driver.get("https://google.com");

        //espera até que o titulo exista para continuar executando
        wait.until(ExpectedConditions.titleIs("Google"));

        // input do google
        WebElement elementSearch = driver.findElement(By.xpath("//div[@class='a4bIc']//input[contains(@class, 'gLFyf')][@type='text']"));
        elementSearch.click();

        // passa pesquisa para input e dá enter
        elementSearch.sendKeys("g1", Keys.ENTER);

        // encontra o link para o g1
        WebElement elementLink = driver.findElement(By.xpath("//a[@href='https://g1.globo.com/']"));
        // espera ate que o link seja "clicável"
        wait.until(ExpectedConditions.elementToBeClickable(elementLink));
        elementLink.click();

        // espera ate que elemento seja visivel
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
    }
}
