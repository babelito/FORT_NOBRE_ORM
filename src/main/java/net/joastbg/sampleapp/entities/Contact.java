package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "CONTACT")
public class Contact  implements Serializable {

    @Id
    @Column(name = "idContact")
    private int idContact;

    @Column(name = "typeContact")
    private String type;

    @Column(name = "valeur")
    private String valeur;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public int getIdContact() {
        return idContact;
    }
}
