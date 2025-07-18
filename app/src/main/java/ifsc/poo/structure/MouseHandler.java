package ifsc.poo.structure;

import edu.princeton.cs.algs4.Draw;
import ifsc.poo.structure.models.Circulo;
import ifsc.poo.structure.models.Hexagono;
import ifsc.poo.structure.models.Quadrado;
import ifsc.poo.structure.models.Trapezio;

import java.awt.*;

public class MouseHandler {
    public enum TipoForma { CIRCULO, QUADRADO, HEXAGONO, TRAPEZIO }
    private static final double TAMANHO_MIN = 0.1;
    private static final double TAMANHO_MAX = 0.6;
    private static final double PASSO_TAMANHO = 0.05;

    private final Draw draw;
    private Color corAtual = Color.BLACK;
    private boolean bordaPreta = false;
    private double tamanhoAtual = 0.1;
    private TipoForma tipoForma = TipoForma.CIRCULO;
    private final java.util.List<Forma> formas = new java.util.ArrayList<>();

    private static final Color[] CORES = {
            Color.RED,      // F5
            Color.BLUE,     // F6
            Color.GREEN,    // F7
            Color.YELLOW    // F8
    };

    public MouseHandler(Draw draw) {
        this.draw = draw;
        this.bordaPreta = true; // Inicializa com borda preta
    }

    public void processarTecla(int keyCode) {
        switch (keyCode) {
            case 80: // 'p'
                mostrarInfoFiguras();
                break;
            case 81: // 'q'
                this.tamanhoAtual = Math.max(TAMANHO_MIN, this.tamanhoAtual - PASSO_TAMANHO);
                System.out.println("Tamanho: " + String.format("%.2f", this.tamanhoAtual));
                break;
            case 87: // 'w'
                this.tamanhoAtual = Math.min(TAMANHO_MAX, this.tamanhoAtual + PASSO_TAMANHO);
                System.out.println("Tamanho: " + String.format("%.2f", this.tamanhoAtual));
                break;
            case 102: // 'f'
                this.bordaPreta = !this.bordaPreta;
                System.out.println("Borda: " + (this.bordaPreta ? "Preta" : "Colorida"));
                break;
            case 99: // 'c'
                limparTela();
                break;
            case 112: // F1
                this.tipoForma = TipoForma.CIRCULO;
                System.out.println("Figura: Círculo");
                break;
            case 113: // F2
                this.tipoForma = TipoForma.QUADRADO;
                System.out.println("Figura: Quadrado");
                break;
            case 114: // F3
                this.tipoForma = TipoForma.HEXAGONO;
                System.out.println("Figura: Hexágono");
                break;
            case 115: // F4
                this.tipoForma = TipoForma.TRAPEZIO;
                System.out.println("Figura: Trapézio");
                break;
            case 116: // F5
                this.corAtual = CORES[0];
                System.out.println("Cor: Vermelho");
                break;
            case 117: // F6
                this.corAtual = CORES[1];
                System.out.println("Cor: Azul");
                break;
            case 118: // F7
                this.corAtual = CORES[2];
                System.out.println("Cor: Verde");
                break;
            case 119: // F8
                this.corAtual = CORES[3];
                System.out.println("Cor: Amarelo");
                break;
        }
    }

    public void desenharNaPosicao(double x, double y) {
        Forma forma = switch (tipoForma) {
            case CIRCULO -> new Circulo(this.corAtual, this.bordaPreta, this.tamanhoAtual, x, y);
            case QUADRADO -> new Quadrado(this.corAtual, this.bordaPreta, this.tamanhoAtual, x, y);
            case HEXAGONO -> new Hexagono(this.corAtual, this.bordaPreta, this.tamanhoAtual, x, y);
            case TRAPEZIO -> new Trapezio(this.corAtual, this.bordaPreta, this.tamanhoAtual, x, y);
        };
        forma.setbordaPreta(bordaPreta);
        forma.desenhar(draw);
        formas.add(forma);
    }

    private void limparTela() {
        draw.clear();
        formas.clear();
        System.out.println("Tela limpa.");
    }

    private void mostrarInfoFiguras() {
        int total = formas.size();
        double somaPerimetros = 0;
        double somaAreas = 0;
        for (Forma f : formas) {
            somaPerimetros += f.getPerimetro();
            somaAreas += f.getArea();
        }
        double areaMedia = total > 0 ? somaAreas / total : 0;
        System.out.println("Total de figuras: " + total);
        System.out.println("Soma dos perímetros: " + String.format("%.2f", somaPerimetros));
        System.out.println("Área média: " + String.format("%.2f", areaMedia));
    }
}