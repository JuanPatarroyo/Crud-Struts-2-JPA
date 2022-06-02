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
        <title><s:text name="form.titulo"/></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        <s:actionerror/>
        <s:form action="validarUsuario">
            <s:textfield name="form.usuario" name="usuario"/>
            <s:password name="form.password" name="password"/>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
    </body>
</html>