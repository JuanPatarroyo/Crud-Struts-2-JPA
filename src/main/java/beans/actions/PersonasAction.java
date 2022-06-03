/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.actions;

import co.com.model.Persona;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jpatarroyo
 */
public class PersonasAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona;
    
    @Override
    public String execute(){
        String impresion = this.persona != null ? "persona: "+persona.toString() : "Persona con valor nulo";
        log.info(impresion);
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
