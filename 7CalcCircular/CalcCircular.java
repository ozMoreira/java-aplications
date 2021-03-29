import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcCircular {
    
    public static final double pi = 3.14159;
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Circulos circulos = new Circulos();

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.println("\n             Determinaremos o Perimetro e a Area de um circulo, dado o RAIO informado pelo usuario!");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");

        System.out.print("\nInforme uma medida de RAIO em metros (m) >>> ");
        circulos.raio = entrada.nextDouble();
        entrada.close();

        circulos.perimetro = 2 * pi * circulos.raio;
        circulos.area = pi * (Math.pow(circulos.raio, 2));

        System.out.println("\n\n Para um raio de " + df.format(circulos.raio) + " m, teremos uma area de " + df.format(circulos.area) + " m\u00B2 com um perimetro de " + df.format(circulos.perimetro) + " m.");
    }
}
