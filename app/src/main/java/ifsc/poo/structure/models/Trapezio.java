package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import ifsc.poo.structure.Desenhavel;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Trapezio extends Forma implements Desenhavel {

    public Trapezio(Color cor, boolean preenchida, double tamanho, double x, double y) {
        super(cor, preenchida, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        double baseMaior = getTamanho() * 2;
        double baseMenor = getTamanho();
        double altura = getTamanho();

        double[] xs = {
                getX() - baseMaior / 2,
                getX() + baseMaior / 2,
                getX() + baseMenor / 2,
                getX() - baseMenor / 2
        };
        double[] ys = {
                getY() - altura / 2,
                getY() - altura / 2,
                getY() + altura / 2,
                getY() + altura / 2
        };

        draw.setPenColor(getCor());
        draw.filledPolygon(xs, ys);
        draw.setPenColor(isbordaPreta() ? Color.BLACK : getCor());
        draw.polygon(xs, ys);
    }
}