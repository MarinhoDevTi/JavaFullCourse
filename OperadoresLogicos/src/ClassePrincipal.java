import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        //variavel de leitura 
        Scanner leia = new Scanner(System.in);

        System.out.println("You are playing a game ! Press q or Q to quit");;
        String response = leia.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }
}
