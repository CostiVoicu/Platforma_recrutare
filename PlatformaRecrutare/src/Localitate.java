public class Localitate {
    public Localitate(){
        this.id = -1;
        this.nume = "";
    }
    public Localitate(int id, String nume){
        this.id = id;
        this.nume = nume;
    }
    public int getId(){
        return this.id;
    }
    public String getNume(){
        return this.nume;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    private int id;
    private String nume;
}
