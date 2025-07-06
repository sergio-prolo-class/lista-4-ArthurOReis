package ifsc.poo.structure;

import edu.princeton.cs.algs4.Draw;

import java.awt.Color;

public abstract class Forma implements Desenhavel{
    private Color cor;
    private boolean bordaPreta;
    private double tamanho;
    private double x;
    private double y;

    public Forma(Color cor, boolean bordaPreta, double tamanho, double x, double y) {
        this.cor = cor;
        this.bordaPreta = bordaPreta;
        this.tamanho = tamanho;
        this.x = x;
        this.y = y;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public boolean isbordaPreta() {
        return bordaPreta;
    }

    public void setbordaPreta(boolean bordaPreta) {
        this.bordaPreta = bordaPreta;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public abstract void desenhar(Draw draw);
}