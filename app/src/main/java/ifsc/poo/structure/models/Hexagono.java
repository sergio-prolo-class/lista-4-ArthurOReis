package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import ifsc.poo.structure.Desenhavel;
import edu.princeton.cs.algs4.Draw;

public class Hexagono extends Forma implements Desenhavel {
    public Hexagono(java.awt.Color cor, boolean preenchida, double tamanho) {
        super(cor, preenchida, tamanho);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        double[] x = new double[6];
        double[] y = new double[6];
        for (int i = 0; i < 6; i++) {
            x[i] = 0.5 + getTamanho() * Math.cos(Math.PI / 3 * i);
            y[i] = 0.5 + getTamanho() * Math.sin(Math.PI / 3 * i);
        }
        if (isPreenchida()) {
            draw.filledPolygon(x, y);
        } else {
            draw.polygon(x, y);
        }
    }
}
