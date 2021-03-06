package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Curso Septiembre 05.09.2020" );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");//Seteando la propiedad del .exe
        WebDriver driver = new ChromeDriver();//Inicializando el driver
        driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la url especificada
        driver.manage().window().maximize(); //maximizar ventana
       
//        Obtener objetos/elementos de la pagina de login
        WebElement txtUserName = driver.findElement(By.id("txtUsername"));
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
       
//        Haciendo login
        txtUserName.sendKeys("Admin");
        Thread.sleep(3000);
        txtPassword.sendKeys("admin123");
        Thread.sleep(5000);
        btnLogin.click();
//        String forgotPwdMsj = driver.findElement(By.xpath("//*[@id='forgotPasswordLink']/a")).getText();


        
//        Validación de Home Page
        String urlDashboard = driver.getCurrentUrl();
        System.out.println("URL : "+ urlDashboard);
        urlDashboard.contains("/dashborad");//Compara que contenga /dashboard
        
        
//        findElements
        List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
        System.out.println("úmero de elementos: " + firstLevelMenu.size());
        String primerMenu = firstLevelMenu.get(0).getText();
        System.out.println(primerMenu);
        String segundoMenu = firstLevelMenu.get(1).getText();
        System.out.println(segundoMenu);
        
        	for(int i = 0; i<firstLevelMenu.size();i++) {
        		System.out.println("Los Menú son: "+firstLevelMenu.get(i).getText());
        		
        	}
        
        
//        Métodos de Navegación
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
        
        String title = driver.getTitle();
        System.out.println("Title is: "+title);
        title.contains("");
        
//       Click Assignleavebtn
        WebElement assignLevaBtn = driver.findElement(By.className("quickLinkText"));
        assignLevaBtn.click();
        Thread.sleep(3000);
        
//        Obtener Text de un WebElement
        String welcomeMsj = driver.findElement(By.id("welcome")).getText();
        boolean verifyWelcomeMsj = welcomeMsj.contains("Smith");
//        boolean verifyWelcomeMsj = welcomeMsj.contains("Alvaro");
        if(verifyWelcomeMsj) {
        	System.out.println("El mensaje contiene el nombre Smith");
        }else {
        	System.out.println("El mensaje no contiene el nombre Smith");
        }
        
//        Dropdowns
        Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
        oSelect.selectByVisibleText("Maternity US");
        
//        directorio, name Robert, jobtitle Sales Manager,location eeuu, click en search, que se imprima el nombre completo de la persona
//        Ejercicio

//        1. log in en OrangeHR
//        2. Click en Directory
//        3. Buscar por "Robert"
//        4. Job title: "Sales Manager"
//        5. Location: "Unided States"
//        6. Click Search
//        Verificar el nombre completo de la persona
//        Cerrar Navedagor
        
        driver.close(); //Cierra la ventana actual del driver
        driver.quit(); // Cierra todas las ventanas creadas por el driver
        
        
    	

    	
    	



    	
    	
    	
    }
}
