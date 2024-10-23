import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora

{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Variables

        String Op;
        double resultado = 0;
        JOptionPane.showMessageDialog(null , "Calculadora // Area - Perimetro");

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));

        Op = JOptionPane.showInputDialog("ingrese la operacion que desea realizar ( +, - , * , /)");

        ObjOperaciones operaciones = new ObjOperaciones();

        switch (Op){

            case"+":
                resultado =  operaciones.suma(n1,n2);
                break;
            case"-":
                resultado = operaciones.resta(n1,n2);
                break;
            case"*":
                resultado = operaciones.multp(n1,n2);
                break;
            case"/":
                resultado = operaciones.div(n1,n2);



        }

        JOptionPane.showMessageDialog(null,"el resultado de tu operacion es :" +resultado);

    }
}
