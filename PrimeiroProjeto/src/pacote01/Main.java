package pacote01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, ("Hello  " +name));

        int age = JOptionPane.showInputDialog("Enter your age");
    } 
}
