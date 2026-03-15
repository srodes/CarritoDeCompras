/**
 * Representa un producto que puede añadirse al carrito
 */
public class Item {

    private String nombre;
    private double precio;

    public static final double PRECIO_MIN = 0;
    public static final double PRECIO_MAX = 10000;

    public Item(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio < PRECIO_MIN) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        if (precio > PRECIO_MAX) {
            throw new IllegalArgumentException("Precio demasiado alto");
        }

        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - €" + precio;
    }
}