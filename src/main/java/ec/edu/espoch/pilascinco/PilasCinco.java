
package ec.edu.espoch.pilascinco;

import Clases.PaginaWeb;

/**
 *
 * @author PERSONAL
 */
public class PilasCinco {

    public static void main(String[] args) {
        PaginaWeb pagina = new PaginaWeb();
        
        pagina.navegar("Página 1");
        pagina.navegar("Página 2");
       
        pagina.regresar();  
        pagina.continuar();  
 
        pagina.navegar("Página 3");
        System.out.println("bienvenidos a la pagina web");
    }
}
 