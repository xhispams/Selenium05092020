package implicitwait;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class esperaimplicita {

	public static void main(String[] args) {
		
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");//Seteando la propiedad del .exe
        WebDriver driver = new ChromeDriver();//Inicializando el driver
        driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la url especificada
        driver.manage().window().maximize(); //maximizar ventana
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
//        Obtener objetos/elementos de la pagina de login
//        WebElement txtUserName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
//        		driver.findElement(By.id("txtUsername"));
        
//        Esperar 20 segundos y que verifique cada 2 segundos
        
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	        .withTimeout(Duration.ofSeconds(60))
    	        .pollingEvery(Duration.ofSeconds(5))
    	        .ignoring(NoSuchElementException.class);//Esto es lo que ignora nuestro WAIT durante 60 segundos

    	      WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {
    	    	  public WebElement apply(WebDriver driver) {
    	    		driver.navigate().refresh();
    	    	    return driver.findElement(By.id("txtUsername"));
    	    	  }
    	    	});
//        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
//        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
       
////        Haciendo login
//        txtUserName.sendKeys("Admin");
//        Thread.sleep(3000);
//        txtPassword.sendKeys("admin123");
//        Thread.sleep(5000);
//        btnLogin.click();
////        String forgotPwdMsj = driver.findElement(By.xpath("//*[@id='forgotPasswordLink']/a")).getText();
//


	}

}
