public class Firma {
    public Firma(){
        this.id = -1;
        this.id_localitate = -1;
        this.nume = "";
        this.mail = "";
    }
    public Firma(int id, int id_localitate, String nume, String mail){
        this.id = id;
        this.id_localitate = id_localitate;
        this.nume = nume;
        this.mail = mail;
    }

    public int getId(){
        return this.id;
    }
    public int getIdLocalitate(){
        return this.id_localitate;
    }
    public String getNume(){
        return this.nume;
    }
    public String getMail(){
        return this.mail;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setIdLocalitate(int id_localitate){
        this.id_localitate = id_localitate;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setMail(String mail){
        this.mail = mail;
    }

    private int id;
    private int id_localitate;
    private String nume;
    private String mail;
}
