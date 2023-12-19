public class LocDeMunca {
    public LocDeMunca(){
        this.id = 0;
        this.id_firma = 0;
        this.nume = "";
        this.salariu = 0;
    }
    public LocDeMunca(int id, int id_firma, String nume, double salariu){
        this.id = id;
        this.id_firma = id_firma;
        this.nume = nume;
        this.salariu = salariu;
    }

    public int getId(){
        return this.id;
    }

    public int getIdFirma(){
        return this.id_firma;
    }

    public String getNume(){
        return this.nume;
    }

    public double getSalariu(){
        return this.salariu;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setIdFirma(int id_firma){
        this.id_firma = id_firma;
    }
    public void setNume(String nume){
        this.nume = nume;
    }

    public void setSalariu(double salariu){
        this.salariu = salariu;
    }

    private int id;
    private int id_firma;
    private String nume;
    private double salariu;
}
