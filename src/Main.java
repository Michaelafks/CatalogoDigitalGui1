public class Main {

    public static void main(String[] args) {

        Producto[] productos = new Producto[5];

        productos[0] = new Producto("P01", "Mouse", 25.50, true);
        productos[1] = new Producto("P02", "Teclado", 35.00, true);
        productos[2] = new Producto("P03", "Monitor", 180.00, false);
        productos[3] = new Producto("P04", "Audifonos", 45.50, true);
        productos[4] = new Producto("P05", "Laptop", 650.00, false);

        AnalizadorCatalogo analizador = new AnalizadorCatalogo(productos);

        System.out.println("===== CATALOGO DE PRODUCTOS =====");
        System.out.println(analizador.listarProductos());

        System.out.println("===== PRODUCTOS DISPONIBLES =====");
        System.out.println("Disponibles: " + analizador.contarDisponibles());

        System.out.println("\n===== PRECIO PROMEDIO =====");
        System.out.println("Promedio: $" + analizador.calcularPrecioPromedio());

        System.out.println("\n===== BUSCAR PRODUCTO =====");
        Producto encontrado = analizador.buscarPorCodigo("P03");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Producto no encontrado");
        }

        System.out.println("\n===== BUSQUEDA INEXISTENTE =====");
        Producto noEncontrado = analizador.buscarPorCodigo("P10");

        if (noEncontrado == null) {
            System.out.println("El producto no existe");
        }

        System.out.println("\n===== PRODUCTO MAS CARO =====");
        Producto masCaro = analizador.obtenerProductoMasCaro();

        if (masCaro != null) {
            System.out.println(masCaro.mostrarInformacion());
        }
    }
}
