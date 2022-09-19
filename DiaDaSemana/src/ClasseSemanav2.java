import java.util.Scanner;

public class ClasseSemanav2 {
    public static void main(String[] args) {
        //variavel de leitura
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        String day;

        //leitura
        System.out.println("Digite o dia da Semana: ");
        day = leia.nextLine();

        switch (day) {
            case "Segunda Feira":
                System.out.println("Hoje é: " + day);                
                break;
            case "Terça Feira":
                System.out.println("Hoje é Terça Feira");                
                break;
            case "Quarta Feira":
                System.out.println("Hoje é Quarta Feira");                
                break;
            case "Quinta Feira":
                System.out.println("Hoje é Quinta Feira");
                break;
            case "Sexta Feira":
                System.out.println("Hoje é Sexta Feira");                
                break;
            case "Sábado":
                System.out.println("Hoje é Sábado");                
                break;
            case "Domingo":
                System.out.println("Hoje é " + day);                
                break;

            default:
                break;
        }

        leia.close();
    }
    
}
