package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int largeur;
    private int longueur;


    public Cuve(int idCap, String nom, int hauteur, int debit, int largeur, int longueur) {
        super(idCap, nom, hauteur, debit);
        this.largeur=largeur;
        this.longueur=longueur;
    }

    public double getVolume(){
        int volume=0;
        volume= this.longueur*this.largeur;
        return volume;
    }

    public String getDescription(){
        String desc = this.getNom()+"-"+this.getHauteur()+"metres"+"-"+this.getDebit()+"litres"+"-"+"longueur"+this.getLongueur()+"-"+"largeur"+this.getLargeur();
        return desc;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }
}
