package pl.gruszczynski;

import pl.gruszczynski.ClientEnterprise;
import pl.gruszczynski.ClientPrivate;

public class ClientUpdate {

    public ClientEnterprise CreateBuisnesClient(String buisnesName, String nip, String representativeName, String representativeSurname){
        //sprawdzanie nipu
        //sprawdzanie czy nie ma już takiej firmy
        System.out.println("A new private client has been created");
        return new ClientEnterprise(buisnesName, nip, representativeName, representativeSurname);
    }


    //Dodawanie


    public ClientPrivate CreatePrivateClient(String Name, String Surname, String PESEL){
        //sprawdzanie PESELU
        //sprawdzanie czy nie mamy już takiego PESELU
        System.out.println("A new business customer has been created");
        return new ClientPrivate(Name, Surname, PESEL);
    }

    //Usuwanie
}
