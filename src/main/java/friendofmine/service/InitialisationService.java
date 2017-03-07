package friendofmine.service;

import friendofmine.domain.Activite;
import friendofmine.domain.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Sarah on 27/02/2017.
 * Créez la classe «
 service.InitialisationService
 » qui sera annotée @Service, qui
 remplit dans une méthode initDonnees() une ArrayList d’Utilisateur et une ArrayList
 de Activite.
 */
@Service
public class InitialisationService {

    private List<Utilisateur> users= new ArrayList<Utilisateur>();
    private List<Activite> activites= new ArrayList<Activite>();

    public List<Utilisateur> getUsers() {
        return users;
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void initDonnees(){
        Utilisateur util = new Utilisateur("Dupont", "Jeanne", "jd@jd.com", "F");
        Utilisateur util2 = new Utilisateur("Durand", "Jacques", "jd@jd.com", "M");
        Utilisateur util3 = new Utilisateur("Durand", "Jacquo", "jod@jd.com", "M");
        this.users.add(util);
        this.users.add(util2);
        this.users.add(util3);
        Activite act1 = new Activite("unTitre1", "unDescriptif1");
        Activite act2 = new Activite("unTitre2", "unDescriptif2");
        this.activites.add(act1);
        this.activites.add(act2);

    }
}
