package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softasserts {
	
	SoftAssert	softAssert = new SoftAssert();
	
  @Test
//  public void softAssertEquals() {
//	  int a = 588;
//	  int b = 10;
//	  int x = 723;
//	  int y = 80;
//	  
//	  softAssert.assertEquals(a,b);
//	  softAssert.assertEquals(x,y);
//	  
//	  softAssert.assertAll();
  public void vsoftAssertDriver(){
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
      System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");//Seteando la propiedad del .exe
      WebDriver driver = new ChromeDriver();//Inicializando el driver
      driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la url especificada
      driver.manage().window().maximize(); //maximizar ventana
      
      String actualTitle = driver.getTitle();
      String expectedTitle = "OrangeHRM";
      String badTitle = "Orange";
      
      softAssert.assertEquals(actualTitle, expectedTitle);
      softAssert.assertEquals(actualTitle, badTitle);
      softAssert.assertAll();
  }
}
