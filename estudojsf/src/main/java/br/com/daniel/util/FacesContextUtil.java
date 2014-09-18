package br.com.daniel.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

public class FacesContextUtil {
    private static String HIBERNATE_SESSION = "hibernate_session";

    public static Session getRequestSession() {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }

    public static void setRequestSession(Session session) {
       FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }
    
}
