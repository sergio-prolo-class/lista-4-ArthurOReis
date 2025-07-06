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

    }
}
