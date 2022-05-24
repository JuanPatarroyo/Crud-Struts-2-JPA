package beans.actions;

import org.apache.logging.log4j.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jpatarroyo
 */
public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludo;

    public String execute(){
        log.info("Executing method...");
        this.setSaludo("HelloWorld from struts2");
        return "exito";
    }
    
    
    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
