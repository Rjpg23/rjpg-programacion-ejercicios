import javax.swing.*;

public class ObjOperaciones
{
    public double cuadradoArea(double n1)
    {
        return n1 * n1;
    }

    public double cuadradoPerimetro(double n1)
    {
        return n1 * 4;
    }

    public double trianguloArea(double n1, double n2)
    {
        return (n1 * n2) / 2;
    }

    public double trianguloPerimetro(double n1, double n2, double n3)
    {
        return n1 + n2 + n3;
    }

    public double rectanguloArea(double n1, double n2)
    {
        return n1 * n2;
    }

    public double rectanguloPerimetro(double n1, double n2)
    {
        return 2 * (n1 + n2);
    }
}
