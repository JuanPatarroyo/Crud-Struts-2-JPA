<%-- 
    Document   : saludos
    Created on : 12/05/2022, 9:58:06 p. m.
    Author     : jpatarroyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <s:textfield name="form.usuario" name="usuario"/>
            <s:password name="form.password" name="password"/>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
        <br/>
        <div>
            <s:text name="form.valores"/><br/>
            <s:property value="formUsuario"/> : <s:property value="usuario"/><br/>
            <s:property value="formPassword"/> : <s:property value="password"/>
        </div>
    </body>
</html>