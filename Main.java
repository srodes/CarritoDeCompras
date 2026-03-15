/**
 * Clase principal que ejecuta el programa
 */
public class Main {

    public static void main(String[] args) {

        CarritoDeCompras carrito = new CarritoDeCompras();

        try {

            Item item1 = new Item("Camiseta", 20.99);
            Item item2 = new Item("Pantalones", 34.99);

            carrito.agregarItem(item1, 2);
            carrito.agregarItem(item2, 1);

            System.out.println(carrito);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}