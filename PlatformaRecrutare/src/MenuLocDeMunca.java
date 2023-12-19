import javax.swing.*;

public class MenuLocDeMunca extends JMenu {
    JMenuItem adaugare = new JMenuItem("Adaugare");
    JMenuItem stergere = new JMenuItem("Stergere");
    JMenuItem modificare = new JMenuItem("Modificare");
    public  MenuLocDeMunca(){
        setText("Locuri de munca");
        add(adaugare);
        add(stergere);
        add(modificare);
    }
}
