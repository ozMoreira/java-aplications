import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeLata {

    public static final double pi = 3.14159;
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Lata lata = new Lata();

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.println("\nA proposta deste exercicio eh descobrir o volume de uma Lata de oleo\nde acordo com a Altura e Raio, informados pelo usuario!");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");

        System.out.print("\nInforme a ALTURA desejada da Lata de Oleo em cm >>> ");
        lata.altura = entrada.nextDouble();
        System.out.print("Informe o RAIO desejado para Lata de Oleo em cm>>> ");
        lata.raio = entrada.nextDouble();

        entrada.close();

        double volume = pi * lata.raio * lata.raio * lata.altura;
        
        System.out.println("O volume da suposta lata eh: " + df.format(volume) + " L");
    }
}