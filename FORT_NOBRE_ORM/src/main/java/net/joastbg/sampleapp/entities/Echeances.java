package net.joastbg.sampleapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="ECHEANCES")
public class Echeances  implements Serializable {

    @Id
    @Column(name = "idEcheance")
    private int idEcheance;

    @Column(name = "prix")
    private int prix;

    @Column(name = "dateEmission")
    private Date dateEmission;

    @Column(name = "datePaiement")
    private Date datePaiement;

    @Column(name = "dateEmissionFacture")
    private Date dateEmissionFacture;
}