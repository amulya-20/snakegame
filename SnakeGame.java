import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeGame extends JFrame {
	ScreenPanel sp=new ScreenPanel();
    public SnakeGame() {
        
        initScreen();
    }
    
    private void initScreen() {
        
        add(sp);
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame frame = new SnakeGame();
            frame.setVisible(true);
        });
    }
}
