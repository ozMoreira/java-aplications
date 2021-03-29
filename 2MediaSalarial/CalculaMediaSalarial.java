import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaMediaSalarial {
    
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Colaborador colaborador = new Colaborador();
        String mColaborador[] = new String[3]; 
        float mSalario[] = new float[3];
    
        System.out.print("------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.print("\n------------------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.print("\nDigite o nome do Colaborador 1>>> ");
        colaborador.nome = entrada.nextLine();
        mColaborador[0] = colaborador.nome;
        System.out.print("Digite o Salario do(a) " + mColaborador[0] + " >>> R$ ");
        colaborador.salario = entrada.nextFloat();
        mSalario[0] = colaborador.salario;
        entrada.nextLine(); //esvazia o buffer do scanner

        
        System.out.print("\nDigite o nome do Colaborador 2>>> ");
        colaborador.nome = entrada.nextLine();
        mColaborador[1] = colaborador.nome;
        System.out.print("Digite o Salario do(a) " + mColaborador[1] + " >>> R$ ");
        colaborador.salario = entrada.nextFloat();
        mSalario[1] = colaborador.salario;
        entrada.nextLine(); //esvazia o buffer do scanner

        System.out.print("\nDigite o nome do Colaborador 3>>> ");
        colaborador.nome = entrada.nextLine();
        mColaborador[2] = colaborador.nome;
        System.out.print("Digite o Salario do(a) " + mColaborador[2] + " >>> R$ ");
        colaborador.salario = entrada.nextFloat();
        mSalario[2] = colaborador.salario;
        entrada.close();
        
        float mediaSalarial = (mSalario[0] + mSalario[1] + mSalario[2]) / 3;
        

        System.out.print("\n\nA media salarial destes tres colaboradores, eh de R$ "+ df.format(mediaSalarial));
        
    }
}
