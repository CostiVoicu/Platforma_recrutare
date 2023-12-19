import javax.swing.*;

public class MenuFirma extends JMenu {
    JMenuItem adaugare = new JMenuItem("Adaugare");
    JMenuItem stergere = new JMenuItem("Stergere");
    JMenuItem modificare = new JMenuItem("Modificare");
    public  MenuFirma(){
        setText("Firme");
        add(adaugare);
        add(stergere);
        add(modificare);
    }
    JMenuItem getAdaugare(){
        return adaugare;
    }
    JMenuItem getStergere(){
        return stergere;
    }
    JMenuItem getModificare(){
        return modificare;
    }
}
