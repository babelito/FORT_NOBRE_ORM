package net.joastbg.sampleapp;

import junit.framework.Assert;
import net.joastbg.sampleapp.dao.ClientDao;
import net.joastbg.sampleapp.entities.Assurance;
import net.joastbg.sampleapp.entities.Client;
import net.joastbg.sampleapp.entities.CompteBancaire;
import net.joastbg.sampleapp.entities.Contact;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/config/BeanLocations.xml")
public class ClientDaoTest {

    @Autowired
    ClientDao clientDao;

    Client client;
    Contact contact;

    @Before
    public void setUp() {
        client = new Client();
        client.setNom("Arthur");

        contact = new Contact();
        contact.setType("Tel");
        contact.setValeur("0628288703");
    }

    @Test
    public void testFindAll(){
        List<Client> clients = clientDao.findAll();
        Assert.assertEquals(clients.get(0).getNom(), "cathy cathou");
    }

    @Test
    public void testPersist(){
        List<Client> clients = clientDao.findAll();
        int returnedId = clientDao.persist(client);
        Assert.assertTrue(returnedId == clients.size() + 1);
    }

    @Test
    public void testContactClient(){
        List<Client> clients = clientDao.findAll();
        Assert.assertEquals("0628288703", clients.get(0).getListContacts().get(0).getValeur());
    }

    @Test
    public void testPersistContact(){
        clientDao.persistContact(contact);
        Contact contact2 = clientDao.findAll().get(0).getListContacts().get(0);
        Assert.assertEquals(contact.getValeur(), contact2.getValeur());
    }


    @Test
    public void testComptesClient(){
        List<Client> clients = clientDao.findAll();
        Assert.assertEquals("BOUSFRPP", clients.get(0).getListeComptes().get(0).getBIC());
    }

    @Test
    public void testGetPrincipal(){
        Client client2 = clientDao.findAll().get(0);
        CompteBancaire comptePrincipal = new CompteBancaire();
        for (CompteBancaire cb : client2.getListeComptes()) {
            if(cb.getPrincipal() == 1){
                comptePrincipal = cb;
            }
        }
        Assert.assertEquals("FR7630006000011234567890189", comptePrincipal.getIban());
    }

}
