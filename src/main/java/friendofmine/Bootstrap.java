package friendofmine;

import friendofmine.domain.Activite;
import friendofmine.domain.Utilisateur;
import friendofmine.service.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Sarah on 27/02/2017.
 *
 * Dans le répertoire «
 src/main/java
 », écrire une classe friendsofmine.Bootstrap qui
 est annotée @Component et qui a un atttribut de type InitialisationService obtenu
 par injection de dépendances. La classe Bootstrap définira une méthode init()
 appelant initDonnees() de InitialisationService. Pour assurer que l’initialisation n’a
 lieu qu’une seule fois et au bon moment, on utilisera l’annotation @PostConstruct.
 Pourquoi avoir utilisé @PostConstruct plutôt que d’avoir directement mis un appel à
 initDonnees dans un constructeur de Bootstrap
 ?
 D’après la documentation, quelle différence y-a-t’il entre l’annotation @Component
 et @Service
 ?
 */
@Component
public class Bootstrap {
    @Autowired
   private InitialisationService is;

   @PostConstruct
   public void init(){
       is.initDonnees();
   }

   public List<Utilisateur> getUser(){
       return is.getUsers();
   }

    public List<Activite> getActivite(){
        return is.getActivites();
    }
}

