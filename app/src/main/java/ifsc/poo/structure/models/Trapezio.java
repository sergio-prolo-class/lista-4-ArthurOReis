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
        draw.setPenColor(getCor());
        double baseMaior = getTamanho() * 2;
        double baseMenor = getTamanho();
        double altura = getTamanho();

        double[] xs = {
                getX() - baseMaior / 2, // canto inferior esquerdo
                getX() + baseMaior / 2, // canto inferior direito
                getX() + baseMenor / 2, // canto superior direito
                getX() - baseMenor / 2  // canto superior esquerdo
        };
        double[] ys = {
                getY() - altura / 2, // inferior
                getY() - altura / 2, // inferior
                getY() + altura / 2, // superior
                getY() + altura / 2  // superior
        };

        if (isPreenchida()) {
            draw.filledPolygon(xs, ys);
        } else {
            draw.polygon(xs, ys);
        }
    }
}