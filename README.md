# CarritoDeCompras

Proyecto de Java que implementa un carrito de compras aplicando refactorización

- Separación del programa principal y la clase carrito.
- Encapsulación de los atributos de la clase Item.
- Creación de getters y setters.
- Validación de precios para evitar valores negativos o demasiado altos.
- Separación de responsabilidades:
  - cálculo del total
  - listado de items
- Manejo de excepciones al eliminar items inexistentes.
- Uso de constantes para textos y valores fijos.
- Implementación del método toString() en Item.
- Se añadió la posibilidad de guardar la cantidad de cada producto.
- Uso de HashMap para mejorar la escalabilidad.
