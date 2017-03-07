package friendofmine.domain;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Sarah on 27/02/2017.
 */
public class Utilisateur {

    @NotNull
    @Size(min=1,max=50)
    private String nom;
    @NotNull
    @Size(min=1,max=50)
    private String prenom;
    @Email
    @NotNull
    private String mail;
    @Pattern(regexp = "M|F")
    @NotNull
    private String sexe;
    private Date date;


    public Utilisateur(String nom, String prenom, String mail, String sexe, Date date) {

        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.sexe=sexe;
        this.date=date;
    }
    public Utilisateur(String nom, String prenom, String mail, String sexe) {

        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.sexe=sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getSexe() {
        return sexe;
    }
    public Date getDate() {
        return date;

    }

}
