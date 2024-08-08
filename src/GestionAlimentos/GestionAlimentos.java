/*
 

*/
package GestionAlimentos;

import javax.swing.JOptionPane;

public class GestionAlimentos {

    public static void main(String[] args) {
        Alimentos men = new ZooImpl("BOGOTA", 20); // Capacidad para 10 animales
        String[] opciones = {"Agregar Alimentos", "Ver orden", "Salir"};

        int seleccion;
        do {
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de Comida",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    agregarOrden();
                    break;
                case 1:
                    verOrden(men);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    break;
            }
        } while (seleccion != 2);
    }

    public static void agregaOrden(Alimentos alimentos) {
        String nombre = JOptionPane.showInputDialog("Ingrese Orden:");
        Alimentos alimentos = new (nombre);
        alimentos.agregarOrden(alimentos);
        JOptionPane.showMessageDialog(null, "Orden agregada: " + nombre);
    }

    public static void verOrden(Alimentos alimento) {
        StringBuilder alimentosInfo = new StringBuilder();
        for (GestionAlimentos  GestionAlimentos : GestionAlimentos.getNombre()) {
            if (alimento != null) {
                AlimentoInfo.append(alimento.getAlimentos()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, alimentosInfo.length() > 0 ? alimentosInfo.toString() : "No hay ordenes registradas.");
    }

    private static void agregarOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
