import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GeometriaMain {
    public static void main(String[] args)
    {
        String op;
        double n1, n2, n3, area, perimetro, resultado = 0;

        op = JOptionPane.showInputDialog("Ingrese la operación que desea realizar// \nTriangulo: Base y Altura\n" +
                "\nCuadrado: Base y Altura\n" +
                "\nRectangulo: Base y Altura\n");

        ObjOperaciones operaciones = new ObjOperaciones();

        switch (op)
        {
            case "Triangulo || triangulo":
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
                n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado3 del triangulo"));
                area = operaciones.trianguloArea(n1, n2);
                perimetro = operaciones.trianguloPerimetro(n1, n2, n3);
                resultado = Double.parseDouble(JOptionPane.showInputDialog(null, "Área: " + area + "\nPerímetro: " + perimetro));
                break;

            case "Cuadrado || cuadrado":
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de uno de sus lados"));
                area = operaciones.cuadradoArea(n1);
                perimetro = operaciones.cuadradoPerimetro(n1);
                resultado = Double.parseDouble(JOptionPane.showInputDialog(null, "Área: " + area + "\nPerímetro: " + perimetro));
                break;

            case "Rectangulo || rectangulo":
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo"));
                area = operaciones.rectanguloArea(n1, n2);
                perimetro = operaciones.rectanguloPerimetro(n1, n2);
                resultado = Double.parseDouble(JOptionPane.showInputDialog(null, "Área: " + area + "\nPerímetro: " + perimetro));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                break;
        }

        JOptionPane.showMessageDialog(null, "El resultado de tu operación es: " + resultado);
    }
}
