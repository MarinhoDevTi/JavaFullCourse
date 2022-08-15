import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("digite seu Nome: ");
        JOptionPane.showMessageDialog(null, "Hello " + nome);

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com seu ano "));
        JOptionPane.showMessageDialog(null, "Você nasceu em :  " + ano); 


        
    }
}
