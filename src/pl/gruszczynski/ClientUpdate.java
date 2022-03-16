package pl.gruszczynski;

import pl.gruszczynski.ClientEnterprise;
import pl.gruszczynski.ClientPrivate;

public class ClientUpdate {
    String buisnesName;
    String nip;
    String representativeName;
    String representativeSurname;
    //Dodawanie
    public String AddEnter(String buisnesName, String nip, String representativeName, String representativeSurname){
        this.buisnesName = buisnesName;
        this.nip = nip;
        this.representativeName = representativeName;
        this.representativeSurname = representativeSurname;
        return "Enterprise has been added";
    }
    //Usuwanie
}
