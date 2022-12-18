import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // while loop = executes a bloci of code as long as a it's condition remains true

        Scanner ltr = new Scanner (System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Digite seu nome: ");
            name = ltr.nextLine();
        }
        System.out.println("Olá " + name);
        ltr.close();
    }
    
}
