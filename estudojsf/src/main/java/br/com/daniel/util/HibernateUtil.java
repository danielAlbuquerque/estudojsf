package br.com.daniel.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;



public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    static {
        try{
            System.out.println("Tentando configurar a sessionfactory");
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).build();
            
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            System.out.println("Session criada corretamente");
        }catch(Exception ex){
            System.out.println("Ocorreu um erro ao iniciar a session factory " + ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
        
        
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
