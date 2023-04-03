package Tests;

import Entities.Exo2.Formation;
import Entities.Exo2.Participant;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FormationTest
{
    private Formation formation;
    private Formation formation2;

    private Formation formation3;

    private Formation formation4;
    private Participant participant1;
    private Participant participant2;
    private Participant participant3;
    private Participant participant4;
    private Participant participant5;
    @BeforeEach
    void setUp()
    {
        formation = new Formation(1,"Excel", 150);
        formation2=new Formation(2,"Excel", 150);
        formation3=new Formation(3,"Excel", 150);
        formation4=new Formation(4,"Excel", 150);
        participant1 = new Participant(1,"Gand", false, 45);
        participant2 = new Participant(2,"Alison", true, 90);
        participant3 = new Participant(3,"Muller", true, 111);
        participant4 = new Participant(4,"Fortin", false, 17);
        participant5 = new Participant(5,"Cousinot", true, 34);
    }

    @org.junit.jupiter.api.Test
    void getNombreDePresents()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation
        formation.AjouterParticipant(participant1);
        formation.AjouterParticipant(participant2);
        assertEquals(1,formation.GetNombreDePresents());


        // Cas n°2 : on ajoute le reste des participants
        formation.AjouterParticipant(participant3);
        formation.AjouterParticipant(participant4);
        formation.AjouterParticipant(participant5);
        assertEquals(3,formation.GetNombreDePresents());

    }

    @org.junit.jupiter.api.Test
    void calculerFraisRemboursementKilometriques()
    {
        // Cas n°1 : On ajoute les 3 premiers participants à la formation
        formation2.AjouterParticipant(participant1);
        formation2.AjouterParticipant(participant2);
        formation2.AjouterParticipant(participant3);
        assertEquals(379.89,formation2.CalculerFraisRemboursementKilometriques());


        // Cas n°2 : on ajoute le reste des participants
        formation2.AjouterParticipant(participant4);
        formation2.AjouterParticipant(participant5);
        assertEquals(444,15,formation2.CalculerFraisRemboursementKilometriques());

    }

    @org.junit.jupiter.api.Test
    void tauxDePresence()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation
        formation3.AjouterParticipant(participant1);
        formation3.AjouterParticipant(participant2);
        assertEquals(50,formation3.TauxDePresence());

        // Cas n°2 : on ajoute le reste des participants
        formation3.AjouterParticipant(participant3);
        formation3.AjouterParticipant(participant4);
        formation3.AjouterParticipant(participant5);
        assertEquals(60,formation3.TauxDePresence());

    }

    @org.junit.jupiter.api.Test
    void beneficeFormation()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation
        formation4.AjouterParticipant(participant1);
        formation4.AjouterParticipant(participant2);
        assertEquals(-20.1,formation4.BeneficeFormation());

        // Cas n°2 : on ajoute le reste des participants
        formation4.AjouterParticipant(participant3);
        formation4.AjouterParticipant(participant4);
        formation4.AjouterParticipant(participant5);
        assertEquals(5.85,formation4.BeneficeFormation());

    }
}