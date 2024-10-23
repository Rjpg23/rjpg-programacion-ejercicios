import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kilometraje

{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        //variables
        String NumMotor, NumVentanas, CantPuertas, marca, modelo;
        NumMotor = JOptionPane.showInputDialog("Ingree por favo rel serial del motor");
        NumVentanas = JOptionPane.showInputDialog("Ingrese la cantidad de ventanas");
        CantPuertas = JOptionPane.showInputDialog("Ingrese la cantidad de puertas");
        marca = JOptionPane.showInputDialog("Ingree la marca del vehiculo");
        modelo = JOptionPane.showInputDialog("Ingree el modelo del vehiculo");
        double Kmi = Double.parseDouble(JOptionPane.showInputDialog("ingrese el kilometraje inicial"));
        double Kmf = Double.parseDouble(JOptionPane.showInputDialog("ingrese el kilometraje final"));
        double kmr;

            kmr = Kmf - Kmi;

        JOptionPane.showMessageDialog(null, "Serial del motor: \n" +NumMotor + "\nCantidad de ventanas: \n" + NumVentanas +
                "\nMarca del vehiculo:\n"+marca+"\nModelo del vehiculo:\n"+modelo+"\nKilometraje recorrido:\n"+kmr);
    }





}
