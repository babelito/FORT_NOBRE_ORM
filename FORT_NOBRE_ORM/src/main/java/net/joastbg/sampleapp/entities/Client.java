package net.joastbg.sampleapp.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {

    @Id
    @Column(name = "idClient")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="COMPTE_CLIENT", joinColumns = @JoinColumn(name="idClient"), inverseJoinColumns = @JoinColumn(name="iban"))
    private List<CompteBancaire> listComptes = new ArrayList();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="CONTACT_CLIENT", joinColumns = @JoinColumn(name="idClient"), inverseJoinColumns = @JoinColumn(name="idContact"))
    private List<Contact> listContacts = new ArrayList();


    public Client(String cNom){
        this.setNom(cNom);
    }

    public Client(){}

    public int getId() {
        return id;
    }

    public List<CompteBancaire> getListeComptes() {
        return listComptes;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addListeComptes(CompteBancaire compte) {
        this.listComptes.add(compte);
    }

    public List<Contact> getListContacts() {
        return listContacts;
    }

    public void addListContacts(Contact contact) {
        this.listContacts.add(contact);
    }
}



