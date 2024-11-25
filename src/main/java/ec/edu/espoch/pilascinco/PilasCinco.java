
package ec.edu.espoch.pilascinco;

import Clases.PaginaWeb;

/**
 *
 * @author PERSONAL
 */
public class PilasCinco {

    public static void main(String[] args) {
        PaginaWeb pagina = new PaginaWeb();
        
        pagina.navegar("Diagram");
        pagina.navegar("Gmail");
        pagina.adelante();
        pagina.atras();
        pagina.navegar("Wix");
        System.out.println("bienveidos  ala escuela");
        
    }
}
 