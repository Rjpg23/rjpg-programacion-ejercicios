import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IvaProductoMain {
    public static void main(String[] args) throws IOException {
        double producto, precio, iva;
        boolean continuar = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(continuar) {

            System.out.println("ingrese por favor el precio del producto // ingrese 0 para salir");
            precio = Double.parseDouble(reader.readLine());
            if (precio <= 0) {
                continuar = false;
                System.out.println("Este producto no tiene iva :)");
            } else {
                if (precio <= 500) {
                    iva = precio * 0.12 + precio;
                    System.out.println("el precio del producto con iva del 12% es de:" + iva);
                } else if (precio > 500 && precio <= 1500) {
                    iva = precio * 0.14 + precio;
                    System.out.println("El precio del producto con iva del 14% es de :" + iva);
                } else if (precio > 1500) {
                    iva = precio * 0.15 + precio;
                    System.out.println("El precio del producto con iva del 15% es de:" + iva);
                }
            }

        }

    }
}
