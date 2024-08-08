
package GestionAlimentos;

class GestionAlimentos extends Alimentos {
    private String nombre;

    public GestionAlimentos (String nombre) {
        super(0); // No necesitamos capacidad en esta clase
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double cantar(double num) {
        double canto = Math.sqrt(num);
        System.out.println("");
        return canto;
    }
}
