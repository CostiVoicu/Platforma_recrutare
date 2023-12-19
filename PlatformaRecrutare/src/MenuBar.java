import javax.swing.*;

public class MenuBar extends JMenuBar {
    MenuLocDeMunca menuLocDeMunca = new MenuLocDeMunca();
    MenuFirma menuFirma = new MenuFirma();
    MenuLocalitate menuLocalitate = new MenuLocalitate();
    MenuCont menuCont = new MenuCont();
    MenuPersoana menuPersoana = new MenuPersoana();
    public MenuBar(){
        add(menuLocDeMunca);
        add(menuFirma);
        add(menuLocalitate);
        add(menuCont);
    }
}
