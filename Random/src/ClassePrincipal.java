import java.util.Random;
import java.util.*;

public class ClassePrincipal {
    public static void main(String[] args) {
        Random nuRand = new Random();

        //int x = nuRand.nextInt(999999);
        double y = nuRand.nextDouble();

        if ( y >= 0){
            System.out.println("Este é o Número: " + y);
        } else {
            System.out.println("Numero: " + ( y + 100));
        }
        
    }
}
