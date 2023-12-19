public class Persoana {
    private int id;
    private int id_localitate;
    private int id_cont;
    private String nume;
    private String telefon;
    private String mail;
    public Persoana(){
        this.id=-1;
        this.id_localitate=-1;
        this.id_cont=-1;
        this.nume=null;
        this.telefon=null;
        this.mail=null;
    }
    public Persoana(int id, int id_localitate, int id_cont, String nume, String telefon, String mail){
        this.id=id;
        this.id_localitate=id_localitate;
        this.id_cont=id_cont;
        this.nume=nume;
        this.telefon=telefon;
        this.mail=mail;
    }
    public int getId() {
        return id;
    }
    public int getId_cont() {
        return id_cont;
    }
    public int getId_localitate() {
        return id_localitate;
    }
    public String getNume() {
        return nume;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getMail() {
        return mail;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setId_cont(int id_cont) {
        this.id_cont = id_cont;
    }
    public void setId_localitate(int id_localitate) {
        this.id_localitate = id_localitate;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
}
