package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import ifsc.poo.structure.Desenhavel;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Hexagono extends Forma implements Desenhavel {

    public Hexagono(Color cor, boolean preenchida, double tamanho, double x, double y) {
        super(cor, preenchida, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        double angle = Math.PI / 3;
        double[] xs = new double[6];
        double[] ys = new double[6];
        for (int i = 0; i < 6; i++) {
            xs[i] = getX() + getTamanho() * Math.cos(angle * i);
            ys[i] = getY() + getTamanho() * Math.sin(angle * i);
        }
        draw.setPenColor(getCor());
        draw.filledPolygon(xs, ys);
        draw.setPenColor(isbordaPreta() ? Color.BLACK : getCor());
        draw.polygon(xs, ys);
    }
}
