import java.util.Scanner;

class ConvertCtoF
{
    public static final int NumConstanteFahrenheit = 32;

    public static void main (String [] args)
    {
        Scanner numeroDoUsuario = new Scanner(System.in);

        System.out.println("");
        System.out.println("Digite abaixo uma temperatura em Graus Celsius");
        float tempCelsius = numeroDoUsuario.nextFloat();
        
        float resultado = ((tempCelsius * 9)/5) + NumConstanteFahrenheit;
        
        System.out.println("");
        System.out.println("A temperatura " + tempCelsius + " convertida em Fahrenheit é: "+ resultado);        
    }
}