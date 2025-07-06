package ifsc.poo.structure;

import edu.princeton.cs.algs4.Draw;

import java.awt.Color;

public abstract class Forma implements Desenhavel{
    private Color cor;
    private boolean preenchida;
    private double tamanho;

    public Forma(Color cor, boolean preenchida, double tamanho) {
        this.cor = cor;
        this.preenchida = preenchida;
        this.tamanho = tamanho;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public boolean isPreenchida() {
        return preenchida;
    }

    public void setPreenchida(boolean preenchida) {
        this.preenchida = preenchida;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public abstract void desenhar(Draw draw);
}