import javax.swing.*;

public class ObjOperaciones {

    public double suma(double n1, double n2) {
        return n1 + n2;

    }

    public double resta(double n1, double n2) {
        return n1 - n2;

    }

    public double multp(double n1, double n2) {
        return n1 * n2;

    }

    public double div(double n1, double n2) {

        if (n2 == 0) {
            JOptionPane.showMessageDialog(null, "no se puede dividir para 0");


        } else {
            return n1 / n2;
        }

        return 0 ;


    }


}
