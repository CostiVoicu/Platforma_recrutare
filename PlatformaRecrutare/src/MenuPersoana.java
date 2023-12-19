import javax.swing.*;

public class MenuPersoana extends JMenu {
    JMenuItem adaugare = new JMenuItem("Adaugare");
    JMenuItem stergere = new JMenuItem("Stergere");
    JMenuItem modificare = new JMenuItem("Modificare");
    public  MenuPersoana(){
        setText("Persoane");
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
