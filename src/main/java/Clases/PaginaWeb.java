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
        funcionalidad = "";  // Página inicial
    }

    // Método para navegar a una nueva página o funcionalidad
    public void navegar(String dato) {
        historialAtras.push(funcionalidad);  // Guardar la página actual en historialAtras
        funcionalidad = dato;  // Actualizar la página actual
        historialAdelante.clear();  // Limpiar el historial adelante, porque ya no podemos avanzar a algo nuevo
        System.out.println("Página actual: " + funcionalidad);
    }

    // Método para retroceder en el historial (deshacer)
    public void desHacer() {
        if (!historialAtras.isEmpty()) {
            historialAdelante.push(funcionalidad);  // Guardar la página actual en historialAdelante
            funcionalidad = historialAtras.pop();  // Volver a la página anterior en historialAtras
            System.out.println("Deshacer (retroceder): " + funcionalidad);
        } else {
            System.out.println("No hay páginas para retroceder.");
        }
    }

    // Método para avanzar en el historial (rehacer)
    public void rehacer() {
        if (!historialAdelante.isEmpty()) {
            historialAtras.push(funcionalidad);  // Guardar la página actual en historialAtras
            funcionalidad = historialAdelante.pop();  // Volver a la página siguiente en historialAdelante
            System.out.println("Rehacer (avanzar): " + funcionalidad);
        } else {
            System.out.println("No hay páginas para avanzar.");
        }
    }
}
