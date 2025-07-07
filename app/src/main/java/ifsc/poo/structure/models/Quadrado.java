package ifsc.poo.structure.models;

import ifsc.poo.structure.Forma;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Quadrado extends Forma { // Classe Quadrado que herda de Forma, implementando a interface Desenhavel

    public Quadrado(Color cor, boolean preenchida, double tamanho, double x, double y) {
        super(cor, preenchida, tamanho, x, y);
    }

    @Override
    public void desenhar(Draw draw) { // Sobrescrevendo método desenhar de Forma para quadrado
        draw.setPenColor(getCor());
        draw.filledSquare(getX(), getY(), getTamanho());
        draw.setPenColor(isbordaPreta() ? Color.BLACK : getCor());
        draw.square(getX(), getY(), getTamanho());
    }

    @Override
    public double getPerimetro() { // Sobrescrevendo método getPerimetro de Forma para quadrado
        return 4 * getTamanho();
    }

    @Override
    public double getArea() { // Sobrescrevendo método getArea de Forma para quadrado
        return getTamanho() * getTamanho();
    }
}
