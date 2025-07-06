package ifsc.poo.structure.models;

import edu.princeton.cs.algs4.Draw;
import ifsc.poo.structure.Forma;
import java.awt.Color;

public class Circulo extends Forma {

    public Circulo(Color cor, boolean preenchida, double tamanho, double x, double y) {
        super(cor, preenchida, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) {
        draw.setPenColor(getCor());
        if (isPreenchida()) {
            draw.filledCircle(getX(), getY(), getTamanho());
        } else {
            draw.circle(getX(), getY(), getTamanho());
        }
    }
}
