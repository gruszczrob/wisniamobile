package pl.gruszczynski;

import pl.gruszczynski.ClientEnterprise;

import java.math.BigDecimal;

public class Account {
    String name;
    String surname;
    BigDecimal telephone;
    String login;
    String password;
    String buisnaesName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getTelephone() {
        return telephone;
    }

    public void setTelephone(BigDecimal telephone) {
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBuisnaesName() {
        return buisnaesName;
    }

    public void setBuisnaesName(String buisnaesName) {
        this.buisnaesName = buisnaesName;
    }

    //dodawanie
}
