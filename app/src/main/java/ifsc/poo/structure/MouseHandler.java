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

    private Draw draw;
    private Color corAtual = Color.BLACK;
    private boolean preenchida = false;
    private double tamanhoAtual = 0.1;
    private TipoForma tipoForma = TipoForma.CIRCULO;
    private boolean bordaPreta;

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
        if (keyCode >= 112 && keyCode <= 119) {
            // Teclas F1 a F8
            switch (keyCode) {
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
                    System.out.println("Cor selecionada: Vermelho");
                    break;
                case 117: // F6
                    this.corAtual = CORES[1];
                    System.out.println("Cor selecionada: Azul");
                    break;
                case 118: // F7
                    this.corAtual = CORES[2];
                    System.out.println("Cor selecionada: Verde");
                    break;
                case 119: // F8
                    this.corAtual = CORES[3];
                    System.out.println("Cor selecionada: Amarelo");
                    break;
            }
        } else {
            // Outras teclas
            switch (keyCode) {
                case 81: // 'q'
                    this.tamanhoAtual = Math.max(TAMANHO_MIN, this.tamanhoAtual - PASSO_TAMANHO);
                    System.out.println("Tamanho atual: " + this.tamanhoAtual);
                    break;
                case 87: // 'w'
                    this.tamanhoAtual = Math.min(TAMANHO_MAX, this.tamanhoAtual + PASSO_TAMANHO);
                    System.out.println("Tamanho atual: " + this.tamanhoAtual);
                    break;
                case 102: // 'f'
                    this.bordaPreta = !this.bordaPreta;
                    System.out.println("Borda: " + (this.bordaPreta ? "Preta" : "Colorida"));
                    break;
                case 99: // 'c'
                    limparTela();
                    break;
                default:
                    System.out.println("Tecla não mapeada: " + keyCode);
            }
        }
    }

    public void desenharNaPosicao(double x, double y) {
        Forma forma = switch (tipoForma) {
            case CIRCULO -> new Circulo(this.corAtual, this.preenchida, this.tamanhoAtual, x, y);
            case QUADRADO -> new Quadrado(this.corAtual, this.preenchida, this.tamanhoAtual, x, y);
            case HEXAGONO -> new Hexagono(this.corAtual, this.preenchida, this.tamanhoAtual, x, y);
            case TRAPEZIO -> new Trapezio(this.corAtual, this.preenchida, this.tamanhoAtual, x, y);
        };
        forma.setbordaPreta(bordaPreta);
        forma.desenhar(draw);
    }

    private void limparTela() {
        draw.clear();
        System.out.println("Tela limpa.");
    }
}