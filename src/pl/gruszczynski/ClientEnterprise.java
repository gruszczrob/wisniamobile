package pl.gruszczynski;

public class ClientEnterprise {
    //nieskączonośc kontaktów +
    //Posiada nip +
    //Posiada przedstawiciela +

    String buisnesName;
    String nip;
    String representativeName;
    String representativeSurname;
    Integer contactsNumber;

    private ClientEnterprise(String buisnesName, String nip, String representativeName, String representativeSurname, Integer contactsNumber){
        this.buisnesName = buisnesName;
        this.nip = nip;
        this.representativeName = representativeName;
        this.representativeSurname = representativeSurname;
        this.contactsNumber = contactsNumber;
    }
}
