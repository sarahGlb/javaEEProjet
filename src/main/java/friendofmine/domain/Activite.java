package friendofmine.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Sarah on 27/02/2017.
 */
public class Activite {

    @Size(min=1,max=50)
    @NotNull
    private String unTitre;
    private String unDescriptif;

    public Activite(String unTitre, String unDescriptif) {
        this.unTitre=unTitre;
        this.unDescriptif=unDescriptif;
    }

    public String getUnTitre() {
        return unTitre;
    }

    public String getUnDescriptif() {
        return unDescriptif;
    }
}
