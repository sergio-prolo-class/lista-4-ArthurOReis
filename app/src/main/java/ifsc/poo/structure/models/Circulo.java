package ifsc.poo.structure.models;

import edu.princeton.cs.algs4.Draw;
import ifsc.poo.structure.Forma;
import java.awt.Color;

public class Circulo extends Forma {

    public Circulo(Color cor, boolean preenchida, double tamanho) {
        super(cor, preenchida, tamanho);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        if (isPreenchida()) {
            draw.filledCircle(0.5, 0.5, getTamanho());
        } else {
            draw.circle(0.5, 0.5, getTamanho());
        }
    }
}
