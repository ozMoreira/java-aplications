import java.util.Scanner;

public class CalcHoras {

    public static final int horaUltima = 23;
    public static final int minuto = 59;
    public static final int segundo = 59;

    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);
        Horario horario = new Horario();
        
        int minutosCalculos = 0;
        int segundosCalculos = 0;
        int horasRestantes = 0;
        int convSeg = 0;
        int convSegPassado = 0;

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nEste exercicio foi desenvolvido para a disciplina de Domain Driven Design, do curso de Analise e Desenvolvimento\nde Sistemas da FIAP - Turma 1TDSR 2021 - Trabalhando com Orientacao a Objetos");
        System.out.println("\n       Determinaremos quantas horas se passaram desde a Meia Noite, e quantas faltam para o final do dia!");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");

        System.out.print("\nInforme o um horario qualquer (HH:MM:SS) >>> ");
        String[] horarioInformado = entrada.nextLine().split(":");
        entrada.close();

        horario.hora = Integer.parseInt(horarioInformado[0]);
        horario.minuto = Integer.parseInt(horarioInformado[1]);
        horario.segundo = Integer.parseInt(horarioInformado[2]);

        if (horario.hora < 0 | horario.hora > 23 | horario.minuto < 0 | horario.minuto > 59 | horario.segundo < 0 | horario.segundo > 59){
            System.out.println("Informe um horario válido!!!");
        }
        else
        {
            convSegPassado = (horario.hora*3600)+(horario.minuto*60)+horario.segundo;
            if (horario.minuto == 0 && horario.segundo == 0){               
                horasRestantes = (horario.hora - 24)*-1;
                convSeg = (horasRestantes*3600)+segundosCalculos+minutosCalculos;
            }
            else{
                minutosCalculos = (horario.minuto - minuto)*-1;
                segundosCalculos = (horario.segundo - segundo)*-1;
                horasRestantes = (horario.hora - horaUltima)*-1;
                convSeg = ((horasRestantes*3600)+(minutosCalculos*60)+segundosCalculos);
            }

            String hRString = String.format("%02d", horasRestantes);
            String minRString = String.format("%02d", minutosCalculos);
            String segRString = String.format("%02d", segundosCalculos);
            String horaInfString = String.format("%02d",horario.hora);
            String minInfString = String.format("%02d",horario.minuto);
            String segInfString = String.format("%02d",horario.segundo);

            System.out.println("\n\nPelo horário informado, ja se passaram "+horaInfString+":"+minInfString+":"+segInfString + " do seu dia, o equivalente a "+convSegPassado +" em segundos,\ne voce terá ainda "+hRString+":"+minRString+":"+segRString + " ou seja, mais " + convSeg +" em segundos");
        }   
    }
}