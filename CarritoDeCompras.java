import java.util.HashMap;
import java.util.Map;

/**
 * Representa un carrito de compras
 */
public class CarritoDeCompras {

    private Map<Item, Integer> items;

    public static final String CABECERA = "Detalles del carrito:";
    public static final String MONEDA = "€";

    public CarritoDeCompras() {
        items = new HashMap<>();
    }

    /**
     * Añade un item al carrito con una cantidad
     */
    public void agregarItem(Item item, int cantidad) {

        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }

        if (items.containsKey(item)) {
            items.put(item, items.get(item) + cantidad);
        } else {
            items.put(item, cantidad);
        }
    }

    /**
     * Elimina un item del carrito
     */
    public void removerItem(Item item) {

        if (!items.containsKey(item)) {
            throw new IllegalArgumentException("El item no está en el carrito");
        }

        items.remove(item);
    }

    /**
     * Calcula el total del carrito
     */
    public double calcularTotal() {

        double total = 0;

        for (Item item : items.keySet()) {
            total += item.getPrecio() * items.get(item);
        }

        return total;
    }

    /**
     * Lista los items del carrito
     */
    public String listarItems() {

        String resultado = "";

        for (Item item : items.keySet()) {

            int cantidad = items.get(item);

            resultado += item.toString() + " x " + cantidad + "\n";
        }

        return resultado;
    }

    @Override
    public String toString() {

        String resultado = CABECERA + "\n";

        resultado += listarItems();

        resultado += "Total: " + MONEDA + calcularTotal();

        return resultado;
    }
}