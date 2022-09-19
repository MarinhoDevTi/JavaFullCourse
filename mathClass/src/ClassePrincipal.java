import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner ltr = new Scanner(System.in);

        System.out.println("Entre com o side x: ");
        x = ltr.nextDouble();

        System.out.println("Entre com o side y: ");
        y = ltr.nextDouble();

        z = Math.sqrt((x * x) + (y * y)); 

        System.out.println("Este é o numero da Hipotenuza: " + z);
        ltr.close();
        
    }

}
 