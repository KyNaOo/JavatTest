package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;


    public Forage(int idCap, String nom, int hauteur, int debit, int diametre) {
        super(idCap, nom, hauteur, debit);
        this.diametre=diametre;
    }

    public double getVolume(){
        int volume ;
        volume=0;
        volume=(int) (Math.PI*this.diametre*this.hauteur);
        return volume;
    }

    public String GetDescription(){
        String desc = this.getNom()+"-"+this.getHauteur()+"metres"+"-"+this.getDebit()+"litres"+"-"+"diametre"+this.getDiametre();
        return desc;
    }

    public int getDiametre() {
        return diametre;
    }
}
