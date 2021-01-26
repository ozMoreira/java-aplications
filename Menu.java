import java.util.Scanner;

public class Menu {
        

    public static void main (String [] args) {
        
        Scanner menu = new Scanner(System.in);

        while (true) {

        System.out.println("|    MENU                    |");
        System.out.println("|  Opções:                   |");
        System.out.println("|         1. Opção 1         |");
        System.out.println("|         2. Opção 2         |");
        System.out.println("|         3. Sair            |");
        System.out.println("Selecione uma opção: ");
        
        int opcao = menu.nextInt();
 
        if (opcao == 3){
            System.out.println("O programa foi encerrado");
            menu.close();
            break;
        }
        switch (opcao) {
          case 1:
            System.out.println("Voce escolheu a primeira opção");
            break;
              
          case 2:
            System.out.println("Voce escolheu a segunda opção");
            break;

          default:
            System.out.println("Escolha uma opção válida em nosso menu");
            break;
          }
        }
    } 

}
