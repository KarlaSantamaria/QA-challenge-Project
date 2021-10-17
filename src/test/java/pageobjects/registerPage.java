package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class registerPage extends util {
    //Email

    @FindBy(xpath = "//*[@id=\"email\"]") protected WebElement txtEmail;
    @FindBy(xpath = "//input[@placeholder='email']") protected WebElement txtPlaEmail;
    @FindBy(xpath = "//*[@id=\"msg\"]") protected WebElement lblMensajeEmail;

    //Contraseña
    @FindBy(xpath = "//*[@id=\"password\"]") protected WebElement txtPassword;
    @FindBy(xpath = "//input[@placeholder='password']") protected WebElement txtPlaPassword;
    @FindBy(xpath = "//*[@id=\"msg\"]") protected WebElement lblMensajePassword;

    //Boton Register
    @FindBy(xpath = "//*[@id=\"register\"]") protected WebElement btnRegister;
    @FindBy(xpath = "//*[@id=\"msg\"]") protected WebElement lblMensaje;

    //Boton Login

    @FindBy(xpath = "//*[@id=\"login\"]") protected WebElement btnLogin;

    public registerPage() {
        PageFactory.initElements(driver, this);
    }

   //EMAIL

    public void clickEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(txtEmail));
        txtEmail.click();
    }

    public String ObtenerphEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(txtPlaEmail));
        return txtPlaEmail.getAttribute("placeholder");
    }

    public void ingresarCaracteresTxtEmail(String caracter) {
        wait.until(ExpectedConditions.elementToBeClickable(txtPlaEmail));
        txtPlaEmail.sendKeys(caracter);
    }

    public void borrarCaracteresTxtEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(txtPlaEmail));
        txtPlaEmail.clear();
    }

    public boolean validarNoSalgaMnsjEmail() {
        if (lblMensajeEmail.isEnabled()){
            return true;
        }
        else {
            return false;
        }
    }

    public String ObtenerLblMensajeEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(lblMensajeEmail));
        return lblMensajeEmail.getText();
    }

    public void ingresarCaracteresEmail(String caracter) {
        txtEmail.sendKeys(caracter);
    }

    public void seleccionarCaracterEmail(){
        txtEmail.sendKeys(Keys.CONTROL,"a");
    }

    public void copiarCaracterEmail(){
        txtEmail.sendKeys(Keys.CONTROL,"c");
    }

    public void pegarCaracterEmail(){
        txtEmail.sendKeys(Keys.CONTROL,"v");
    }


    //BOTON REGISTER

    public void clickBtnRegister() {
        btnRegister.click();
    }


    public String ObtenerLblMensaje() {
        wait.until(ExpectedConditions.elementToBeClickable(lblMensaje));
        return lblMensaje.getText();
    }

    //BOTON LOGIN

    public void clickBtnLogin() {
        btnLogin.click();
    }



    //PASSWORD


    public void clickTxtPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        txtPassword.click();
    }

    public String ObtenerphPassword(){
        wait.until(ExpectedConditions.elementToBeClickable(txtPlaPassword));
        return txtPlaPassword.getAttribute("placeholder");
    }

    public void ingresarCaracteresTxtPassword(String caracter) {
        wait.until(ExpectedConditions.elementToBeClickable(txtPlaPassword));
        txtPlaPassword.sendKeys(caracter);
    }

    public void borrarCaracteresTxtPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(txtPlaPassword));
        txtPlaPassword.clear();
    }

    public boolean validarNoSalgaMnsjPassword() {
        if (lblMensajePassword.isEnabled()){
            return true;
        }
        else {
            return false;
        }
    }

    public String ObtenerLblMensajePassword() {
        wait.until(ExpectedConditions.elementToBeClickable(lblMensajePassword));
        return lblMensajePassword.getText();
    }

    public void ingresarCaracteresPassword(String caracter) {
        txtPassword.sendKeys(caracter);
    }

    public void seleccionarCaracterPassword(){
        txtPassword.sendKeys(Keys.CONTROL,"a");
    }

    public void copiarCaracterPassword(){
        txtPassword.sendKeys(Keys.CONTROL,"c");
    }

    public void pegarCaracterPassword(){
        txtPassword.sendKeys(Keys.CONTROL,"v");
    }


}
