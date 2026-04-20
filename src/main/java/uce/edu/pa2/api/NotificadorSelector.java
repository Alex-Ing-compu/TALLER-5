package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;
    @Inject
    private NotificadorSMS sms;
    @Inject
    private NotificadorWhatsapp whats;

    public Notificador seleccionar(double total){

         if(total > 120){
            return mail;
         }else if (total < 50) {
            return whats;
         }
          else {
            return sms;
         }
    }

    
}
