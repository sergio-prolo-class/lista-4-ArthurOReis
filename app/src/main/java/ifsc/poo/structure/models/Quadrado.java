package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import ifsc.poo.structure.Desenhavel;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Quadrado extends Forma implements Desenhavel {

    public Quadrado(Color cor, boolean preenchida, double tamanho, double x, double y) {
        super(cor, preenchida, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        draw.filledSquare(getX(), getY(), getTamanho());
        draw.setPenColor(isbordaPreta() ? Color.BLACK : getCor());
        draw.square(getX(), getY(), getTamanho());
    }

    @Override
    public double getPerimetro() {
        return 4 * getTamanho();
    }

    @Override
    public double getArea() {
        return getTamanho() * getTamanho();
    }
}
