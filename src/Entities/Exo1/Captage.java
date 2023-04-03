package Entities.Exo1;

public class Captage implements IVolume
{
    protected int idCap;
    protected String nom;
    protected int hauteur;
    protected int debit;

    public Captage(int idCap, String nom, int hauteur, int debit) {
        this.idCap = idCap;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debit = debit;
    }

    public int getIdCap() {
        return idCap;
    }

    public String GetDescription(){
        String desc = this.getNom()+"-"+this.getHauteur()+"metres"+"-"+this.getDebit()+"litres";
        return desc;
    }

    public String getNom() {
        return nom;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getDebit() {
        return debit;
    }

    public double getVolume(){
        return 0;
    }
}
