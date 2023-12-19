public class Cont {
    private int id;
    private int cnp_persoana;
    private  int id_job;
    private String nume;
    public Cont() {
        this.id=-1;
        this.cnp_persoana=-1;
        this.id_job=-1;
        this.nume=null;
    }
    public Cont(int id, int cnp_persoana, int id_job, String nume){
        this.id=id;
        this.cnp_persoana=cnp_persoana;
        this.id_job=id_job;
        this.nume=nume;
    }
    public int getId() {
        return id;
    }
    public int getCnp_persoana() {
        return cnp_persoana;
    }
    public int getId_job() {
        return id_job;
    }
    public String getNume() {
        return nume;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCnp_persoana(int cnp_persoana) {
        this.cnp_persoana = cnp_persoana;
    }
    public void setId_job(int id_job) {
        this.id_job = id_job;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
}
