import java.text.DecimalFormat;
import java.util.Scanner;

public class CarroPrecoFinal {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Carro carro = new Carro();

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.println("\n   Calcularemos o Preco Final de um Carro, incluindo o valor da Fabrica, Impostos e Percentual de Revenda.");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");

        System.out.print("\nInforme o Custo Estimado de Fabricacao do automóvel: >>> R$ ");
        carro.custoFabrica = entrada.nextDouble();
        entrada.close();  
        
        carro.percentDistribuidor = 28.0 / 100;
        carro.percentImpostos = 45.0 / 100;
        carro.custoDistribuidor = carro.percentDistribuidor * carro.custoFabrica;
        carro.custoImpostos = carro.percentImpostos * carro.custoFabrica;
        carro.custoCarro = carro.custoFabrica + carro.custoDistribuidor + carro.custoImpostos;

        System.out.println("\n\n O Custo final do carro ao consumidor, sera de >>>>>>> R$ " + df.format(carro.custoCarro));
    }
}
