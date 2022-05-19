package bean;

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
public class HolaMundoAction {
    
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    private String saludo;

    public String execute(){
        log.info("Executing method...");
        this.saludo = "HolaMundoAction from Struts2!";
        return "exito";
    }
    
    
    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
