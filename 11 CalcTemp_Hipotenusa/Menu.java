import java.util.Scanner;
import java.lang.Math;

public class Menu 
{
  public static final int NumConstanteFahrenheit = 32;
  public static void main (String [] args) {
        
    Scanner menu = new Scanner(System.in);
    Scanner numeroDoUsuario = new Scanner(System.in);
    while (true) 
    {
      System.out.println("|             MENU                  |");
      System.out.println("|            Opções:                |");
      System.out.println("|                                   |");
      System.out.println("| 1. Converter Celsius x Fahrenheit |");
      System.out.println("| 2. Converter Fahrenheit x Celsius |");
      System.out.println("| 3. Calcular Hipotenusa            |");
      System.out.println("|                                   |");
      System.out.println("| 4. Sair                           |");
      System.out.println(" ");
      System.out.println("Selecione uma opção: ");
      
      int opcao = menu.nextInt();
 
      if (opcao == 4)
      {
        System.out.println("Obrigado! O programa foi encerrado");
        menu.close();
        break;
      }
      switch (opcao) 
      {
        case 1:
          System.out.println("");
          System.out.println("Digite abaixo uma temperatura em Graus Celsius");
          float tempCelsius = numeroDoUsuario.nextFloat();
        
          float resultado = ((tempCelsius * 9)/5) + NumConstanteFahrenheit;
        
          System.out.println("");
          System.out.println("A temperatura " + tempCelsius + " convertida em Fahrenheit é: "+ resultado); 
          for (int i = 0; i < 3; ++i) System.out.println ();  
          break;     
        case 2:
          System.out.println("");
          System.out.println("Digite abaixo uma temperatura em Graus Fahrenheit");
          float tempFahrenheit = numeroDoUsuario.nextFloat();
            
          float resultadoC = ((tempFahrenheit - NumConstanteFahrenheit) * 5)/9;
              
          System.out.println("");
          System.out.println("A temperatura " + tempFahrenheit + " convertida em Celsius é: "+ resultadoC);
          for (int i = 0; i < 3; ++i) System.out.println (); 
          break; 
        case 3:
          Scanner digitaCateto = new Scanner (System.in);
          System.out.println("");
          System.out.println("A hipotenusa é a linha de maior comprimento dentro de um triângulo retângulo.\nEla fica localizada sempre de forma oposta ao ângulo reto do triângulo,\nque é aquele que têm 90°");
          System.out.println("");
          System.out.println("Deseja saber a Hipotenusa do seu triângulo?\nEntão, digite abaixo o valor do seu CATETO MAIOR");
          float catetoMaior = digitaCateto.nextFloat();
          System.out.println("");
          System.out.println("Agora, digite o valor do seu CATETO MENOR");
          float catetoMenor = digitaCateto.nextFloat();
          System.out.println("");
          System.out.println("... calculando ...");
          System.out.println("");

          float resultadoH = (float) Math.pow(catetoMaior, 2) + (float) Math.pow(catetoMenor, 2);
          float hipotenusa = (float) Math.sqrt(resultadoH);
          System.out.println("A Hipotenusa dos catetos " + catetoMaior + " e " + catetoMenor +" é: " +hipotenusa);
          for (int i = 0; i < 3; ++i) System.out.println();
          break; 
        default:
          System.out.println("Escolha uma opção válida em nosso menu");
          break;
      }
    }
    menu.close();
    numeroDoUsuario.close();

  } 

}
