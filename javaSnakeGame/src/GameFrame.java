import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
     GameFrame(){

          //GamePainel painel = new GamePainel();

          this.add(new GamePainel());
          this.setTitle("Snake");
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setResizable(false);
          this.pack();
          this.setVisible(true);
          this.setLocationRelativeTo(null);
          

     }
    
}
