package net.joastbg.sampleapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="PERSONNE_MORALE")
public class PersonneMorale  implements Serializable {

    @Id
    @Column(name = "siren")
    private String siren;

    @Column(name = "nom")
    private String nom;

    @Column(name = "idClient")
    private int idCient;
}