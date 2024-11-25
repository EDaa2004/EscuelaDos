package Clases;

import java.util.Stack;

/**
 *
 * @author PERSONAL
 */
public class PaginaWeb {
    private Stack<String> historialAtras;
    private Stack<String> historialAdelante;
    private String funcionalidad;

    public PaginaWeb() {
        historialAtras = new Stack<>();
        historialAdelante = new Stack<>();
        funcionalidad = "";  
    }

    
    public void navegar(String dato) {
        historialAtras.push(funcionalidad);  
        funcionalidad = dato; 
        historialAdelante.clear(); 
        System.out.println("Página actual: " + funcionalidad);
    }

    // Método para retroceder en el historial
    public void desHacer() {
        if (!historialAtras.isEmpty()) {
            historialAdelante.push(funcionalidad);  
            funcionalidad = historialAtras.pop();  
            System.out.println("Deshacer (retroceder): " + funcionalidad);
        } else {
            System.out.println("No hay páginas para retroceder.");
        }
    }

    // Método para avanzar en el historial (rehacer)
    public void rehacer() {
        if (!historialAdelante.isEmpty()) {
            historialAtras.push(funcionalidad);  
            funcionalidad = historialAdelante.pop(); 
            System.out.println("Rehacer (avanzar): " + funcionalidad);
        } else {
            System.out.println("No hay páginas para avanzar.");
        }
    }
}
