#language: es

@LOGIN

Característica: LOGIN Frontend
  Yo como usuario nuevo
  Quiero loguearme en la web
  Para crear mi usuario de manera satisfactoria

  Antecedentes:
    Dado que la web esta disponible para Login


  #   Validaciones tecnicas Email

  @ESC_001_L @GENERAL_LOGIN
  Esquema del escenario:  [QA][Challenge] C001 - Como Usuario deseo validar el nombre de Email

    Cuando Ingreso a la opción email
    Entonces Valido que tenga el nombre y placeholder correcto de Email "<tiemail>"

    Ejemplos:
      | tiemail |
      | email   |


    #   Ingreso Email


  @ESC_002_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C002 - Como Usuario deseo ingresar caracteres correctos en Email

    Cuando Ingreso caracteres correctos en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email                   |
      | usuario@gmail.com       |
      | usuario@hotmail.com     |
      | usuario@utp.edu.pe      |
      | usuario@qdsgroup.com.pe |


  @ESC_003_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C003 - Como Usuario deseo ingresar caracteres alfanumericos en Email

    Cuando Ingreso caracteres alfanumericos en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email                      |
      | usuario123@gmail.com       |
      | 123usuario@hotmail.com     |
      | Usuario123@utp.edu.pe      |
      | 123Usuario@qdsgroup.com.pe |


  @ESC_004_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C004 - Como Usuario deseo ingresar solo letras en Email

    Cuando Ingreso solo letras en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email               |
      | usuario@gmail.com   |
      | abcdefg@hotmail.com |


  @ESC_005_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C005 - Como Usuario deseo ingresar solo numeros en Email

    Cuando Ingreso solo numeros en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email                |
      | 12345678@gmail.com   |
      | 11111111@hotmail.com |


  @ESC_006_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C006 - Como Usuario deseo ingresar mayusculas y minusculas en Email

    Cuando Ingreso mayusculas y minusculas en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email                   |
      | USUARIO@gmail.com       |
      | usuario@hotmail.com     |
      | Usuario@utp.edu.pe      |
      | usuaRio@qdsgroup.com.pe |


  @ESC_007_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C007 - Como Usuario deseo ingresar caracteres especiales en Email

    Cuando Ingreso caracteres especiales en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email                          |
      | USUARIO_1002@gmail.com         |
      | usuario.111$@hotmail.com       |
      | Usuario-000@utp.edu.pe         |
      | usuaRio_123456@qdsgroup.com.pe |


  @ESC_008_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C008 - Como Usuario deseo ingresar espacios en blanco en Email

    Cuando Ingreso espacios en blanco en Email "<email>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | email                   |
      |                         |
      | usuario.   @hotmail.com |
      | 00  0@utp.edu.pe        |


  @ESC_009_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C009 - Como Usuario deseo ingresar cero caracteres en Email

    Cuando Ingreso cero caracteres en Email "<ninguncar>"
    Entonces Valido que muestre mensaje de email incompleto "<mensajeEmail>"

    Ejemplos:
      | ninguncar | mensajeEmail     |
      |           | Email Incompleto |


  @ESC_010_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C010 - Como Usuario deseo ingresar sin caracter @ en Email

    Cuando No Ingreso Arroba en Email "<sin@>"
    Entonces Valido que muestre mensaje de email incompleto "<mensajeEmail>"

    Ejemplos:
      | sin@        | mensajeEmail     |
      | usuario.com | Email Incompleto |
      | usuario     | Email Incompleto |
      | usuario1010 | Email Incompleto |



    #   Borrado e ingreso Email y completado

  @ESC_011_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C011 - Como Usuario deseo ingresar y borrar los caracteres en Email

    Cuando Ingreso caracteres en Email "<caremail>"
    Y Ingreso otros caracteres en Email "<otrocaremail>"
    Entonces Valido que se haya borrado e ingresado de nuevo

    Ejemplos:
      | caremail          | otrocaremail          |
      | usuario@gmail.com | otroemail@hotmail.com |



    #   Clic en otro campo sin completar

  @ESC_012_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C012 - Como Usuario deseo pasar al otro campo sin completar en Email

    Cuando Ingreso ningun caracter en Email "<ninguncar>"
    Y Valido que muestre el mensaje de email incompleto "<mensajeEmail>"
    Y No Ingreso el Arroba en Email "<sin@>"
    Entonces Valido que muestre mensaje de email incompleto "<mensajeEmail>"

    Ejemplos:
      | ninguncar | sin@        | mensajeEmail     |
      |           | usuario.com | Email Incompleto |


    #   Pegado Email


  @ESC_013_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C013 - Como Usuario deseo pegar caracteres en Email

    Cuando Copio y pego caracteres en Email "<ninguncar>"
    Entonces Valido que no muestre mensaje de email incompleto

    Ejemplos:
      | ninguncar |
      |           |



    #   Boton Login para Email


  @ESC_014_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C014 - Como Usuario deseo pasar login sin ingresar ningun caracter en Email

    Cuando Ingreso ningun caracter en Email "<ninguncar>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de email incompleto "<mensajeEmail>"

    Ejemplos:
      | ninguncar | mensajeEmail     |
      |           | Email Incompleto |


  @ESC_015_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C015 - Como Usuario deseo pasar login sin ingresar @ en Email

    Cuando No Ingreso Arroba en Email "<sin@>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de email incompleto "<mensajeEmail>"

    Ejemplos:
      | sin@        | mensajeEmail     |
      | usuario.com | Email Incompleto |






    #   Validaciones tecnicas Contraseña

  @ESC_016_L @GENERAL_LOGIN
  Esquema del escenario:  [QA][Challenge] C016 - Como Usuario deseo validar el nombre de Password

    Cuando Ingreso a la opción password
    Entonces Valido que tenga el nombre y placeholder correcto de Password "<tipassword>"

    Ejemplos:
      | tipassword |
      | password   |



    #   Ingreso Password


  @ESC_017_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C017 - Como Usuario deseo ingresar caracteres correctos en Password

    Cuando Ingreso caracteres correctos en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password       |
      | 12345          |
      | 123456         |
      | abcdef         |
      | ABCDEF         |
      | 123456abcdef   |
      | abcdef123456   |
      | AbcdBf123456   |
      | AbcdBf12345%&/ |
      | $&/()@         |
      | a   b  c       |


  @ESC_018_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C018 - Como Usuario deseo ingresar caracteres alfanumericos en Password

    Cuando Ingreso caracteres alfanumericos en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password        |
      | abcdefgh1234567 |
      | 1234567wertyfg  |


  @ESC_019_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C019 - Como Usuario deseo ingresar solo letras en Password

    Cuando Ingreso solo letras en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password      |
      | abcdefghijklm |


  @ESC_020_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C020 - Como Usuario deseo ingresar solo numeros en Password

    Cuando Ingreso solo numeros en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password   |
      | 1234567890 |


  @ESC_021_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C021 - Como Usuario deseo ingresar mayusculas y minusculas en Password

    Cuando Ingreso mayusculas y minusculas en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password      |
      | zxyacb        |
      | QWERTYU       |
      | zxyacbQWERTYU |
      | QWERTYUzxyacb |


  @ESC_022_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C022 - Como Usuario deseo ingresar caracteres especiales en Password

    Cuando Ingreso caracteres especiales en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password |
      | %&/($&/) |


  @ESC_023_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C023 - Como Usuario deseo ingresar espacios en blanco en Password

    Cuando Ingreso espacios en blanco en Password "<password>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | password     |
      |              |
      | ab err       |
      | 00  04567    |
      | 00  04567aer |
      | rt  %&/($    |


  @ESC_024_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C024 - Como Usuario deseo ingresar cero caracteres en Password

    Cuando Ingreso cero caracteres en Password "<ninguncar>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de password incompleto "<mensajePassword>"

    Ejemplos:
      | ninguncar | mensajePassword     |
      |           | Password Incompleto |


  @ESC_025_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C025 - Como Usuario deseo ingresar caracteres menores de 6 en Password

    Cuando Ingreso caracteres menores de 6 en Password "<password>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de password incompleto "<mensajePassword>"

    Ejemplos:
      | password | mensajePassword     |
      | 1234     | Password Incompleto |
      | abcd     | Password Incompleto |
      | 12ab     | Password Incompleto |
      | ab34     | Password Incompleto |




     #   Borrado e ingreso Password y completado

  @ESC_026_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C026 - Como Usuario deseo ingresar y borrar los caracteres en Password

    Cuando Ingreso caracteres en Password "<carpassword>"
    Y Ingreso otros caracteres en Password "<otrocarpassword>"
    Entonces Valido que se haya borrado e ingresado de nuevo

    Ejemplos:
      | carpassword | otrocarpassword |
      | 12345rjfd   | QW123*%&        |



    #   Clic en otro campo sin completar

  @ESC_027_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C027 - Como Usuario deseo pasar al otro campo sin completar en Password

    Cuando Ingreso ningun caracter en Password "<ninguncar>"
    Y Hago click al boton Login
    Y Valido que muestre el mensaje de password incompleto "<mensajePassword>"
    Y Ingreso los caracteres menores de 6 en Password "<password>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de password incompleto "<mensajePassword>"

    Ejemplos:
      | ninguncar | password | mensajePassword     |
      |           | 12345    | Password Incompleto |


    #   Pegado Password


  @ESC_028_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C028 - Como Usuario deseo pegar caracteres en Password

    Cuando Copio y pego caracteres en Password "<ninguncar>"
    Entonces Valido que no muestre mensaje de password incompleto

    Ejemplos:
      | ninguncar |
      |           |



    #   Boton Login para Password


  @ESC_029_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C029 - Como Usuario deseo pasar login sin ingresar ningun caracter en Password

    Cuando Ingreso ningun caracter en Password "<ninguncar>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de password incompleto "<mensajePassword>"

    Ejemplos:
      | ninguncar | mensajePassword     |
      |           | Password Incompleto |


  @ESC_030_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C030 - Como Usuario deseo ingresar caracteres menores de 6 en Password

    Cuando Ingreso caracteres menores de 6 en Password "<password>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de password incompleto "<mensajePassword>"

    Ejemplos:
      | password | mensajePassword     |
      | 12345    | Password Incompleto |




     #   Login Correcto


  @ESC_031_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C031 - Como Usuario deseo ingresar el correo y contraseña para loguearme de manera satisfactoria

    Cuando Ingreso caracteres correctos en Email "<email>"
    Y Ingreso los caracteres correctos en Password "<password>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de login valido "<mensaje>"

    Ejemplos:
      | email                   | password           | mensaje     |
      | usuario@gmail.com       | 123456             | LOGIN VALID |
      | usuario@hotmail.com     | 12345dfdgfh        | LOGIN VALID |
      | usuario@utp.edu.pe      | 12345sdfddg%&/     | LOGIN VALID |
      | usuario@qdsgroup.com.pe | ABdf12345455&& / ( | LOGIN VALID |



    #   Login Invalido


  @ESC_032_L @MEJORAS
  Esquema del escenario: : [QA][Challenge] C032 - Como Usuario deseo ingresar el correo y contraseña para login de manera insatisfactoria

    Cuando Ingreso caracteres incorrectos en Email "<email>"
    Y Ingreso los caracteres incorrectos en Password "<password>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de login invalido "<mensaje>"

    Ejemplos:
      | email       | password | mensaje |
      | usuario.com | 12345    | INVALID |



    #   Login Requerido


  @ESC_033_L @GENERAL_LOGIN
  Esquema del escenario: : [QA][Challenge] C033 - Como Usuario deseo no ingresar el correo y contraseña para logearme de manera insatisfactoria

    Cuando Ingreso ningun caracter en Email "<ninguncar>"
    Y Ingreso ningun caracter en el Password "<ninguncar>"
    Y Hago click al boton Login
    Entonces Valido que muestre mensaje de login required "<mensaje>"

    Ejemplos:
      | ninguncar | mensaje  |
      |           | REQUIRED |