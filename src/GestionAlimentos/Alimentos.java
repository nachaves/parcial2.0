
package GestionAlimentos;

/**
Estas clases estan sujetas a cambios y perspectivas
* del programador 
* 
* CUMPLA CON LOS CASOS DE USO
 */
abstract class Alimentos {
    protected Alimentos[] lista;

    public Alimentos(int capacidad) {
        lista = new Alimentos[capacidad];
    }

    public abstract double cantar(double num);

    public int agregarOrden(Alimentos alimento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = alimento;
                return i;
            }
        }
        return -1; // Si no hay espacio disponible
    }

    public Alimentos[] getAlimentos() {
        return lista;
    }
}

class ZooImpl extends Alimentos {
    private String ubicacion;

    public ZooImpl(String ubicacion, int capacidad) {
        super(capacidad);
        this.ubicacion = ubicacion;
    }

    @Override
    public double cantar(double num) {
        // Implementación del método abstracto
        return 0;
    }
}

