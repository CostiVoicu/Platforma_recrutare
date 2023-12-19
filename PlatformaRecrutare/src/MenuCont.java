import javax.swing.*;

public class MenuCont extends JMenu {
    JMenuItem adaugare = new JMenuItem("Adaugare");
    JMenuItem stergere = new JMenuItem("Stergere");
    JMenuItem modificare = new JMenuItem("Modificare");
    public  MenuCont(){
        setText("Conturi");
        add(adaugare);
        add(stergere);
        add(modificare);
    }
}
