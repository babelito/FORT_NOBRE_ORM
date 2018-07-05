package net.joastbg.sampleapp.dao;

import net.joastbg.sampleapp.entities.Client;
import net.joastbg.sampleapp.entities.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientDao {

    @Autowired
    SessionFactory sessionFactory;

    public int persist(Client client){
        Session session = sessionFactory.getCurrentSession();
        int returnID = (int) session.save(client);
        return returnID;
    }

    public List<Client> findAll(){
        Session session = sessionFactory.getCurrentSession();
        return  session.createQuery("from Client").list();
    }

    public int persistContact(Contact contact){
        Session session = sessionFactory.getCurrentSession();
        int returnID = (int) session.save(contact);
        return returnID;
    }
}
