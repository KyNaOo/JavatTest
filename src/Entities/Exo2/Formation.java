package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        int i=0;
        int nbparticiant=0;
        // A compléter ici
        for(Participant unparticipant: this.lesParticipants){
            if(unparticipant.isEstPresent()){
                nbparticiant=nbparticiant+1;
            }
            i++;
        }
        return nbparticiant;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        // A compléter ici
        int i=0;
        int nbfrais=0;
        // A compléter ici
        for(Participant unparticipant: this.lesParticipants){
            if(unparticipant.isEstPresent()){
                nbfrais=nbfrais+unparticipant.getNbKm();
            }
            i++;
        }
        return nbfrais*1.89;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence() {
        int i = 0;
        int nbparticiant = 0;
        int total = this.lesParticipants.size();
        // A compléter ici
        for (Participant unparticipant : this.lesParticipants) {
            if (unparticipant.isEstPresent()) {
                nbparticiant = nbparticiant + 1;
                i++;
            }
        }
        return (nbparticiant/total)*100;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        // A compléter ici
        return  (GetNombreDePresents()*this.getPrixFormation())-CalculerFraisRemboursementKilometriques();
    }

    public int getPrixFormation() {
        return prixFormation;
    }
}
