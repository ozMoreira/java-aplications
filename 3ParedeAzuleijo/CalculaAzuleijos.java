import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaAzuleijos {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Parede parede = new Parede();
        Azuleijo azuleijo = new Azuleijo();

        System.out.print("------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.print("\n\nA proposta deste exercicio eh saber quantos azuleijos de uma determinada dimensao, serao necessarios para cobrir\numa determinada parede! Ambas as dimensoes, serao especificadas pelo usuario.");
        System.out.print("\n------------------------------------------------------------------------------------------------------------------");

        System.out.print("\n\nInforme uma altura  em METROS, de uma parede qualquer >>> ");
        parede.alturaParede = entrada.nextDouble();
        System.out.print("Informe uma base EM METROS, de uma parede qualquer >>> ");
        parede.baseParede = entrada.nextDouble();

        System.out.print("\nInforme uma altura em CM, de um azuleijo qualquer >>> ");
        azuleijo.alturaAzuleijo = entrada.nextDouble();
        System.out.print("Informe uma base em CM, de um azuleijo qualquer >>> ");
        azuleijo.baseAzuleijo = entrada.nextDouble();
        entrada.close();

        double areaParede = ((parede.alturaParede*100) * (parede.baseParede*100));
        double areaAzuleijo = (azuleijo.alturaAzuleijo * azuleijo.baseAzuleijo);
        double resultado = (areaParede / areaAzuleijo); 
        //aqui, multiplicamos por 100, pra ter a quantidade de azuleijos necessários, considerando que as medidas sao em cm.
        System.out.print(areaParede + "     " + areaAzuleijo);

        System.out.println("\n\nA parede tem      \n>>> "+ df.format(parede.alturaParede) +" m de alt X " + df.format(parede.baseParede) + " m de larg <<<.");
        System.out.println("\nCada azuleijo possui      \n>>> " + df.format(azuleijo.alturaAzuleijo) + "cm de alt X " + df.format(azuleijo.baseAzuleijo) + " cm de larg <<<.");
        System.out.println("\n\nLogo, serão necessarios      \n>>> " + df.format(resultado) + " azuleijo(s)<<<.");
        System.out.print("\n------------------------------------------------------------------------------------------------------------------");
    }
}