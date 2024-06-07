import javax.swing.*;

public class Main extends JFrame{
    private JPanel panel1;

    public Main(){
        setContentPane(panel1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,400);
    }
    public static void main(String[] args) {
        new Main();
    }
}
