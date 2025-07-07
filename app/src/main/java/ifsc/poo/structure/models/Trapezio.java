package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Trapezio extends Forma { // Classe Trapezio que herda de Forma, implementando a interface Desenhavel

    public Trapezio(Color cor, boolean preenchida, double tamanho, double x, double y) {
        super(cor, preenchida, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) { // Sobrescrevendo método desenhar de Forma para trapézio
        double baseMaior = getTamanho() * 2;
        double baseMenor = getTamanho();
        double altura = getTamanho();

        double[] xs = {
                getX() - baseMaior / 2,
                getX() + baseMaior / 2,
                getX() + baseMenor / 2,
                getX() - baseMenor / 2
        };
        double[] ys = {
                getY() - altura / 2,
                getY() - altura / 2,
                getY() + altura / 2,
                getY() + altura / 2
        };

        draw.setPenColor(getCor());
        draw.filledPolygon(xs, ys);
        draw.setPenColor(isbordaPreta() ? Color.BLACK : getCor());
        draw.polygon(xs, ys);
    }

    @Override
    public double getPerimetro() { // Sobrescrevendo método getPerimetro de Forma para trapézio
        double baseMaior = getTamanho() * 2;
        double baseMenor = getTamanho();
        double altura = getTamanho();
        double lado = Math.sqrt(Math.pow((baseMaior - baseMenor) / 2, 2) + altura * altura);
        return baseMaior + baseMenor + 2 * lado;
    }

    @Override
    public double getArea() { // Sobrescrevendo método getArea de Forma para trapézio
        double baseMaior = getTamanho() * 2;
        double baseMenor = getTamanho();
        double altura = getTamanho();
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}