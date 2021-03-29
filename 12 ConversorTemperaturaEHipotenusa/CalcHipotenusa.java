import java.util.Scanner;
import java.lang.Math;

public class CalcHipotenusa {
    
    public static void main (String [] args)
    {
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

        float resultado = (float) Math.pow(catetoMaior, 2) + (float) Math.pow(catetoMenor, 2);
        float hipotenusa = (float) Math.sqrt(resultado);

        System.out.println("A Hipotenusa dos catetos " + catetoMaior + " e " + catetoMenor +" é: " +hipotenusa);       
    }
}
