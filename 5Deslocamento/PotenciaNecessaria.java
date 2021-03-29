import java.text.DecimalFormat;
import java.util.Scanner;

public class PotenciaNecessaria {
    
    public static final double hp = 745.6999;
    public static final double forcaGravitacional = 9.80665;
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Potencia potencia = new Potencia();

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.println("\nDeterminaremos a quantidade de cavalos necessários para se levantar uma massa a uma dada altura em razão de segundos!");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");

        System.out.print("\nInforme uma massa qualquer em quilogramas (kg) >>> ");
        potencia.massa = entrada.nextDouble();
        System.out.print("Informe uma altura em metros (m) >>> ");
        potencia.altura = entrada.nextDouble();
        System.out.print("Informe um tempo desejado em Segundos '' >>> ");
        potencia.segundos = entrada.nextInt();
        entrada.close();

        double energiaPotencialGravitacional = potencia.massa * forcaGravitacional * potencia.altura;
        double energiaPotencial = potencia.massa * potencia.altura;
        double cavalo = ( energiaPotencial/ potencia.segundos); 
        double cavaloHp = ( energiaPotencial / potencia.segundos)/hp;
        double cavaloG = ( energiaPotencialGravitacional / potencia.segundos); 
        double cavaloHpG = (energiaPotencialGravitacional / potencia.segundos)/hp;
        System.out.println("\n\nSerá necessário uma potência de "+ df.format(cavalo) + " Watts, equivalente a " + df.format(cavaloHp) + " HP (Cavalo de Potencia)");
        System.out.println("Considerando a aceleração da Gravidade, será necessário uma potência de "+ df.format(cavaloG) + " Watts,\nequivalente a " + df.format(cavaloHpG) + " HP (Cavalo de Potencia)");
    }
}
