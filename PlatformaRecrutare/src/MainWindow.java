import javax.swing.*;

public class MainWindow extends JFrame {
    MenuBar menuBar = new MenuBar();
    public MainWindow(){
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Main Window");
        setLocationRelativeTo(null);
        setVisible(true);
        this.setJMenuBar(menuBar);
    }
}
