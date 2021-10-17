package definition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import pageobjects.registerPage;

import java.io.IOException;

public class registerDefinition {
    registerPage register;

    public registerDefinition() {
        register = new registerPage();
    }



    @Dado("que la web esta disponible para Registro")
    public void queLaWebEstaDisponibleRegistro() {
        hooks.driver.get("http://localhost:4000/register");
        Assert.assertEquals("Challenge QA", hooks.driver.getTitle());
    }

    @Dado("que la web esta disponible para Login")
    public void queLaWebEstaDisponibleLogin() {
        hooks.driver.get("http://localhost:4000/login");
        Assert.assertEquals("Challenge QA", hooks.driver.getTitle());
    }

    //EMAIL

    @Cuando("Ingreso a la opción email")
    public void IngresoALaOpcionEmail() throws IOException {
        register.clickEmail();
        register.evidencia();
    }

    @Entonces("^Valido que tenga el nombre y placeholder correcto de Email \"([^\"]*)\"$")
    public void validoQueTengaElNombreCorrectoDeEmail(String tiemail) throws IOException {
        //register.validarPhTxtEmail(tiemail);
        Assert.assertEquals(tiemail,register.ObtenerphEmail());
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres correctos en Email \"([^\"]*)\"$")
    public void ingresoCaracteresCorrectosEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Entonces("^Valido que no muestre mensaje de email incompleto$")
    public void validoQueNoMuestreMensajeDeEmailIncompleto() throws IOException {
        Assert.assertTrue(register.validarNoSalgaMnsjEmail());
        register.borrarCaracteresTxtEmail();
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres alfanumericos en Email \"([^\"]*)\"$")
    public void ingresoCaracteresAlfanumericosEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Cuando("^Ingreso solo letras en Email \"([^\"]*)\"$")
    public void ingresoSoloLetrasEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Cuando("^Ingreso solo numeros en Email \"([^\"]*)\"$")
    public void ingresoSoloNumerosEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Cuando("^Ingreso mayusculas y minusculas en Email \"([^\"]*)\"$")
    public void ingresoMayusculasyMinusculasEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres especiales en Email \"([^\"]*)\"$")
    public void ingresoCaracteresEspecialesEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Cuando("^Ingreso espacios en blanco en Email \"([^\"]*)\"$")
    public void ingresoEspaciosEnBlacoEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Cuando("^Ingreso cero caracteres en Email \"([^\"]*)\"$")
    public void ingresoCeroCaracteresEnEmail(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtEmail(ninguncar);
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de email incompleto \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeEmailIncompleto(String mensajeEmail) throws IOException {
        register.clickTxtPassword();
        Assert.assertEquals(mensajeEmail,register.ObtenerLblMensajeEmail());
        register.evidencia();
    }

    @Cuando("^No Ingreso Arroba en Email \"([^\"]*)\"$")
    public void NoIngresoArrobaEnEmail(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtEmail(ninguncar);
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres en Email \"([^\"]*)\"$")
    public void ingresoCaracteresEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Y("^Ingreso otros caracteres en Email \"([^\"]*)\"$")
    public void ingresoOtrosCaracteresEnEmail(String email) throws IOException {
        register.borrarCaracteresTxtEmail();
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Entonces("^Valido que se haya borrado e ingresado de nuevo$")
    public void validoQueNoSeHayaBorradoEIngresadoDeNuevo() throws IOException {
        register.validarNoSalgaMnsjEmail();
        register.evidencia();
    }

    @Cuando("^Ingreso ningun caracter en Email \"([^\"]*)\"$")
    public void ingresoNingunCaracterEnEmail(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtEmail(ninguncar);
        register.evidencia();
    }

    @Y("^Valido que muestre el mensaje de email incompleto \"([^\"]*)\"$")
    public void validoQueMuestreElMensajeDeEmailIncompleto(String mensajeEmail) throws IOException {
        register.clickTxtPassword();
        Assert.assertEquals(mensajeEmail,register.ObtenerLblMensajeEmail());
        register.evidencia();
    }

    @Y("^No Ingreso el Arroba en Email \"([^\"]*)\"$")
    public void NoIngresoElArrobaEnEmail(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtEmail(ninguncar);
        register.evidencia();
    }

    @Cuando("^Copio y pego caracteres en Email \"([^\"]*)\"$")
    public void copioYPegoCaracteresCorrectosEnEmail(String email) throws IOException {
        register.ingresarCaracteresEmail(email);
        register.seleccionarCaracterEmail();
        register.copiarCaracterEmail();
        register.borrarCaracteresTxtEmail();
        register.pegarCaracterEmail();
        register.evidencia();
    }

    //BOTON REGISTER

    @Y("^Hago click al boton Register$")
    public void hagoClickAlBotonRegister() throws IOException {
        register.clickBtnRegister();
        register.evidencia();
    }

    @Y("^Ingreso los caracteres correctos en Password \"([^\"]*)\"$")
    public void ingresoLosCaracteresCorrectosEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de registro valido \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeRegistro(String mensaje) throws IOException {
        Assert.assertEquals(mensaje,register.ObtenerLblMensaje());
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de registro invalido \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeRegistroInvalido(String mensaje) throws IOException {
        Assert.assertEquals(mensaje,register.ObtenerLblMensaje());
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de registro required \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeRegistroRequired(String mensaje) throws IOException {
        Assert.assertEquals(mensaje,register.ObtenerLblMensaje());
        register.evidencia();
    }

    //BOTON LOGIN

    @Y("^Hago click al boton Login$")
    public void hagoClickAlBotonLogin() throws IOException {
        register.clickBtnLogin();
        register.evidencia();
    }


    @Entonces("^Valido que muestre mensaje de login valido \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeLogin(String mensaje) throws IOException {
        Assert.assertEquals(mensaje,register.ObtenerLblMensaje());
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de login invalido \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeLoginInvalido(String mensaje) throws IOException {
        Assert.assertEquals(mensaje,register.ObtenerLblMensaje());
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de login required \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDeLoginRequired(String mensaje) throws IOException {
        Assert.assertEquals(mensaje,register.ObtenerLblMensaje());
        register.evidencia();
    }


    //PASSWORD

    @Cuando("Ingreso a la opción password")
    public void IngresoALaOpcionPassword() throws IOException {
        register.clickTxtPassword();
        register.evidencia();
    }

    @Entonces("^Valido que tenga el nombre y placeholder correcto de Password \"([^\"]*)\"$")
    public void validoQueTengaElNombreCorrectoDePassword(String tipassword) throws IOException {
        Assert.assertEquals(tipassword,register.ObtenerphPassword());
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres correctos en Password \"([^\"]*)\"$")
    public void ingresoCaracteresCorrectosEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Entonces("^Valido que no muestre mensaje de password incompleto$")
    public void validoQueNoMuestreMensajeDePasswordIncompleto() throws IOException {
        Assert.assertTrue(register.validarNoSalgaMnsjPassword());
        register.borrarCaracteresTxtPassword();
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres alfanumericos en Password \"([^\"]*)\"$")
    public void ingresoCaracteresAlfanumericosEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso solo letras en Password \"([^\"]*)\"$")
    public void ingresoSoloLetrasEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso solo numeros en Password \"([^\"]*)\"$")
    public void ingresoSoloNumerosEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso mayusculas y minusculas en Password \"([^\"]*)\"$")
    public void ingresoMayusculasyMinusculasEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres especiales en Password \"([^\"]*)\"$")
    public void ingresoCaracteresEspecialesEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso espacios en blanco en Password \"([^\"]*)\"$")
    public void ingresoEspaciosEnBlacoEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso cero caracteres en Password \"([^\"]*)\"$")
    public void ingresoCeroCaracteresEnPassword(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtPassword(ninguncar);
        register.evidencia();
    }

    @Entonces("^Valido que muestre mensaje de password incompleto \"([^\"]*)\"$")
    public void validoQueMuestreMensajeDePassword(String mensajePassword) throws IOException {
        register.clickTxtPassword();
        Assert.assertEquals(mensajePassword,register.ObtenerLblMensajePassword());
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres menores de 6 en Password \"([^\"]*)\"$")
    public void ingresoCaracteresMenoresDe6EnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres en Password \"([^\"]*)\"$")
    public void ingresoCaracteresEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Y("^Ingreso otros caracteres en Password \"([^\"]*)\"$")
    public void ingresoOtrosCaracteresEnPassword(String password) throws IOException {
        register.borrarCaracteresTxtPassword();
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Entonces("^Valido que se haya borrado e ingresado de nuevo Password$")
    public void validoQueNoSeHayaBorradoEIngresadoDeNuevoPassword() throws IOException {
        register.validarNoSalgaMnsjPassword();
        register.evidencia();
    }

    @Cuando("^Ingreso ningun caracter en Password \"([^\"]*)\"$")
    public void ingresoNingunCaracterEnPassword(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtPassword(ninguncar);
        register.evidencia();
    }

    @Y("^Valido que muestre el mensaje de password incompleto \"([^\"]*)\"$")
    public void validoQueMuestreElMensajeDePasswordIncompleto(String mensajePassword) throws IOException {
        register.clickTxtPassword();
        Assert.assertEquals(mensajePassword,register.ObtenerLblMensajePassword());
        register.evidencia();
    }

    @Y("^No Ingreso el Arroba en Password \"([^\"]*)\"$")
    public void NoIngresoElArrobaEnPassword(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtPassword(ninguncar);
        register.evidencia();
    }

    @Cuando("^Copio y pego caracteres en Password \"([^\"]*)\"$")
    public void copioYPegoCaracteresCorrectosEnPassword(String password) throws IOException {
        register.ingresarCaracteresPassword(password);
        register.seleccionarCaracterPassword();
        register.copiarCaracterPassword();
        register.borrarCaracteresTxtPassword();
        register.pegarCaracterPassword();
        register.evidencia();
    }

    @Y("^Ingreso los caracteres menores de 6 en Password \"([^\"]*)\"$")
    public void ingresoLosCaracteresMenoresDe6EnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }

    @Y("^Ingreso ningun caracter en el Password \"([^\"]*)\"$")
    public void ingresoNingunCaracterEnElPassword(String ninguncar) throws IOException {
        register.ingresarCaracteresTxtPassword(ninguncar);
        register.evidencia();
    }

    @Cuando("^Ingreso caracteres incorrectos en Email \"([^\"]*)\"$")
    public void ingresoCaracteresIncorrectosEnEmail(String email) throws IOException {
        register.ingresarCaracteresTxtEmail(email);
        register.evidencia();
    }

    @Y("^Ingreso los caracteres incorrectos en Password \"([^\"]*)\"$")
    public void ingresoLosCaracteresIncorrectosEnPassword(String password) throws IOException {
        register.ingresarCaracteresTxtPassword(password);
        register.evidencia();
    }


}