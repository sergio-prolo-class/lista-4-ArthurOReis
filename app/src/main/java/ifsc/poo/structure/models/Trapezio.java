package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import ifsc.poo.structure.Desenhavel;
import edu.princeton.cs.algs4.Draw;

public class Trapezio extends Forma implements Desenhavel {
    public Trapezio(java.awt.Color cor, boolean preenchida, double tamanho) {
        super(cor, preenchida, tamanho);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        double baseMaior = getTamanho();
        double baseMenor = getTamanho() * 0.6;
        double altura = getTamanho() * 0.7;
        double[] x = {
                0.5 - baseMaior / 2, 0.5 + baseMaior / 2,
                0.5 + baseMenor / 2, 0.5 - baseMenor / 2
        };
        double[] y = {
                0.5 - altura / 2, 0.5 - altura / 2,
                0.5 + altura / 2, 0.5 + altura / 2
        };
        if (isPreenchida()) {
            draw.filledPolygon(x, y);
        } else {
            draw.polygon(x, y);
        }

    }
}