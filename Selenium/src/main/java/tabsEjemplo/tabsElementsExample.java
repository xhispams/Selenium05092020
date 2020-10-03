package tabsEjemplo;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsElementsExample {

	public static void main(String[] args) {
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");//Seteando la propiedad del .exe
        WebDriver driver = new ChromeDriver();//Inicializando el driver
        driver.get("http://demo.guru99.com/popup.php");//Iniciar chrome en la url especificada
        driver.manage().window().maximize(); //maximizar ventana
        
        //Obtener e imprimir el id de la ventana/Tab original
        String originalTab = driver.getWindowHandle(); // guarda la lista 
        System.out.println(originalTab);
        
        //Click en el link ue abre otra ventana
        WebElement clickhere = driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]"));
        clickhere.click();
        
        Set<String> ventanasAbiertas = driver.getWindowHandles();
        System.out.println(ventanasAbiertas);
        
        for (String tabNueva : driver.getWindowHandles()) {
        	if(!originalTab.contentEquals(tabNueva)) { //verificar que sea falso con el operador !
        		driver.switchTo().window(tabNueva);
        		break;
        	}
        }
        
        //Escribir el email en la nueva ventana
        WebElement emailTxt = driver.findElement(By.name("emailid"));
        emailTxt.sendKeys("test@test.com");
        
//        regresar a la ventana riginal
        driver.switchTo().window(originalTab);
        
        driver.close(); //Cierra la ventana actual del driver
        driver.quit(); // Cierra todas las ventanas creadas por el driver
        
        
    	

	}

}
