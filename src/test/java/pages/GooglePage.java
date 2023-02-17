package pages;

public class GooglePage extends BasePage {

    public GooglePage (){
        super(driver);
    }    

    public void navigateToGoogle(){ //Es publico porque despues lo voy a querer usar desde los steps definitions
         //No hace falta que le pase un string, porque es lo que se llama Valores Hardcoded: asignar valor directamente al código en vez de proveerlo desde una fuente externa
         
         navigateTo("https://www.google.com"); //Hay que escribir completo la URL para que selenium la reconozca 
    }
}
