package net.joastbg.sampleapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="PERSONNE_PHYSIQUE")
public class PersonnePhysique  implements Serializable {

    @Id
    @Column(name = "idCient")
    private int idCient;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateNaissance")
    private Date dateNaissance;
}