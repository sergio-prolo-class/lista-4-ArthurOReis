package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import ifsc.poo.structure.Desenhavel;
import edu.princeton.cs.algs4.Draw;

public class Quadrado extends Forma implements Desenhavel {
    public Quadrado(java.awt.Color cor, boolean preenchida, double tamanho) {
        super(cor, preenchida, tamanho);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        double half = getTamanho() / 2.0;
        double[] x = {0.5 - half, 0.5 + half, 0.5 + half, 0.5 - half};
        double[] y = {0.5 - half, 0.5 - half, 0.5 + half, 0.5 + half};
        if (isPreenchida()) {
            draw.filledPolygon(x, y);
        } else {
            draw.polygon(x, y);
        }
    }
}
