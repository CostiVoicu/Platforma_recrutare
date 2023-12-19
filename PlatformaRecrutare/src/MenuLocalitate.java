import javax.swing.*;

public class MenuLocalitate extends JMenu {
    JMenuItem adaugare = new JMenuItem("Adaugare");
    JMenuItem stergere = new JMenuItem("Stergere");
    JMenuItem modificare = new JMenuItem("Modificare");
    public  MenuLocalitate(){
        setText("Localitati");
        add(adaugare);
        add(stergere);
        add(modificare);
    }
}
