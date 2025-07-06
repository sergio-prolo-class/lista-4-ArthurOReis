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

    }
}
