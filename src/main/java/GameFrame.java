import javax.swing.JFrame;
public class GameFrame extends JFrame{
  GameFrame(){

//    GamePanel panel = new GamePanel();
//    this.add(panel);
    //Celaner
    this.add(new GamePanel());
    //Constructing Frame
    this.setTitle("Snake");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    //Adding components to JFrame
    this.pack();
    this.setVisible(true);
    //Window in the middle
    this.setLocationRelativeTo(null);
  }
}
