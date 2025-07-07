package ifsc.poo.structure.models;

import edu.princeton.cs.algs4.Draw;
import ifsc.poo.structure.Forma;
import java.awt.Color;

public class Circulo extends Forma {

    public Circulo(Color cor, boolean bordaPreta, double tamanho, double x, double y) {
        super(cor, bordaPreta, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        draw.filledCircle(getX(), getY(), getTamanho());
        draw.setPenColor(isbordaPreta() ? Color.BLACK : getCor());
        draw.circle(getX(), getY(), getTamanho());
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * getTamanho();
    }

    @Override
    public double getArea() {
        return Math.PI * getTamanho() * getTamanho();
    }
}
