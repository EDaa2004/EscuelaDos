
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
        pagina.navegar("Producto");
        pagina.adelante();
        pagina.atras();
        pagina.navegar("pilacero");
        
        
    }
}
 