package ifsc.poo.structure;

import edu.princeton.cs.algs4.Draw;
import ifsc.poo.structure.models.Circulo;
import ifsc.poo.structure.models.Hexagono;
import ifsc.poo.structure.models.Quadrado;
import ifsc.poo.structure.models.Trapezio;

import java.awt.*;

public class MouseHandler {
    public enum TipoForma { CIRCULO, QUADRADO, HEXAGONO, TRAPEZIO }

    private Draw draw;
    private Color corAtual = Color.BLACK;
    private boolean preenchida = false;
    private double tamanhoAtual = 0.1;
    private TipoForma tipoForma = TipoForma.CIRCULO;

    public MouseHandler(Draw draw) {
        this.draw = draw;
    }

    public void processarTecla(int keyCode) {
        switch (keyCode) {
            case 112: // F1
                tipoForma = TipoForma.CIRCULO;
                System.out.println("Forma selecionada: Círculo");
                break;
            case 113: // F2
                tipoForma = TipoForma.QUADRADO;
                System.out.println("Forma selecionada: Quadrado");
                break;
            case 114: // F3
                tipoForma = TipoForma.HEXAGONO;
                System.out.println("Forma selecionada: Hexágono");
                break;
            case 115: // F4
                tipoForma = TipoForma.TRAPEZIO;
                System.out.println("Forma selecionada: Trapézio");
                break;
            case 67: // 'C'
            case 99: // 'c'
                limparTela();
                break;
            default:
                System.out.println("Tecla não mapeada: " + keyCode);
        }
    }

    public void desenharNaPosicao(double x, double y) {
        Forma forma = null;
        switch (tipoForma) {
            case CIRCULO:
                forma = new Circulo(corAtual, preenchida, tamanhoAtual, x, y);
                break;
            case QUADRADO:
                forma = new Quadrado(corAtual, preenchida, tamanhoAtual, x, y);
                break;
            case HEXAGONO:
                forma = new Hexagono(corAtual, preenchida, tamanhoAtual, x, y);
                break;
            case TRAPEZIO:
                forma = new Trapezio(corAtual, preenchida, tamanhoAtual, x, y);
                break;
        }
        if (forma != null) {
            forma.desenhar(draw);
            System.out.println("Desenhou " + tipoForma + " em (" + x + ", " + y + ")");
        }
    }

    private void limparTela() {
        draw.clear();
        System.out.println("Tela limpa.");
    }
}