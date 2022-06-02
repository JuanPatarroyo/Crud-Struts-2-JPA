/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author jpatarroyo
 */
@Results({
    @Result(name="success",location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location="/WEB-INF/content/login.jsp")
})
public class ValidarUsuarioAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);

    private String usuario;
    private String password;

    @Override
    @Action("validarUsuario")
    public String execute() {
        if (usuario != null && usuario.equals("admin")) {
            addActionMessage(getText("usuario.valido"));
            return SUCCESS;
        }
        return INPUT;
    }
    
    @Override
    public void validate(){
        if(this.usuario == null || "".equals(this.usuario.trim())){
            addFieldError("usuario", getText("usuario.nulo"));
            return;
        }
        if(!usuarioValido()){
            addActionError(getText("usuario.invalido"));
            return;
        }
        if(this.password == null || "".equals(this.password.trim())){
            addFieldError("password", getText("password.nulo"));
            return;
        }
        if(this.password.length() < 5){
            addFieldError("password", getText("password.length"));
        }
    }

    private boolean usuarioValido(){
        return "admin".equals(this.usuario);
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
