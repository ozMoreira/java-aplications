import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoTemp {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        Temperaturas temperaturas = new Temperaturas();
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.print("\n------------------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.print("\nDigite um valor para Temperatura em Celsius >>> ");
        temperaturas.celsius = entrada.nextDouble();
        entrada.close();

        temperaturas.kelvin = temperaturas.celsius + 273.15;
        temperaturas.reamur = temperaturas.celsius * 0.8;
        temperaturas.rankine = ((temperaturas.celsius * 1.8) + 32) + 459.67;
        temperaturas.fahrenheit = (temperaturas.celsius * 1.8) + 32;

        System.out.print("\nTemperatura na escala Kelvin = " + df.format(temperaturas.kelvin) +" K"); 
        System.out.print("\nTemperatura na escala Reamur = " + df.format(temperaturas.reamur) +" Re");
        System.out.print("\nTemperatura na escala Rankine = " + df.format(temperaturas.rankine) +" Ra");
        System.out.print("\nTemperatura na escala Fahrenheit = " + df.format(temperaturas.fahrenheit) +" F");
        System.out.println("\n\n------------------------------------------------------------------------------------------------------------------");
       
    }
    
}
