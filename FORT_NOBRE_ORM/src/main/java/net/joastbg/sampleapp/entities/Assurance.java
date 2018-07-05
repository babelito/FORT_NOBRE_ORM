package net.joastbg.sampleapp.entities;

import net.joastbg.sampleapp.dao.ClientDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ASSURANCE")
public class Assurance  implements Serializable {

    @Id
    @Column(name = "numeroAssurance")
    private int numeroAssurance;

    @Column(name = "typeAssurance")
    private String typeAssurance;

    @Column(name = "dateSouscription")
    private Date dateSouscription;

    @Column(name = "dateAnniversaire")
    private Date dateAnniversaire;

    @Column(name = "datePrevelement")
    private Date datePrevelement;

    @Column(name = "adresseAssure")
    private String adresseAssure;

    @Column(name = "immatriculation")
    private String immatriculation;

    @Column(name = "bonusMalus")
    private int bonusMalus;

    public int getNumeroAssurance() {
        return numeroAssurance;
    }

    public void setNumeroAssurance(int numeroAssurance) {
        this.numeroAssurance = numeroAssurance;
    }

    public String getTypeAssurance() {
        return typeAssurance;
    }

    public void setTypeAssurance(String typeAssurance) {
        this.typeAssurance = typeAssurance;
    }

    public Date getDateSouscription() {
        return dateSouscription;
    }

    public void setDateSouscription(Date dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public Date getDatePrevelement() {
        return datePrevelement;
    }

    public void setDatePrevelement(Date datePrevelement) {
        this.datePrevelement = datePrevelement;
    }

    public String getAdresseAssure() {
        return adresseAssure;
    }

    public void setAdresseAssure(String adresseAssure) {
        this.adresseAssure = adresseAssure;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(int bonusMalus) {
        this.bonusMalus = bonusMalus;
    }
}