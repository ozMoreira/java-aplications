import java.util.Scanner;

public class ConvertFtoC 
{
    public static final int NumConstanteFahrenheit = 32;

    public static void main (String [] args)
    {
        Scanner numeroDoUsuario = new Scanner(System.in);
    
        System.out.println("");
        System.out.println("Digite abaixo uma temperatura em Graus Fahrenheit");
        float tempFahrenheit = numeroDoUsuario.nextFloat();
            
        float resultado = ((tempFahrenheit - NumConstanteFahrenheit) * 5)/9;
            
        System.out.println("");
        System.out.println("A temperatura " + tempFahrenheit + " convertida em Celsius é: "+ resultado);  
    }
}
