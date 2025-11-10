package edu.fra.uas.service;

import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
/*Erweitern Sie die Klasse MessageService um eine weitere Variable namens counter vom 
Datentyp Integer. Definieren Sie eine Methode increment, die den Wert der Variablen 
counter jeweils um 1 erhöht. Schreiben Sie dann in einer neuen Methode in der Klasse 
ControllerTest einen entsprechenden Test dazu. */

@Component
public class MessageService {

    private String message; 
    int c = 0 ;

    public void counter() {
    c++ ; }


    private static final Logger log = LoggerFactory.getLogger(MessageService.class);
 
public String getMessage(String message) {
    log.info("Nachricht wird abgerufen: {}", message);
    
return message; 
} 
public void setMessage(String message) { 
    log.info("Neue Nachricht wird gesetzt: {}", message);
    log.debug("Nachricht wurde um folgende Zeit aktualisiert: {}", LocalDateTime.now() );
this.message = message; 
}

}
