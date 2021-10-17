package support;

import definition.hooks;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class util extends hooks {
    public static WebDriverWait wait;
    public static Alert alert;

    public util() {
        wait = new WebDriverWait(driver,30);
    }

    public void ventanaActiva(){
        Set<String> ids= driver.getWindowHandles();
        for (String id:ids){
           driver.switchTo().window(id);
        }
    }

    public void cerrarVentana(){
        driver.close();
    }

    public void ventanaPrincipal(){
        driver.switchTo().window("");
    }

    public void validacionAlert(String texto){
        alert = driver.switchTo().alert();
        Assert.assertEquals(texto, alert.getText());
        alert.accept();
    }

    public void evidencia() throws IOException {
        Date fecha = new Date();
        SimpleDateFormat nombrefecha = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
        String path="D:\\QAChallenge\\src\\test\\resources\\evidencias\\";
        String nombre=nombrefecha.format(fecha)+"_evidencia.jpg";

        File imagen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(imagen, new File(path+nombre));
    }
}
