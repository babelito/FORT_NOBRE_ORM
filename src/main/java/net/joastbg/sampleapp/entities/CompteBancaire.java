package net.joastbg.sampleapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "COMPTE_BANCAIRE")
public class CompteBancaire  implements Serializable {

    @Id
    @Column(name = "iban")
    private String iban;

    @Column(name = "swift_code")
    private String BIC;


    @Column(name = "proprietaire")
    private String proprietaire;

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    @Column(name = "principal")
    private int principal;

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBIC() {
        return BIC;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }
}
