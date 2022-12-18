import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // nested loops = a loop insede of a loop
        Scanner ltr = new Scanner( System.in);
        int rows;
        int columns;
        String synbol = "";

        System.out.println("Enter # of rows: ");
        rows = ltr.nextInt();
        System.out.println("Enter # of columns: ");
        columns = ltr.nextInt();

        System.out.println("Enter symbol to use: ");
        synbol = ltr.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(synbol);
            }
            
        }

        ltr.close();
    }
    
}
