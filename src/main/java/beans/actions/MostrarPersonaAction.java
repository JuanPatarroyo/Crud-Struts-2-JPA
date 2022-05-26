package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
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
public class MostrarPersonaAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    private String nombre;

    @Override
    public String execute(){
        log.info("Name: "+this.nombre);
        return SUCCESS;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTitulo(){
        return getText("persona.titulo");
    }
    
    public String getValor(){
        return getText("persona.valor");
    }
    
    public String getBoton(){
        return getText("persona.boton");
    }
}
